package clase2;

import java.util.Scanner;
/*Crear un array de Strings. 
a.  Inicializar cada elemento a partir de palabras escritas por el usuario 
b.  Mostrar la lista de palabras en el array 
c.  Crear un array de enteros a partir del array de Strings, donde cada elemento del 
array de enteros corresponde al número de caracteres de cada elemento en el 
array de Strings. */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba 5 palabras");
        String[] palabras = {sc.next(),sc.next(),sc.next(),sc.next(),sc.next()};
        for(int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }
        int[] enteros = new int[5];
        for(int i = 0; i < enteros.length; i++){
            enteros[i] = palabras[i].length();
        }
        for(int i = 0; i < enteros.length; i++){
            System.out.println(enteros[i]);
        }
        sc.close();
    }
}