package clase1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la profundidad que quieres para tu ropero");
		double B = sc.nextDouble();
		System.out.println("Dime la altura de tu habitacion");
		double A = sc.nextDouble();
		double alturaMaxima = Math.sqrt(Math.pow(A, 2) - Math.pow(B, 2));
		if (Double.isNaN(alturaMaxima)) {
		    System.out.println("Profundidad incorrecta (supera la altura del techo).");
		} else {
		    System.out.println("La altura maxima de su ropero es de " + alturaMaxima);
		}
        sc.close();
    }
}
