package clase3;
/*Leer un array: 
a. Mostrar sus elementos en orden inverso. 
Original: 
1 2 3 4 5 
 
Invertido: 
5 4 3 2 1 
b. Crear un segundo array que contenga los elementos invertidos */
public class Ejercicio10 {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosInverso = new int[5];
        for(int i = numeros.length-1, x = 0; i > -1 && x < numeros.length; i--, x++){
            System.out.println(numeros[i]);
            numerosInverso[x] = numeros[i];
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + "|" + numerosInverso[i]);
        }
    }
}
