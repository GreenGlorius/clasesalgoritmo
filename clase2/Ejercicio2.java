package clase2;

import java.util.Scanner;
/*Tipos y casting. Leer un número entero y uno decimal, y mostrar:
a. suma
b. división
c. resultado convertido a entero 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero y uno decimal usando el formato x,x no x.x:");
        int A = sc.nextInt();
        double B = sc.nextDouble();

        double suma = A + B;
        double division = A / B;

        int sumaInt = (int) suma;
        int divisionInt = (int) division;

        System.out.println("La suma da: " + suma + " la division da: " + division + " Suma en entero / division en entero: " + sumaInt + "|" + divisionInt);
        sc.close();
    }
}