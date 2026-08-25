package tp1;

import java.util.Scanner;

public class trinidad_Barbara_cajero_ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] usuario = {"Pamela Contreras", "Ian Bertellotti", "Lea Aranda", "Caleb Trinidad", "Naruto Trinidad"};
		int[] numeroCuenta = {1001, 2002, 3003, 4004, 5005};
		int[] clave = {1000, 2000, 3000, 4000, 5000};
		double[] saldo = {4000, 5000, 6000, 7000, 8000};
		int usuarioActual = -1;
		System.out.println("=== BIENVENIDO AL CAJERO AUTOMATICO TP1 ===");
		//AQUI EN EL FOR CUANDO HACES QUE I SEA MENOR QUE NUMERO DE CUENTA
		//ESO QUIERE DECIR QUE SOLO SABE CUANTO TIENE EL ARRAY Y LO REPITE SEGUN LA CANTIDAD QUE TENGA
			
		boolean ejecutar = true;
		int intentos = 3;
		while (ejecutar == true) {
			System.out.println("Ingrese el numero de cuenta:");
			int cuentaIngresada = sc.nextInt();
			for (int i = 0; i < numeroCuenta.length; i++) {
				if (numeroCuenta[i] == cuentaIngresada) {
					while (intentos > 0 && ejecutar == true) {
						System.out.println("Ingrese su clave:");
						int claveIngresada = sc.nextInt();
						if (clave[i] == claveIngresada) {
							ejecutar = false;
							usuarioActual = i;
							System.out.println("clave correcta");
							System.out.println("Bienvenido/a: " + usuario[i]);
						} else {
							intentos--;
							if (intentos > 0) {
								System.out.println("clave incorrecta quedan " + intentos + " intentos");
							} else {
								System.out.println("Ha superado el máximo de intentos.");
								System.out.println("Acceso bloqueado.");
								ejecutar = false;
							}
						}
					}
				}
			}
		}

		if (usuarioActual == -1) {
			sc.close();
			return;
		}

		while (true) {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Consultar saldo");
			System.out.println("2. Depositar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Transferir a otra cuenta");
			System.out.println("5. Salir");
			System.out.println("Seleccione una opción:");

			int opcion = sc.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("Saldo disponible: $" + saldo[usuarioActual]);
					break;

				case 2://Deposito
					System.out.println("Cuánto quiere depositar:");
					double deposito = sc.nextDouble();
					if (deposito > 0) {
						saldo[usuarioActual] += deposito;
						System.out.println("Saldo actual: $" + saldo[usuarioActual]);
				    } else {
						System.out.println("El deposito tiene que ser mayor a cero");
					}
					break;

				case 3://retiro dinero 
					System.out.println("Cuánto quiere retirar:");
					double retiro = sc.nextDouble();
					if (retiro <= 0) {  
						System.out.println("El monto debe ser mayor que 0");
					} else if (retiro > 2000) {
						System.out.println("El retiro tiene no puede ser mayor a 2000");
					} else if (retiro > saldo[usuarioActual]) {
						System.out.println("Saldo insuficiente");
					} else {
						saldo[usuarioActual]= saldo[usuarioActual] - retiro;
						System.out.println("Saldo retirado correctamente");
						System.out.println("Saldo actual $" + saldo[usuarioActual]);
					}
					break;
						
				case 4: //Transferencia a otra cuenta
					System.out.println("A que cuenta quiere transferir:");
					int cuentaTransferida = sc.nextInt();
					int cuentaDestino = -1;

					for (int i = 0; i < numeroCuenta.length; i++) {
						if (numeroCuenta[i] == cuentaTransferida) {
							cuentaDestino = i;
							break;
						}
					}

					if (cuentaDestino == -1) {
						System.out.println("Cuenta Inexistente");
					} else if (cuentaDestino == usuarioActual) {
						System.out.println("No se puede transferir a su propia cuenta");
					} else {
						System.out.println("Cuanto quiere transferir:");
						double transferencia = sc.nextDouble();

						if (transferencia <= 0) {
							System.out.println("El monto tiene que ser mayor a 0");
						} else if (transferencia > saldo[usuarioActual]) {
							System.out.println("Saldo Insuficiente");
						
						} else {
							saldo[usuarioActual] = saldo[usuarioActual] - transferencia;
							saldo[cuentaDestino] = saldo[cuentaDestino] + transferencia;

							System.out.println("Transferencia realizada correctamente");
							System.out.println("Saldo actual $" + saldo[usuarioActual]);
							
						}
					}

					break;
				
				

				case 5:
					System.out.println("Gracias por utilizar el cajero.");
					sc.close();
					return;
					
				default:
					System.out.println("Opción inválida.");
			}
		}
	}
}
