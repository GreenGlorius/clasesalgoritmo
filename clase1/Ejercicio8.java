package clase1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 2 numeros y te dire si su paridad es distinta o no");
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A % 2 == 0 && B % 2 == 1 || B % 2 == 0 && A % 2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
        sc.close();
    }
}
