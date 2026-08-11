package clase2;

import java.util.Scanner;

/*Operadores y precedencia. Leer tres números y mostrar el resultado de:
a. a + b * c
b. (a + b) * c
c. a * b + c / a 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Escribe 3 numeros");
     double A = sc.nextDouble();
     double B = sc.nextDouble();
     double C = sc.nextDouble();
     System.out.println(A + B*C);
     System.out.println((A + B)*C);
     System.out.println(A*B + C/A);
     sc.close();
    }
}
