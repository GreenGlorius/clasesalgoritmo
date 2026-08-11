package clase1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe las edades de 3 personas y te dire si pueden viajar y si todos pueden subir al juego que quieren juntos");
		int edad1 = sc.nextInt();
		int edad2 = sc.nextInt();
		int edad3 = sc.nextInt();
		if (edad1 > 18 || edad2 > 18 || edad3 > 18) {
			System.out.println("pueden viajar");
		}else {
			System.out.println("no pueden viajar");
		} if (edad1 > 18 && edad2 > 18 && edad3 > 18) {
			System.out.println("todos pueden subir al juego");
		}
        sc.close();
    }
}
