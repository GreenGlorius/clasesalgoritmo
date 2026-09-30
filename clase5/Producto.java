package clase5;
/*4. Crear una clase Producto para representar un producto de una tienda.
a. La clase deberá tener:
i. Nombre
ii. Precio
iii. Stock
b. Crear la clase y sus propiedades.
c. Crear un método que permita aumentar el stock.
d. Crear un método que permita disminuir el stock.
e. Crear un método que muestre la información del producto.
f. Crear algunos productos y realizar diferentes operaciones sobre ellos. */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void aumentarStock(int cantidad){
        stock += cantidad;
    }
    public void disminuirStock(int cantidad){
        stock -= cantidad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre del producto: " + this.getNombre() + " | Precio: $" + this.getPrecio() + " | Stock: " + this.getStock());
    }
    public static void main(String[] args){
        Producto producto1 = new Producto("Harina",1500.5, 20);
        Producto producto2 = new Producto("dulce", 3000, 10);
        producto1.aumentarStock(5);
        producto2.disminuirStock(3);
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}
