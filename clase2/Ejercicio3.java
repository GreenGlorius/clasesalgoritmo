package clase2;

import java.util.Scanner;
/* Leer dos números enteros y mostrar el resultado de su división utilizando:
a. El tipo int en la variable resultado
b. El tipo double en la variable resultado
c. El tipo double en la variable resultado, haciendo casting explícito del numerador */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 2 numeros enteros:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int resultadoInt = A / B;
        double resultadoDouble = A / B;
        double resultadoDoubleCastNumerador = (double) A / B;

        System.out.println("Resultado int: " + resultadoInt);
        System.out.println("Resultado double (int / int luego convertido): " + resultadoDouble);
        System.out.println("Resultado double con casting explicito del numerador: " + resultadoDoubleCastNumerador);
        sc.close();
    }
}
