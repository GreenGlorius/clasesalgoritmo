package clase1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la calificacion del alumno con el formato x,xx y te dire su estado segun la nota");
		double calificacion = sc.nextDouble();
		if(calificacion < 6 && calificacion >= 0) {
			System.out.println("el estado del alumno es DESAPROBADO");
		}else if (6 >= calificacion || calificacion <= 7) {
			System.out.println("el estado del alumno es Aprobado");
		}else if (8 >= calificacion || calificacion < 10) {
			System.out.println("el estado del alumno es Bueno");
		}else if (calificacion == 10) {
			System.out.println("el estado del alumno es Exelente");
		}else {
			System.out.println("la calificacion no es posible profe");
		}
        sc.close();
    }
}
