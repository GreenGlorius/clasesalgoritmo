package tp1.tpPOOtp1;

public class Usuario {
    private int numeroCuenta;
    private int clave;
    private double saldo;
    private String nombre;
    
    public Usuario(String nombre, int numeroCuenta, int clave) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.saldo = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
