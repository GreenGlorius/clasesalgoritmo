package tp1;

import java.util.Scanner;
public class Bertellotti_Ian_CajeroATM{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /*creo los array de usuario con su nombre, cuentas con su numero de cuenta, claves con la clave de cada cuenta y saldo con el saldo de cada cuenta.
        siempre teniento en cuenta la posicion para cada usuario ej cualquiera[0] es la cuenta de Ian, nmro 1001, clave 1000, saldo 7000*/
        String[] usuarios = {"Ian Bertellotti", "Barbara Trinidad", "Alessandra Silva", "Maria Mercedez", "Nicolas Giqueaux"};
        int[] cuentas = {1001, 1002, 1003, 1004, 1005};
        int[] claves = {1000, 2000, 3000, 4000, 5000};
        int[] saldo = {7000, 5000, 6000, 9000, 8000};
        /*while para todo el programa para poder ingresar con otra cuenta luego de hacer las operaciones con una cuenta (mas que nada para poder corroborar las transferencias) */
        programa: while(true){
            /*inicio el contador acá para que al repetir el programa para la siguiente cuenta vuelva a valer 3 los intentos por si antes se gastó alguno
            tambien creo una variable para saber en que cuenta estas en el momento luego del login*/
            int contadorIntentosClave = 3;
            int cuentaActual;
            // logica del logeo con el contador de intentos y verificacion de cuenta
            login: while(true){
                System.out.println("si quiere ingresar ponga cualquier numero o un 1 para salir del programa");
                int continuar = sc.nextInt();
                //if para terminar el codigo
                if(continuar == 1){
                    break programa;
                }
                System.out.println("Ingrese su numero de cuenta: ");
                int cuentaIngresada = sc.nextInt();
                //for para recorrer las cuentas buscando si el numero ingresado existe
                for(int i = 0; i< cuentas.length; i++){
                    if(cuentaIngresada == cuentas[i]){
                        System.out.println("ingrese su clave;");
                        int claveIngresada = sc.nextInt();
                        //if que verifica que la clave es correcta da el mensaje de acceso consedido, actualiza la cuenta actual a la cuenta ingresada y cierra el while del login
                        if(claveIngresada == claves[i]){
                            System.out.println("acceso consedido, Bienvenido/a " + usuarios[i]);
                            cuentaActual = i;
                            break login;
                        //logica para contraseñas mal puestas y cerrar el programa si gasta los 3 intentos
                        }else{
                            contadorIntentosClave --;
                            System.out.println("clave incorrecta le quedan " + contadorIntentosClave + "intentos");
                        }
                        if(contadorIntentosClave == 0){
                            System.out.println("demasiados intentos de clave session cerrada");
                            break programa;
                        }
                        break;
                    }else{
                        System.out.println("cuenta incorrecta");
                    }
                }
            }
            System.out.println("---------------------------------------------------------------------------------------");
            //while que agrega el menú con toda su logica y que al terminar vuelve al login para poder entrar con otra cuenta o salir
            menu: while(true){
                System.out.println("---------------------------------------------------------------------------------------");
                // array de operaciones para poder imprimir el menu sin tener 100 lineas de codigo
                String[] operaciones = {"Consultar saldo", "Depositar dinero", "Retirar dinero", "Transferir a otra cuenta", "Salir"};
                for(int i = 0; i < operaciones.length; i++){
                    System.out.println((i+1) + ". " + operaciones[i]);
                }
                System.out.println("seleccione una opcion poniendo el numero correspondiente");
                int opcion = sc.nextInt();
                System.out.println("---------------------------------------------------------------------------------------");
                //switch con cada caso del menú
                switch (opcion) {
                    //caso para ver el saldo actual de la cuenta, siempre usando la variable cuentaActual para que muestre los valores de la cuenta en la que ingresé
                    case 1:
                        System.out.println("Saldo actual: $"+ saldo[cuentaActual]);
                        break;
                    //caso que permite los depositos
                    case 2:
                        System.out.println("cuanto desea depositar? Escriba el monto: ");
                        int deposito = sc.nextInt();
                        //verifica que el monto a depositar no sea negativo ni 0
                        if(deposito > 0){
                            //actualiza el valor del deposito y imprime el mensaje con el saldo actual
                            saldo[cuentaActual] = saldo[cuentaActual] + deposito;
                            System.out.println("el deposito se hizo correctamente. Nuevo saldo: $" + saldo[cuentaActual]);
                        }else{
                            //mensaje cuando el monto no es valido
                            System.out.println("monto invalido, no se pueden ingresar montos negativos o nulos");
                        }
                        break;
                    //caso para retiros
                    case 3:
                        System.out.println("cuanto desea retirar?");
                        int retiro = sc.nextInt();
                        //3 if para verificar que no se retire montos nulos, ni mayores a 2000. Tambien verifica que el monto no deje el saldo en negativo
                        if(retiro > saldo[cuentaActual]){
                            System.out.println("no puede retirar un monto mayor a su saldo");
                            break;
                        }
                        if(retiro > 2000){
                            System.out.println("el sistema no permite retiros mayores a 2000");
                            break;
                        }
                        if(retiro <= 0){
                            System.out.println("no puede retirar monton negativos o nulos");
                            break;
                        }
                        //resta el valor del retiro al saldo de la cuenta
                        saldo[cuentaActual] = saldo[cuentaActual] - retiro;
                        //imprime el mensaje de retiro bien hecho y el saldo actual
                        System.out.println("El retiro se hizo correctamente. nuevo saldo: $"+ saldo[cuentaActual]);
                        break;
                    //caso que tiene la logica para las transferencias
                    case 4:
                        System.out.println("ingrese la cuenta a la que desea transferirle: ");
                        int cuentaTransferir = sc.nextInt();
                        //for que recorre el array de cuentas para comprobar si la cuenta a la que va a transferir existe comparando la cuentaTransferir con todas las cuentas del array cuentas[]
                        for(int i = 0; i < cuentas.length; i++){
                            //cuando encuentra una cuenta con el mismo numero de cuenta que el ingresado procede a la transferencia
                            if(cuentaTransferir == cuentas[i]){
                                System.out.println("cuanto desea transferirle a " + usuarios[i]);
                                int transferencia = sc.nextInt();
                                //verifica que el monto a transferir no sea negativo ni 0 y que el saldo de la cuenta no vaya a quedar en negativo
                                if(transferencia > 0 && transferencia <= saldo[cuentaActual]){
                                    //suma el monto a la cuenta a la que le transfiere
                                    saldo[i] = saldo[i] + transferencia;
                                    //resta el monto a la cuenta actual
                                    saldo[cuentaActual] = saldo[cuentaActual] - transferencia;
                                    System.out.println("transferencia exitosa. Nuevo saldo: $" + saldo[cuentaActual]);
                                    break;                                   
                                }else{
                                    //imprime un mensaje de error para saldos que no pasen la verificacion
                                    System.out.println("transferencia fallida, saldo no permitido");
                                    break;
                                }
                            }
                            //mensaje de error que tira si termina de recorrer cuentas[] y no encuentra ninguna con el numero de cuenta ingresado para la transferencia
                            if(i == (cuentas.length - 1)){
                                System.out.println("numero de cuenta inexistente");
                            }
                        }
                        break;
                    //caso de que le da a salir, tira el resumen de cuenta con el nombre del titular y el saldo final (saldo despues de todas las modificaciones hechas)
                    case 5:
                        System.out.println("========== RESUMEN DE SESIÓN ==========");
                        System.out.println("Titular: " + usuarios[cuentaActual]);
                        System.out.println("Saldo Final: $" + saldo[cuentaActual]);
                        System.out.println("Gracias por usar mi cajero virtual");
                        //termina el while del menu para que vuelva a ejecutar el login por si se quiere ingresar con otra cuenta
                        break menu;
                    //un caso default por si se ingresa un numero de operacion no valido
                    default:
                        System.out.println("operacion no valida");
                        break;
                }
            }
        }
    sc.close();
    }
}