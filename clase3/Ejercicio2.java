package clase3;

import java.util.Scanner;
/*Contar vocales.  Leer una frase y mostrar cuántas vocales contiene, considerando tanto 
mayúsculas como minúsculas. */
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba su texto");
        String texto = sc.nextLine().trim();
        int cantidadVocales = texto.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]", "").length();
        System.out.println("tu texto tiene " + cantidadVocales + " vocales");
        sc.close();
    }
}
