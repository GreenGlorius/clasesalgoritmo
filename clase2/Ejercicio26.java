package clase2;

import java.util.Scanner;
/*Leer un número entre 1 y 1000. Luego, convertirlo en número romano y mostrar el 
resultado por pantalla. Para esto, tener en cuenta cómo los números enteros de la lista 
N coinciden con los números romanos de la lista R:  */
public class Ejercicio26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 1000:");
        int numero = sc.nextInt();
        
        // Validar que esté en el rango correcto
        if (numero < 1 || numero > 1000) {
            System.out.println("El número debe estar entre 1 y 1000");
            sc.close();
            return;
        }
        
        // Listas con los valores y sus correspondientes números romanos
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        String resultado = "";
        
        // Convertir a número romano
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                resultado += romanos[i];
                numero -= valores[i];
            }
        }
        
        System.out.println("El número en romano es: " + resultado);
        sc.close();
    }
}
