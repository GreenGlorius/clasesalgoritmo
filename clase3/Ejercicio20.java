package clase3;

import java.util.HashMap;
import java.util.Scanner;

/*20. Crear un HashMap de calificaciones de estudiantes (estudiante → calificación). Cargar 
algunos estudiantes con su calificación y luego permitir consultar la calificación de uno 
de ellos. */
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Ian", 9);
        student.put("Barbi", 7);
        student.put("Pipo", 4);
        
        System.out.println("write a name");
        String s = sc.next();

        System.out.println("Edad: " + student.get(s));

        sc.close();
    }
}
