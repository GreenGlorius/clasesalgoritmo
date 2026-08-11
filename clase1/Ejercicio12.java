package clase1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud de los 3 lados de un triangulo y te dire que tipo de triangulo es");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("su triangulo es equilatero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("su triangulo es isoseles");
		}else {
			System.out.println("su triangulo es escaleno");
		}
        sc.close();
    }
}
