package tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * TODO: Búsqueda lineal.
 *
 * Completen los métodos de esta clase. No usen métodos de búsqueda
 * ya hechos de Java (indexOf, contains, streams con filter, etc.):
 * la idea es recorrer la lista "a mano".
 */
public class BuscadorLineal {

    /**
     * Debe recorrer la lista elemento por elemento y devolver el
     * Sospechoso cuyo código coincida con el buscado, o null si no
     * existe ningún sospechoso con ese código.
     *
     * No olviden medir el tiempo con System.nanoTime() y contar cuántas
     * comparaciones hicieron (parte del informe pide esos datos).
     */
    public static Sospechoso buscarPorCodigo(List<Sospechoso> lista, int codigo) {
        int contador = 0;
        for(Sospechoso n : lista){
            contador ++;
            if(n.getCodigo() == codigo){
                System.out.println("Cantidad de iteraciones para encontrar al sospechoso: " + contador);
                return n;}
        }
        throw new NoSuchElementException("no hay ningun sospechoso con ese codigo");
    }

    /**
     * Debe devolver TODOS los sospechosos que sean de la ciudad indicada
     * Y tengan nivelDeRiesgo mayor o igual al indicado. Si no hay ninguno,
     * devolver una lista vacía (no null).
     */
    public static List<Sospechoso> buscarPorCiudadYRiesgoMinimo(List<Sospechoso> lista, String ciudad, int riesgoMinimo) {
        List<Sospechoso> nuevaLista = new ArrayList<>();
        int contador = 0;
        for(Sospechoso n : lista){
            contador ++;
            if(n.getCiudad().equals(ciudad) && n.getNivelDeRiesgo() >= riesgoMinimo){nuevaLista.add(n);}
        }
        System.out.println("Cantidad de iteracciones: " + contador);
        return nuevaLista;
    }
}
