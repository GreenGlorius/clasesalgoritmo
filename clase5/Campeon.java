package clase5;
/*1. Crear una clase Campeon que permita representar un personaje de un
videojuego*.
a. La clase deberá tener las siguientes propiedades:
i. Nombre
ii. Nivel
iii. Puntos de vida
b. Crear la clase Campeon.
c. Crear un objeto de tipo Campeon y asignarle valores a sus propiedades.
d. Mostrar por consola los datos del campeón.
e. Crear un segundo objeto de tipo Campeon con valores diferentes y mostrar
sus datos */
public class Campeon{
        private String nombre;
        private int nivel;
        private int vida;
        private int vidaMax;
        public Campeon(String nombre){
            this.nombre = nombre;
            this.nivel = 0;
            this.vida = 100;
            this.vidaMax = 100;
        }
        public Campeon(String nombre, int nivel){
            this.nombre = nombre;
            this.nivel = nivel;
            this.vida = 100;
            this.vidaMax = 100;
        }
        public Campeon(){
            this.vida = 100;
            this.vidaMax = 100;
        }
        public String getNombre(){
            return nombre;
        }
        public int getNivel(){
            return nivel;
        }
        public int getVida(){
            return vida;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setNivel(int nivel){
            this.nivel = nivel;
        }
        public void mostrarDatos(){
            System.out.println("Nombre: " + this.getNombre() + " | Nivel: " + this.getNivel() + " | Vida: " + this.getVida());
        }
        public void subirNivel(){
            this.nivel += 1;
        }
        public void recibirDaño(int daño){
            this.vida -= daño;
        }
        public static void main(String[] args){
            Campeon campeon0 = new Campeon();
            campeon0.setNombre("Yummi");
            campeon0.setNivel(2);
            campeon0.mostrarDatos();
            
            Campeon campeon1 = new Campeon("Mordekaiser");
            campeon1.mostrarDatos();

            Campeon campeon2 = new Campeon("Jhin", 3);
            campeon2.mostrarDatos();

            campeon1.recibirDaño(20);
            campeon1.subirNivel();
            campeon1.mostrarDatos();
        }
    }
