package clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*13. Crear  un  array  con  varias  palabras  (no  solicitar  del  usuario  para  crear  el  array).  Luego 
solicitar una palabra al usuario e indicar 
a. Si la palabra está en el array. 
b. Cuantas veces aparece. 
c. En que posiciones aparece */
public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] palabras = {"hola", "mundo", "hola", "chau"};
        System.out.print("ingrese una palabra: ");
        String palabra = sc.next();
        System.out.println();

        boolean aparece = false;
        int contador = 0;
        List<Integer> posiciones = new ArrayList<>();

        for(int i = 0; i < palabras.length; i++){
            if(palabra.toLowerCase().equals(palabras[i])){
                aparece = true;
                posiciones.add(i);
                contador++;
            }
        }
        if(aparece == true){
            System.out.print("La palabra está en el array y aparece " + contador + " veces");
            if(posiciones.size() > 1){
                System.out.print(" en las posiciones: ");
                for(int i = 0; i < posiciones.size(); i++){
                    System.out.print(posiciones.get(i) + ", ");
                }
            }else{
                System.out.print(" en la posicion" + posiciones.get(0));
            }
        }
        sc.close();
    }
}