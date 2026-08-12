package clase2;

import java.util.Scanner;
/*. Leer una palabra y mostrar: 
a.  Primera letra 
b.  Última letra */
public class Ejercicio16 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe una parabra");
        String palabra = sc.next();
        char primera = palabra.charAt(0);
        char ultima = palabra.charAt(palabra.length() - 1);
        System.out.println("Primera: " + primera + ", Última: " + ultima);
        sc.close();
    }
}
