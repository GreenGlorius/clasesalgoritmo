package clase3;

import java.util.Scanner;
/*pedir al usuario una frase y luego una letra. Luego indicar: 
a. Si la frase contiene a esa letra. 
b. Posición de la primera aparición de la letra en la frase. 
c. Posición de la última aparición de la letra en la frase. */
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba una frase y luego una letra");
        String texto = sc.nextLine();
        char letra = sc.next().charAt(0);
        int primerAparicion  = 0;
        int ultimaAparicion = 0;
        for(int i = 0; i < texto.length(); i++){
            char letraActual = texto.charAt(i);
            if(letraActual == letra){
                if(i < primerAparicion || primerAparicion == 0){
                    primerAparicion = i + 1;
                }
                if(i > ultimaAparicion || ultimaAparicion == 0){
                    ultimaAparicion = i + 1;
                }
            }
        }
        System.out.println("la primera vez que aparece tu letra es en la posicion: " + primerAparicion + ", y la ultima vez que aparece es en la posicion: " + ultimaAparicion);
        sc.close();
    }
}
