package clase2;

import java.util.Scanner;
/*Leer un número entero (N) y mostrar los primeros N elementos de una secuencia de 
Fibonacci */
public class Ejercicio24 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números de la secuencia de fibonacci quiere ver?");
        int numeros = sc.nextInt();
        
        if (numeros <= 0) {
            System.out.println("Ingrese un número mayor a 0");
            sc.close();
            return;
        }
        System.out.println("Los primeros " + numeros + " números de Fibonacci son:");
        for (int i = 0; i < numeros; i++) {
            System.out.print(fibonacci(i));
            if (i < numeros - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        sc.close();
    }
}
