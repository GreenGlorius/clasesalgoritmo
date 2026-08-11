package clase1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero entero y te dire si es positivo o negativo");
		int num = sc.nextInt();
			if(num > 0) {
				System.out.println(num + " es positivo");
			} else if(num < 0) {
				System.out.println(num + " es negativo");
			} else{
				System.out.println("es cero");
			}
        sc.close();
    }
}
