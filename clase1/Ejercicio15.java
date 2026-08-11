package clase1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tus 2 numeros");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		System.out.println("escribe el numero de la operacion que deseas realizar");
		String [] operaciones = {"suma","resta","multiplicación","division"};
		for (int i = 0; i < 4; i++) {
			System.out.println((i+1)+ "." + operaciones[i]);
		}
		int operacionElegida = sc.nextInt();
		if (operacionElegida == 1) {
			System.out.println("su suma da = " + (numero1 + numero2));
		}else if (operacionElegida == 2) {
			System.out.println("su resta da = " + (numero1 - numero2));
		}else if (operacionElegida == 3) {
			System.out.println("su multiplicación da = " + (numero1 * numero2));
		}else if (operacionElegida == 4) {
			System.out.println("su división da = " + (numero1 / numero2));
		}else {
			System.out.println("operacion invalida");
		}
        sc.close();
    }
}
