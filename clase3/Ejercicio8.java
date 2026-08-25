package clase3;

import java.util.ArrayList;
import java.util.Scanner;

/*8. Repetir  el  ejercicio  anterior,  utilizando  un  Array  dinámico  (ArrayList).  Para  esto,  leer 
números escritos por el usuario hasta que escriba 0.  */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0, positivos = 0, negativos = 0;
        System.out.println("Escriba numeros (0 para terminar)");
        while(true){
            int numero = sc.nextInt();
            if(numero == 0){
                break;
            }
            numeros.add(numero);
            if(numero > 0){
                positivos ++;
            }
            if(numero < 0){
                negativos ++;
            }
            suma += numero;
        }
        if(numeros.isEmpty()){
            System.out.println("No se ingresaron numeros");
            sc.close();
            return;
        }
        int mayorPos = 0, menorPos = 0;
        for(int i = 1; i < numeros.size(); i++){
            if(numeros.get(i) > numeros.get(mayorPos)){
                mayorPos = i;
            }
            if(numeros.get(i) < numeros.get(menorPos)){
                menorPos = i;
            }
        }
        System.out.println("la suma de todos los numeros da = " + suma);
        System.out.println("El promedio es de: " + ((double) suma / numeros.size()));
        System.out.println("Hay " + positivos + " positivos, y hay " + negativos + " negativos");
        System.out.println("El numero mayor es: " + numeros.get(mayorPos) + " y su posicion es la " + mayorPos);
        System.out.println("El numero menor es: " + numeros.get(menorPos) + " y su posicion es la " + menorPos);
        sc.close();
    }
}
