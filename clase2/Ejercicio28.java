package clase2;

import java.util.Scanner;
/*Leer un número entero positivo impar N. Calcular el factorial doble de ese número. El 
factorial doble se define como el producto de todos los números naturales impares 
desde 1 hasta algún número natural impar N. Por ejemplo, el doble factorial de 5 es: 5! = 
1 * 3 * 5 = 15. Mostrar el resultado por consola. Permitir al usuario seguir calculando el 
factorial doble hasta que decida salir del programa. */
public class Ejercicio28 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Escriba un numero positivo impar (o escriba un numero negativo para salir):");
            int N = sc.nextInt();
            if(N < 0){
                break;
            }
            if(N % 2 == 1 && N > 0){
                long resultado = calcularFactorialDoble(N);
                System.out.println("Factorial doble de " + N + " es: " + resultado);
            } else {
                System.out.println("numero invalido, debe ser positivo e impar");
            }
        }
        sc.close();
    }
    public static long calcularFactorialDoble(int N){
        if(N <= 1){
            return 1;
        }
        return N * calcularFactorialDoble(N - 2);
    }
}
