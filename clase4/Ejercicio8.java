package clase4;
/*Dónde existe esta variable*: 
a.  Analizar y corregir el siguiente código: 
public static void main(String[] args) { 
    int numero = 10; 
  
    if (numero > 5) { 
        int resultado = numero * 2; 
        System.out.println(resultado); 
    } 
  
    System.out.println(resultado); 
} 
b.  ¿Qué ocurre al intentar ejecutar el programa? hay un error porque como la variable resultado
solo se crea en el if en el caso de que no suceda la condicion print llamaria a una variable que no existe
c.  ¿Cuál es el alcance de numero?
6
d.  ¿Cuál es el alcance de resultado?
12 
e.  Modificar el código para que funcione correctamente. 
f.  Después, crear una función que utilice una variable local y analizar desde 
dónde puede ser accedida. */
public class Ejercicio8 {
   public static void main(String[] args) { 
        int numero = 10; 
        int resultado = 0;
        if (numero > 5) { 
            resultado = numero * 2; 
            System.out.println(resultado); 
        } 
    
        System.out.println(resultado); 
        mostrarVariableLocal();
    }

    public static void mostrarVariableLocal() {
        int numeroLocal = 20;
        System.out.println("Variable local: " + numeroLocal);
    }
}
