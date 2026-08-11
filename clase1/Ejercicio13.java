package clase1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime los partidos ganados,empatados y perdidos de tu equipo en orden y te diré cuantos puntos tiene");
		int ganados = sc.nextInt();
		int empatados = sc.nextInt();
		int perdidos = sc.nextInt();
		int puntos = ganados * 3 + empatados * 1;
		System.out.println("tu equipo tiene: " + puntos + " puntos");
		if (perdidos > 0) {
			System.out.println("JAJAJ tu equipo perdio " + perdidos + " partidos");
		}
        sc.close();
    }
}
