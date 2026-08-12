package clase2;

import java.util.Scanner;
import java.util.ArrayList;
/*Mayor número. Leer varios números hasta ingresar -1. Luego, mostrar el número mayor. 
Hacer una prueba de escrito */
public class Ejercicio12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numeros hasta ingresar un -1");
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        int mayor = 0;
        while((numero = sc.nextInt()) != -1){
            numeros.add(numero);
        }
        for(int i = 0; i < numeros.size(); i++){
            if(mayor < numeros.get(i)){
                mayor = numeros.get(i);
            }
        }
        System.out.println("el mayor numero ingresado es: " + mayor);
        sc.close();
    }
    
}
