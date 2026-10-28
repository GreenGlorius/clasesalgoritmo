import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] lista = { 38, 27, 43, 3, 9, 82 };
		/*
		 * int[] lista = new int[100]; for(int i=0;i<100;i++) { lista[i] =
		 * (int)(Math.random() * 10001); } /
		 **/

		ver(lista);
		mergeSort(lista);
		// burbuja(lista);
		ver(lista);
	}

	private static void mergeSort(int[] lista) {

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
				if (L[punteroLeft] < R[punteroRight]) {
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

	private static void ver(int[] lista) {
		System.out.println("------------------------");
		for (int x : lista) {
			System.out.println(x);
		}
	}
}
