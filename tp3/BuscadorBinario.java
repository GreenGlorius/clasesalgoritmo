package tp3;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Búsqueda binaria.
 *
 * PRE-CONDICIÓN OBLIGATORIA: la lista que reciben estos métodos debe
 * estar ordenada por código (ascendente). Si no lo está, el resultado
 * no tiene ningún sentido, aunque el código "corra" sin errores.
 *
 * No usen Arrays.binarySearch ni Collections.binarySearch: hay que
 * implementarla a mano, con low/high/medio.
 */
public class BuscadorBinario {
    public static ArrayList<Sospechoso> sort(List<Sospechoso> lista) {
        ArrayList<Sospechoso> ordenada = new ArrayList<>();
        if (lista == null) {return ordenada;}

        for (Sospechoso sospechoso : lista){ordenada.add(sospechoso);}

        if (ordenada.size() <= 1) {return ordenada;}

        mergeSort(ordenada, 0, ordenada.size() - 1);
        return ordenada;
    }
    private static void mergeSort(ArrayList<Sospechoso> lista, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        int medio = inicio + (fin - inicio) / 2;
        mergeSort(lista, inicio, medio);
        mergeSort(lista, medio + 1, fin);
        merge(lista, inicio, medio, fin);
    }

    private static void merge(ArrayList<Sospechoso> lista, int inicio, int medio, int fin) {
        ArrayList<Sospechoso> izquierda = new ArrayList<>();
        ArrayList<Sospechoso> derecha = new ArrayList<>();

        for (int i = inicio; i <= medio; i++) {
            izquierda.add(lista.get(i));
        }

        for (int j = medio + 1; j <= fin; j++) {
            derecha.add(lista.get(j));
        }

        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i).compareTo(derecha.get(j)) <= 0) {
                lista.set(k, izquierda.get(i));
                i++;
            } else {
                lista.set(k, derecha.get(j));
                j++;
            }
            k++;
        }

        while (i < izquierda.size()) {
            lista.set(k, izquierda.get(i));
            i++;
            k++;
        }

        while (j < derecha.size()) {
            lista.set(k, derecha.get(j));
            j++;
            k++;
        }
    }
    /**
     * Búsqueda binaria iterativa. Devuelve el Sospechoso si el código
     * existe en la lista, o null si no existe.
     *
     * Recuerden medir tiempo y contar comparaciones para el informe.
     */
    public static Sospechoso buscarPorCodigo(List<Sospechoso> listaOrdenada, int codigo) {
        if (listaOrdenada == null || listaOrdenada.isEmpty()) {
            return null;
        }

        int low = 0;
        int high = listaOrdenada.size() - 1;

        while (low <= high) {
            int medio = low + (high - low) / 2;
            Sospechoso sospechoso = listaOrdenada.get(medio);
            int codigoActual = sospechoso.getCodigo();

            if (codigoActual == codigo) {
                return sospechoso;
            }
            if (codigoActual < codigo) {
                low = medio + 1;
            } else {
                high = medio - 1;
            }
        }

        return null;
    }

    /**
     * Desafío: la misma búsqueda binaria, pero recursiva en vez de iterativa.
     */
    public static Sospechoso buscarPorCodigoRecursiva(List<Sospechoso> listaOrdenada, int codigo) {
        return buscarPorCodigoRecursiva(listaOrdenada, codigo, 0, listaOrdenada == null ? -1 : listaOrdenada.size() - 1);
    }

    private static Sospechoso buscarPorCodigoRecursiva(List<Sospechoso> listaOrdenada, int codigo, int low, int high) {
        if (listaOrdenada == null || listaOrdenada.isEmpty() || low > high) {
            return null;
        }

        int medio = low + (high - low) / 2;
        Sospechoso sospechoso = listaOrdenada.get(medio);
        int codigoActual = sospechoso.getCodigo();

        if (codigoActual == codigo) {
            return sospechoso;
        }
        if (codigoActual < codigo) {
            return buscarPorCodigoRecursiva(listaOrdenada, codigo, medio + 1, high);
        }
        return buscarPorCodigoRecursiva(listaOrdenada, codigo, low, medio - 1);
    }

    /**
     * El "giro final" del TP: si el código no existe, en vez de solo decir
     * "no encontrado", este método debe devolver el sospechoso cuyo código
     * es el más cercano por abajo al buscado (el último candidato antes de
     * que la búsqueda se quede sin rango). Si no hay ninguno más chico,
     * devolver null.
     *
     * Pista: piensen qué vale la variable "low" o "high" en el momento
     * exacto en que el bucle de la búsqueda binaria termina sin encontrar
     * el valor.
     */
    public static Sospechoso buscarMasParecidoSiNoExiste(List<Sospechoso> listaOrdenada, int codigo) {
        if (listaOrdenada == null || listaOrdenada.isEmpty()) {
            return null;
        }

        int low = 0;
        int high = listaOrdenada.size() - 1;
        int indiceMasCercano = -1;

        while (low <= high) {
            int medio = low + (high - low) / 2;
            Sospechoso sospechoso = listaOrdenada.get(medio);
            int codigoActual = sospechoso.getCodigo();

            if (codigoActual == codigo) {
                return sospechoso;
            }
            if (codigoActual < codigo) {
                indiceMasCercano = medio;
                low = medio + 1;
            } else {
                high = medio - 1;
            }
        }

        if (indiceMasCercano == -1) {
            return null;
        }

        return listaOrdenada.get(indiceMasCercano);
    }

}
