package tp1;

import java.util.Scanner;
public class Bertellotti_Ian_CajeroATM{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] usuarios = {"Ian Bertellotti", "Barbara Trinidad", "Alessandra Silva", "Maria Mercedez", "Nicolas Giqueaux"};
        int[] cuentas = {0001, 0002, 0003, 0004, 0005};
        int[] claves = {1000, 2000, 3000, 4000, 5000};
        int[] saldo = {7000, 5000, 6000, 9000, 8000};
        programa: while(true){
            int contadorIntentosClave = 3;
            int cuentaActual;
            login: while(true){
                System.out.println("Ingrese su numero de cuenta: ");
                int cuentaIngresada = sc.nextInt();
                for(int i = 0; i< cuentas.length; i++){
                    if(cuentaIngresada == cuentas[i]){
                        System.out.println("ingrese su clave;");
                        int claveIngresada = sc.nextInt();
                        if(claveIngresada == claves[i]){
                            System.out.println("acceso consedido, Bienvenido/a " + usuarios[i]);
                            cuentaActual = i;
                            break login;
                        }else{
                            contadorIntentosClave --;
                            System.out.println("clave incorrecta le quedan " + contadorIntentosClave + "intentos");
                        }
                        if(contadorIntentosClave == 0){
                            System.out.println("demasiados intentos de clave session cerrada");
                            break programa;
                        }
                    }else{
                        System.out.println("cuenta incorrecta");
                    }
                }
            }
            System.out.println("---------------------------------------------------------------------------------------");
            while(true){
                System.out.println("---------------------------------------------------------------------------------------");
                String[] operaciones = {"Consultar saldo", "Depositar dinero", "Retirar dinero", "Transferir a otra cuenta", "Salir"};
                for(int i = 0; i < operaciones.length; i++){
                    System.out.println((i+1) + ". " + operaciones[i]);
                }
                System.out.println("seleccione una opcion poniendo el numero correspondiente");
                int opcion = sc.nextInt();
                System.out.println("---------------------------------------------------------------------------------------");
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual: $"+ saldo[cuentaActual]);
                        System.out.println("ingrese cualquier cosa para continuar");
                        sc.next();
                        break;
                    case 2:
                        System.out.println("cuanto desea depositar? Escriba el monto: ");
                        int deposito = sc.nextInt();
                        if(deposito > 0){
                            saldo[cuentaActual] = saldo[cuentaActual] + deposito;
                        }else{
                            System.out.println("monto invalido, no se pueden ingresar montos negativos o nulos");
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("========== RESUMEN DE SESIÓN ==========");
                        System.out.println("Titular: " + usuarios[cuentaActual]);
                        System.out.println("Saldo Final: $" + saldo[cuentaActual]);
                        System.out.println("Gracuas por usar mi cajero virtual");
                        break programa;
                    default:
                        System.out.println("operacion no valida");
                        break;
                }
            }
        }
    sc.close();
    }
}