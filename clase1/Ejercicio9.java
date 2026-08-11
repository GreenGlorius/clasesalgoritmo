package clase1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu edad y te dire si puedes votar y si eres mayor o menor de edad");
		int edad = sc.nextInt();
		if(edad > 15) {
			System.out.println("puede votar");
		} if (edad < 18) {
			System.out.println("es menor de edad");
		} else {
			System.out.println("es mayor de edad");
		}
        sc.close();
    }
}
