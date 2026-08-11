package clase1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos cigarrillos fuma?");
		double cantidadC = sc.nextDouble();
		System.out.println("Cuantos años lleva fumando?");
		double tiempoC = sc.nextDouble() * 365;
		double cantidadTotal = cantidadC * tiempoC;
		double tiempoX = ((cantidadTotal * 10) /60)/24;
			System.out.println("La cantidad de Dias de vida perdidos son de " + tiempoX);
        sc.close();
    }
}
