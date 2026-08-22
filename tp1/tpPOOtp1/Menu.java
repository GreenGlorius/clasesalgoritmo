package tp1.tpPOOtp1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nombre;
    private TipoMenu tipo;
    private List<String> opciones;

    public Menu(String nombre, TipoMenu tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.opciones = new ArrayList<>();
        cargarOpciones();
    }

    private void cargarOpciones() {
        opciones.clear();

        switch (tipo) {
            case INICIO:
                opciones.add("Iniciar sesion");
                opciones.add("Registrarse");
                opciones.add("Cerrar programa");
                break;
            case LOGIN:
                opciones.add("Ingresar");
                opciones.add("Volver al menu inicial");
                break;
            case REGISTER:
                opciones.add("Crear usuario");
                opciones.add("Volver al menu inicial");
                break;
            case OPERACIONES:
                opciones.add("Consultar saldo");
                opciones.add("Depositar dinero");
                opciones.add("Retirar dinero");
                opciones.add("Cerrar sesion");
                break;
        }
    }

    public void mostrar() {
        System.out.println("\n===== " + nombre + " =====");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
        System.out.print("Seleccione una opcion: ");
    }

    public enum TipoMenu {
        INICIO,
        LOGIN,
        REGISTER,
        OPERACIONES
    }
}
