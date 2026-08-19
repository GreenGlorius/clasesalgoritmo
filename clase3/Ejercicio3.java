package clase3;

import java.util.Scanner;
/*Contar  cada  vocal.  Modificar  el  ejercicio  anterior  para  mostrar  cuántas  veces  aparece 
cada vocal. */
public class Ejercicio3 {
    public static void main (String[] args){
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        for(int x = 0; x < texto.length(); x++){
            char letra = texto.charAt(x);
            if(letra == 'a' || letra == 'A'){
                a++;
            }else if(letra == 'e' || letra == 'E'){
                e++;
            }else if(letra == 'i' || letra == 'I'){
                i++;
            }else if(letra == 'o' || letra == 'O'){
                o++;
            }else if(letra == 'u' || letra == 'U'){
                u++;
            }
        }
        System.out.println("tu texto tiene " + a + " letras A, " + e + " letras B, " + i + " letras I, " + o + " letras O, " + u + " letras U.");
        sc.close();
    }
}
