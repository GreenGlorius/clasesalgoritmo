package clase1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero entero y te dire si es par o impar:");
		int num2 = sc.nextInt();
		if(num2 % 2 == 0) {
			System.out.println("Su numero es par");
		} else if(num2 % 2 == 1) {
			System.out.println("Su numero es impar");
		}
        sc.close();
    }
}
