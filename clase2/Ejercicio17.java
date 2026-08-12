package clase2;

import java.util.Scanner;
/*Leer dos palabras y mostrar por consola si son iguales (true) o no (false) */
public class Ejercicio17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la primer palabra");
        String palabra = sc.next();
        System.out.println("Escriba la 2da palabra");
        String palabra2 = sc.next();
        if (palabra.equalsIgnoreCase(palabra2)){
            System.out.println("iguales");
        }
        sc.close();
    }
}
