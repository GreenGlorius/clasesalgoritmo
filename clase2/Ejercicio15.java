package clase2;

import java.util.Scanner;
/*Leer un texto y mostrar cuántos caracteres tiene.*/
public class Ejercicio15 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un texto");
        String texto = sc.nextLine();
        //texto.replace(target, replacement) para reemplazar x caracter o texto por otra cosa
        System.out.println(texto.replace(" ", "").length());
     sc.close();
    }
}
