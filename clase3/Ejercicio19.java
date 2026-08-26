package clase3;

import java.util.HashMap;
import java.util.Scanner;

/*19. Crear un HashMap que permita almacenar nombre  → edad. Cargar algunos nombres y 
edades y luego solicitar un nombre para consultar su edad. 
Ingrese nombre: Juan 
Edad: 20 */
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> persona = new HashMap<>();
        persona.put("Ian", 19);
        persona.put("Barbi", 20);
        persona.put("Pipo", 18);

        System.out.println("ingresa un nombre");
        String p = sc.next();
        System.out.println( "Edad: " + persona.get(p));
        sc.close();
    }
}
