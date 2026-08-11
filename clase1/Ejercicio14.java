package clase1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe cuantas kills, muertes y asistencias lograste esta partida para saber tu KDA");
		double kills = sc.nextDouble();
		double deaths = sc.nextDouble();
		double assists = sc.nextDouble();
		double kda;
		if (deaths == 0) {
			kda = kills + assists;
		}else {
			kda = (kills + assists)/deaths;
		}
		System.out.println("tu KDA es de: " + kda);
        sc.close();
    }
}
