package clase2;

import java.util.Scanner;
/* Leer números hasta que el usuario ingrese 0. Luego mostrar:
a. Suma total
b. Cantidad de números ingresados*/
public class Ejercicio10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba numeros: ");
        int n;
        int suma = 0;
        int contador = 0;
        while ((n = sc.nextInt()) != 0) {
            suma += n;
            contador++;
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de numeros ingresados: " + contador);
        sc.close();
    }
}
