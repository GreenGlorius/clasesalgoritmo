package clase2;

import java.util.Scanner;
/*Leer una frase y contar cuántas vocales tiene. */
public class Ejercicio18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        int contadorVocales = 0;
        for(int i = 0; i < frase.length(); i++){
            char ch = Character.toLowerCase(frase.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("la frase tiene " + contadorVocales + " vocales");
        sc.close(); 
    }
}
