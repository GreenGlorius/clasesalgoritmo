package clase1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("escriba 2 numeros enteros y te dire cual es mayor");
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) {
			System.out.println(A);
		} else if(A < B) {
			System.out.println(B);
		} else {
			System.out.println("son iguales");
		}
        sc.close();
    }
}
