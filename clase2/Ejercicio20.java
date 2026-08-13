package clase2;
/*Crear e inicializar (al mismo tiempo) un array con 5 números enteros. Luego, mostrar los 
5 números por consola a partir del array creado */
public class Ejercicio20 {
    public static void main (String[] args){
        int[] numeros = {2,5,4,6,7};
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}