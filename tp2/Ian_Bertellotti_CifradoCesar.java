package tp2;
import java.util.Scanner;
public class Ian_Bertellotti_CifradoCesar {
    public static void main(String[] args){
        //uso un array para poder usarlo en los metodos ya que la consigna pedia usar algun tipo de lista
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        //inicializo el mensaje y el numero para actualizarlo en cada caso del switch
        String mensaje;
        int numero;
        Scanner sc = new Scanner(System.in);
        //meto todo en un while para hacer el break en el case 4
        programa: while(true){
            //uso un metodo para mostrar el menú
            int eleccion = mostrarMenu(sc);
            sc.nextLine();
            //switch de casos
            switch (eleccion) {
                //cifrar un mensaje
                case 1:
                    //pido el mensaje a cifrar y verifico que haya ingresado algo y no esté vacio
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Escriba el mensaje que quiere cifrar: ");
                    mensaje = sc.nextLine();
                    if (mensaje.trim().isEmpty()) {
                        System.out.println("El mensaje no puede estar vacio");
                        System.out.println("-----------------------------------------------------------------");
                        break;
                    }
                    //uso un try catch para pedir la clave y verificar que el dato ingresado sea un Int y no un double o String
                    try {
                        System.out.println("Escriba la clave (numero entero)");
                        //esta cuenta se hace apra que aunque de negativo por ej -1 % 26 que da -1 lo reemplaze por 25
                        numero = ((sc.nextInt()% 26) + 26) % 26;
                        //metodo de cifrado (lo explico abajo donde cree el metodo)
                        cifrarMensaje(mensaje, numero, abecedario);
                        System.out.println("-----------------------------------------------------------------");
                    } catch (Exception e) {
                        //lo que imprime si ingresó algo no valido y repite el menú
                        System.out.println("entrada no valida debe ser un numero entero");
                        System.out.println("-----------------------------------------------------------------");
                        sc.nextLine();
                    }
                    break;
                //caso para decifrar un mensaje teniendo su clave
                case 2:
                    //pide el mensaje cifrado y evalua que no esté vacio
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Escriba el mensaje que quiere decifrar: ");
                    mensaje = sc.nextLine();
                    if (mensaje.trim().isEmpty()) {
                        System.out.println("El mensaje no puede estar vacio");
                        System.out.println("-----------------------------------------------------------------");
                        break;
                    }
                    //mismo try que el case 1 para verificar que el numero sea un Int
                    try {
                        System.out.println("Escriba la clave (numero entero)");
                        numero = ((sc.nextInt()% 26) + 26) % 26;
                        //funcion para decifrar el mensaje(lo explico mas abajo)
                        decifrarMensaje(mensaje, numero, abecedario);
                        System.out.println("-----------------------------------------------------------------");
                    } catch (Exception e) {
                        //print cuando no es valida la clave
                        System.out.println("entrada no valida debe ser un numero entero");
                        System.out.println("-----------------------------------------------------------------");
                        sc.nextLine();
                    }
                    System.out.println("-----------------------------------------------------------------");
                    break;
                //decifrar un mensaje sin la clave(imprime todas las variaciones para que el usuario pueda ver cual tiene sentido)
                case 3:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Ingrese su mensaje cifrado");
                    mensaje = sc.nextLine();
                    System.out.println("Lista de cifrados:");
                    //uso un for para reutilizar la funcion del caso 2 pero imprimiendo todas las variables
                    for(int i = 1; i <= 25; i++){
                        decifrarMensaje(mensaje, i, abecedario);
                    }
                    System.out.println("-----------------------------------------------------------------");
                    break;
                //cierra el programa
                case 4:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Programa apagado");
                    break programa;
                default:
                    //si en eleccion llegase a poner un numero de una opcion que no existe lo pide denuevo
                    System.out.println("opcion no valida ingrese algo distinto");
                    break;
            }
        }
        sc.close();
    }
    //cifrar y decifrar reciben como parametro el mensaje a cifrar, el desplazamiento de la clave y el array de abecedario
    public static void cifrarMensaje(String mensaje, int desplazamiento, char[] abecedario){
        //use StringBuilder porque era mas comodo para armar el cifrado letra por letra, y el toCharArray para que mi mensaje se convierta en array para recorrerlo
        StringBuilder mensajeCifrado = new StringBuilder();
        /*for para crear el mensaje cifrado que se separa en un primer if que evalua si el caracter está en el abecedario
        o si es un numero o simbolo*/
        for (char caracter : mensaje.toCharArray()) {
            char letraMinuscula = Character.toLowerCase(caracter);
            if (letraMinuscula < 'a' || letraMinuscula > 'z') {
                mensajeCifrado.append(caracter);
                continue;
            }
            //creo la nueva posicion de la letra por ej si es z con 2 desplazamientos hace posicion = 25 y resultado hace (25 + 2)% 26 = 1, dando como resultado que abecedario[1] = 'b' (cambio la z por una b)
            int posicion = letraMinuscula - 'a';
            char resultado = abecedario[(posicion + desplazamiento) % 26];
            if (Character.isUpperCase(caracter)) {
                resultado = Character.toUpperCase(resultado);
            }
            //agrega cada caracter al resultado
            mensajeCifrado.append(resultado);
        }
        //imprime el mensaje final(tambien se podria con un return podniendo que devuelva un String pero para este caso me parecio mmas rapido hacerlo asi)
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
    }

    public static void decifrarMensaje(String mensaje, int desplazamiento, char[] abecedario){
        StringBuilder mensajeDescifrado = new StringBuilder();
        //for muy parecido pero que hace la funcion opuesta envez de hacer posicion+desplazamiento hace un posicion - desplazamiento para devolverlo a su lugar original
        for (char caracter : mensaje.toCharArray()) {
            char letraMinuscula = Character.toLowerCase(caracter);
            if (letraMinuscula < 'a' || letraMinuscula > 'z') {
                mensajeDescifrado.append(caracter);
                continue;
            }
            int posicion = letraMinuscula - 'a';
            char resultado = abecedario[(posicion - desplazamiento + 26) % 26];
            if (Character.isUpperCase(caracter)) {
                resultado = Character.toUpperCase(resultado);
            }
            mensajeDescifrado.append(resultado);
        }
        System.out.println(mensajeDescifrado);
    }
    //funcion para imprimir el menu y pedir que elija una opcion con un try catch para tirar un error si se ponen letras o numeros double
    public static int mostrarMenu(Scanner sc){
        while(true){
            String[] opciones = {"1.Cifrar Mensaje", "2.Decifrar mensaje", "3.Decifrar un mensaje sin clave", "4.Salir", "Ingrese que desea hacer:"};
            for(String n : opciones){
                System.out.println(n);
            }
            try{
                int eleccion = sc.nextInt();
                return eleccion;
            }
            catch(Exception e){
                System.out.println("solo toma como parametro numeros");
                sc.nextLine();
            }
        }
    }
}
