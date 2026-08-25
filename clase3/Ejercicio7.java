package clase3;

import java.util.Scanner;

/*7. Leer 10 números y almacenarlos en un array. Mostrar: 
a. Suma. 
b. Promedio. 
c. Cantidad de números positivos. 
d. Cantidad de números negativos. 
e. Número mayor. 
f. Número menor. 
g. Posición donde aparece el número mayor. 
h. Posición donde aparece el número menor. */
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0, positivos = 0, negativos = 0, mayorPos = 0, menorPos = 0;
        System.out.println("Escriba 10 numeros");
        for(int i = 0; i < numeros.length;i++){
            int numero = sc.nextInt();
            numeros[i] = numero;
            if(numero > numeros[mayorPos]){
                mayorPos = i;
            }
            if(numero < numeros[menorPos]){
                menorPos = i;
            }
            if(numero > 0){
                positivos ++;
            }
            if(numero < 0){
                negativos ++;
            }
            suma += numero;
        }
        System.out.println("la suma de todos los numeros da = " + suma);
        System.out.println("El promedio es de: " + (suma/numeros.length));
        System.out.println("hay" + positivos + " positivos, y hay " + negativos + " negativos");
        System.out.println("El numero mayor es: " + numeros[mayorPos] + " y su posición es la " + mayorPos);
        System.out.println("El numero menor es: " + numeros[menorPos] + " y su posición es la " + menorPos);
        sc.close();
    }
}
