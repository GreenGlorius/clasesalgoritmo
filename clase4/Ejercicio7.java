package clase4;

import java.util.Scanner;

/*Función de búsqueda: 
a.  Crear  una  función  que  indique  si  un  determinado  carácter  aparece  dentro  del 
texto: 
boolean contiene(String texto, char caracter) 
 
b.  Luego crear otra función llamada primeraPosición que retorne la posición de la 
primera aparición del caracter: 
int primeraPosicion(String texto, char caracter) 
 
c.  Se puede utilizar como base el ejercicio 4 de la Lista Nº3 */

public class Ejercicio7 {
    public static boolean charInText(String text, char character){
        for(int i = 0; i<text.length();i++){
            if(text.toLowerCase().charAt(i) == character){
                return true;
            }
        }
        return false;
}

public static int firstPositionChar(String text, char character){
    int firstPosition = 0;
        for(int i = 0; i < text.length();i++){
            if(text.toLowerCase().charAt(i) == 'a'){
                firstPosition = i;
            }
        }
    return firstPosition;
}
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba una frase y luego una letra");
        String texto = sc.nextLine();
        char letra = sc.next().charAt(0);
        if(charInText(texto, letra)){
        System.out.println("La letra " + letra + " está en el texto en la posicion " + firstPositionChar(texto, letra));
        }
        sc.close();
    }
}
