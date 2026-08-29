package clase4;
/*12. Fibonacci recursivo: 
a.  Tomar el ejercicio de Fibonacci de la Lista N°2 y modificarlo para implementarlo 
en una función recursiva que retorne el término correspondiente: 
int fibonacci(int n) */
public class Ejercicio12 {
    public static int fibonacci(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        int cantidad = 10;
        System.out.println("Secuencia de Fibonacci (primeros " + cantidad + " valores):");
        for(int i = 1; i <= cantidad; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}