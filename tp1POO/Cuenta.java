package tp1POO;

public class Cuenta {
    private final String nombre;
    private final int numeroCuenta;
    private final int clave;
    private double saldo;

    public Cuenta(String nombre, int numeroCuenta, int clave){
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.saldo = 0;
    }

    public Cuenta(String nombre, int numeroCuenta, int clave, double saldo){
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public int getclave(){
        return clave;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void depositarDinero(double deposito){
        saldo+=deposito;
    }
    public void retirarDinero(double retiro){
        saldo-=retiro;
    }
    public void transferirDinero(int transferencia){

    }
}
