package clase3;

import java.util.Scanner;
/*Contar caracteres.  Leer un texto y mostrar: 
a. Cantidad total de caracteres 
b. Cantidad de espacios  */
public class Ejercicio1 {
    public static void main (String[] args){
        System.out.println("ingrese texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int cantidadCaracteres = texto.replace(" ", "").length();
        int cantidadEspacios = texto.replaceAll("[^ ]","").length();
        System.out.println("total de caracteres: " + cantidadCaracteres + " Cantidad de espacios: " + cantidadEspacios);
        sc.close();
    }
}
