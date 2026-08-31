package clase3;

import java.util.Scanner;

public class muestra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String oracion = sc.nextLine().toLowerCase().replaceAll("[^aeiou]", "");
        System.out.println(oracion.length());
        sc.close();
    }
    
}
