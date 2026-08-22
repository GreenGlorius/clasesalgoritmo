package tp1.tpPOOtp1;

import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    private static final Path ARCHIVO_USUARIOS = Paths.get(
            "tp1", "tpPOOtp1", "Usuarios.txt");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = cargarUsuarios();

        Menu menuInicio = new Menu("Banco", Menu.TipoMenu.INICIO);
        boolean programaActivo = true;

        while (programaActivo) {
            menuInicio.mostrar();

            switch (scanner.nextInt()) {
                case 1:
                    iniciarSesion(scanner, usuarios);
                    break;
                case 2:
                    registrarUsuario(scanner, usuarios);
                    break;
                case 3:
                    programaActivo = false;
                    System.out.println("Programa cerrado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }

        guardarUsuarios(usuarios);
        scanner.close();
    }

    private static ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        if (Files.exists(ARCHIVO_USUARIOS)) {
            try {
                for (String linea : Files.readAllLines(ARCHIVO_USUARIOS)) {
                    String[] datos = linea.split("\\|", -1);
                    if (datos.length == 4) {
                        Usuario usuario = new Usuario(
                                datos[0],
                                Integer.parseInt(datos[1]),
                                Integer.parseInt(datos[2]));
                        usuario.setSaldo(Double.parseDouble(datos[3]));
                        usuarios.add(usuario);
                    }
                }
            } catch (IOException | NumberFormatException excepcion) {
                System.out.println("No se pudo leer Usuarios.txt.");
            }
        }

        if (usuarios.isEmpty()) {
            usuarios.add(new Usuario("Ian", 1001, 1000));
            guardarUsuarios(usuarios);
        }

        return usuarios;
    }

    private static void guardarUsuarios(ArrayList<Usuario> usuarios) {
        ArrayList<String> lineas = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            lineas.add(usuario.getNombre() + "|"
                    + usuario.getNumeroCuenta() + "|"
                    + usuario.getClave() + "|"
                    + usuario.getSaldo());
        }

        try {
            Files.write(ARCHIVO_USUARIOS, lineas);
        } catch (IOException excepcion) {
            System.out.println("No se pudo guardar Usuarios.txt.");
        }
    }

    private static void iniciarSesion(Scanner scanner, ArrayList<Usuario> usuarios) {
        System.out.print("Numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Clave: ");
        int clave = scanner.nextInt();

        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroCuenta() == numeroCuenta && usuario.getClave() == clave) {
                System.out.println("Bienvenido/a " + usuario.getNombre());
                menuOperaciones(scanner, usuarios, usuario);
                return;
            }
        }

        System.out.println("Numero de cuenta o clave incorrectos.");
    }

    private static void registrarUsuario(Scanner scanner, ArrayList<Usuario> usuarios) {
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Clave: ");
        int clave = scanner.nextInt();

        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroCuenta() == numeroCuenta) {
                System.out.println("Ese numero de cuenta ya existe.");
                return;
            }
        }

        usuarios.add(new Usuario(nombre, numeroCuenta, clave));
        guardarUsuarios(usuarios);
        System.out.println("Usuario registrado correctamente.");
    }

    private static void menuOperaciones(Scanner scanner, ArrayList<Usuario> usuarios, Usuario usuario) {
        Menu menuOperaciones = new Menu("Menu de operaciones", Menu.TipoMenu.OPERACIONES);
        boolean sesionActiva = true;

        while (sesionActiva) {
            menuOperaciones.mostrar();

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Saldo actual: $" + usuario.getSaldo());
                    break;
                case 2:
                    System.out.print("Monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        usuario.setSaldo(usuario.getSaldo() + deposito);
                        guardarUsuarios(usuarios);
                        System.out.println("Deposito realizado.");
                    } else {
                        System.out.println("El monto debe ser mayor que cero.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= usuario.getSaldo()) {
                        usuario.setSaldo(usuario.getSaldo() - retiro);
                        guardarUsuarios(usuarios);
                        System.out.println("Retiro realizado.");
                    } else {
                        System.out.println("Monto invalido o saldo insuficiente.");
                    }
                    break;
                case 4:
                    sesionActiva = false;
                    System.out.println("Sesion cerrada.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}
