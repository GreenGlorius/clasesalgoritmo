package clase3;
import java.util.Arrays;
/*Leer un array de números.  
a. Indicar cuáles son los valores que aparecen más de una vez. 
Array: 
4 2 7 4 8 2 4 
 
Resultado: 
4 aparece 3 veces 
2 aparece 2 veces 
b. Eliminar los elementos repetidos y volver a mostrar el array. */
public class Ejercicio11 {
    public static void main(String[] args){    
        int[] numeros = {4, 2, 7, 4, 8, 2, 4};
        boolean[] comprobado = new boolean[numeros.length];
        for(int i = 0; i < numeros.length; i++){
            int contador = 1;
            for(int j = i+1; j < numeros.length; j++){
                if(numeros[i] == numeros[j] && comprobado[j] != true){
                    comprobado[j] = true;
                    contador++;   
                }
            }
            if(contador > 1){
                System.out.println("aparece " + contador + " veces el numero: " + numeros[i]);
            }
        }
        int contador = 0;
        for(int i = 0; i < numeros.length; i++){
            if(comprobado[i] != true){
                contador++;
            }
        }
        int[] numerosNR = new int[contador];
        for(int i = 0; i < numerosNR.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(comprobado[j] != true){
                    comprobado[j] = true;
                    numerosNR[i] = numeros[j];
                    break;
                }
            }
        }
        for(int i = 0; i < numerosNR.length; i++){
            System.out.print(numerosNR[i] + "  ");
        }
    }
}