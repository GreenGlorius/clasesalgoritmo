package clase4;

import java.util.Scanner;

/*3.  Refactorización*: 
a.  Tomar el ejercicio 15 de la Lista Nº1, correspondiente al menú de operaciones. 
Refactorizarlo de manera que cada operación sea realizada mediante una 
función: 
sumar(...) 
restar(...) 
multiplicar(...) 
dividir(...) 
b.  El main deberá encargarse principalmente de la interacción con el usuario y 
de decidir qué operación realizar */
public class Ejercicio3 {
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tus 2 numeros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		System.out.println("escribe el numero de la operacion que deseas realizar");
		String [] operaciones = {"suma","resta","multiplicación","division"};
		for (int i = 0; i < 4; i++) {
			System.out.println((i+1)+ "." + operaciones[i]);
		}
		int operacionElegida = sc.nextInt();
		if (operacionElegida == 1) {
			System.out.println(sumar(numero1, numero2));
		}else if (operacionElegida == 2) {
			System.out.println(restar(numero1, numero2));
		}else if (operacionElegida == 3) {
			System.out.println(multiplicar(numero1, numero2));
		}else if (operacionElegida == 4) {
			System.out.println(dividir(numero1, numero2));
		}else {
			System.out.println("operacion invalida");
		}
        sc.close();
    }
}
