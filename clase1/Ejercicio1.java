package clase1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero A y uno B:");		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int suma = A + B;
		int resta = A - B;
		int multiplicacion = A * B;
		System.out.println("La suma de A + B da: " + suma + "|" + " Su resta es: " + resta + "|" + " Si los multiplico da: " + multiplicacion);
    }
}
