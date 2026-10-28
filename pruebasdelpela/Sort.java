package pruebasdelpela;
public class Sort {
	public static void main(String[] args) {
		System.out.println("Iniciando....");
		int[] edades = new int[4];
		for(int i = 0;i < 4; i++) {
			edades[i] = (int)(Math.random() * 101);
		}
		show(edades);
		bubble(edades);
		//insertion(edades);
		show(edades);

	}
	
	public static void show(int[] list) {
		System.out.println("--------------------");
		for (int element : list) {
			System.out.println(element);
		}		
	}
	
	public static void bubble(int[] list) {
		//Método standar
		for(int i=0; i<list.length - 1; i++) {
			for(int j=0; j<list.length - i - 1; j++) {
				if(list[j] > list[j+1]) {
					//swap
					int aux = list[j];
					list[j] = list[j+1];
					list[j+1] = aux;
				}
			}
		}
		/**/
		/*for(int k=0;k<list.length - 1; k++) {
			if(list[k] > list[k+1]) {
				//swap
				int aux = list[k];
				list[k] = list[k+1];
				list[k+1] = aux;
				k = -1;
			}			
		}/**/
	}
	public static void insertion(int[] list) {
		for(int step=1; step<list.length;step++) {
			int key = list[step];
			int j = step - 1;
			while(j >= 0 && key < list[j]) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = key;
		}
	}

}