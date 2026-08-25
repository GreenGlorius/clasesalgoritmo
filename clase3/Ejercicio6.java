package clase3;

import java.util.Scanner;

/*6. Comparación de cadenas. Leer dos palabras y determinar si son iguales o diferentes. 
a. Primero, teniendo en cuenta mayúscula/minúsculas 
b. Luego, que para determinar igualdad no importe la diferencia entre mayúscula y 
minúscula */
public class Ejercicio6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Escriba la primer palabra");
    String palabraA = sc.next();

    System.out.println("Escriba la segunda palabra");  
    String palabraB = sc.next();

    if(palabraA.equals(palabraB)){
        System.out.println("a. son total mente iguales");
    }else if(palabraA.equalsIgnoreCase(palabraB)){
        System.out.println("b. son iguales ignorando mayusculas");
    }else{
        System.out.println("son distintas");
    }

    sc.close();
    }
}