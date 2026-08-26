package clase4;

import java.util.Scanner;

/*6.  Procesamiento de Strings*: 
a.  Crear las siguientes funciones: 
int contarVocales(String texto) 
boolean esPalindromo(String texto) 
 
b.  Desde main, solicitar un texto al usuario y utilizar las funciones correspondientes */
public class Ejercicio6 {
    public static int contarVocales(String palabra){
        int contador = 0;
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.toLowerCase().charAt(i) == 'a' || palabra.toLowerCase().charAt(i) == 'e' || palabra.toLowerCase().charAt(i) == 'i' || palabra.toLowerCase().charAt(i) == 'o' || palabra.toLowerCase().charAt(i) == 'u'){
                contador ++;
            }
        }
        return contador;
    }

    public static boolean palindromo(String palabra){
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        return esPalindromo;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String palabra = sc.next();
        System.out.println("tiene " + contarVocales(palabra) + " vocales");
        if(palindromo(palabra) == true){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        sc.close();
    }
}
