package clase1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.println("Ecriba el primer numero: ");
	double A = sc.nextDouble();
		System.out.println("Ahora escriba el segundo numero: ");
	double B = sc.nextDouble();
		System.out.println("Solo te falta escribir el tercero: ");
	double C = sc.nextDouble();
	double suma = A + B + C;
	double multiplicacion = A * B * C;
	double potenciaAB = Math.pow(A,B);
	double divisionAB = A/B;
	double hipotenusa = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
		System.out.println("La suma de los 3 numeros es: " + suma);
		System.out.println("La multiplicación los tres numeros es: " + multiplicacion);
		System.out.println("El resultado de "+ A + "^" + B +  "es: " + potenciaAB);
		System.out.println("La división de "+ A +"/"+ B + " es: " + divisionAB);
		System.out.println("La hipotenusa sería: " + hipotenusa);
        sc.close();
    }
}
