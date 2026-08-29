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
        Arrays.sort(numeros);
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}