import java.util.ArrayList;

public class MergeSortEquipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Equipo> equipos = new ArrayList<>();

		Equipo equipo1 = new Equipo("Boca", 12, 10, 4); // DG 6
		Equipo equipo2 = new Equipo("River", 12, 8, 3); // DG 5
		Equipo equipo3 = new Equipo("Racing", 10, 7, 6);
		Equipo equipo4 = new Equipo("Independiente", 12, 10, 5); // DG 5
		Equipo equipo5 = new Equipo("San Lorenzo", 9, 6, 6);

		equipos.add(equipo1);
		equipos.add(equipo2);
		equipos.add(equipo3);
		equipos.add(equipo4);
		equipos.add(equipo5);

		mostrarLista(equipos);
		// burbujaTradicional(equipos);
		mergeSort(equipos);
		mostrarLista(equipos);
	}

	public static void mostrarLista(ArrayList<Equipo> lista) {
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).mostrarEquipo();
			;
		}
		System.out.println();
	}

	private static void mergeSort(ArrayList<Equipo> lista) {

		if (lista.length > 1) {
			// FASE de dividir el array en 2 partes

			// middle es el puntero donde el array es dividido en 2 subarrays
			int middle = lista.length / 2;
			int[] L = Arrays.copyOfRange(lista, 0, middle); // mitad izquierda
			int[] R = Arrays.copyOfRange(lista, middle, lista.length); // mitad derecha

			// Subdividir las 2 mitades
			// System.out.println("left: ");
			// ver(L);
			mergeSort(L);
			// System.out.println("right: ");
			// ver(R);
			mergeSort(R);

			// FASE de hacer el merge de los subarrays
			// necesitamos 3 variables para señalar indices del array:
			// 2 para para ir señalando elementos en los subarrays (mitades)
			// y un 3ro para usar con el array combinado resultante
			int punteroLeft = 0, punteroRight = 0, punteroCombinado = 0;
			// Recorrer tanto el subarrays L como R hasta alcanzar el final de alguno
			// de ellos. Compara el elemento de L contra el de R y reubicar en el
			// array general (llamado lista que viene por parámetro)
			while (punteroLeft < L.length && punteroRight < R.length) {
				if (L[punteroLeft] < R[punteroRight]) { // reemplazar por metodo 'losTresCriterios'
					lista[punteroCombinado] = L[punteroLeft];
					punteroLeft += 1;
				} else {
					lista[punteroCombinado] = R[punteroRight];
					punteroRight += 1;
				}
				punteroCombinado += 1;
			}
			// Pasamos los restantes elemenos de L al array general
			// (en el caso que R tenga menos elementos que L)
			while (punteroLeft < L.length) {
				lista[punteroCombinado] = L[punteroLeft];
				punteroLeft += 1;
				punteroCombinado += 1;
			}
			// Lo mismo que lo anterior pero si R tenía más elementos que L
			while (punteroRight < R.length) {
				lista[punteroCombinado] = R[punteroRight];
				punteroRight += 1;
				punteroCombinado += 1;
			}
		}
	}

	public static boolean losTresCriterios(Equipo eL, Equipo eR) {
		return ;
	}
	
	public static boolean tieneMasPuntos(Equipo eL, Equipo eR) {
		return ;
	}
	
	public static boolean tieneMasDifGol(Equipo eL, Equipo eR) {
		return ;
	}
	
	public static boolean tieneMasGolFavor(Equipo eL, Equipo eR) {
		return ;
	}
	
}
