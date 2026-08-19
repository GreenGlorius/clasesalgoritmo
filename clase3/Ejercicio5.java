package clase3;

import java.util.Scanner;
/*Palíndromo. Leer una palabra y determinar si es un palíndromo:  */
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String palabra = sc.next();
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo == true){
            System.out.println("es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
        sc.close();
    }
}
