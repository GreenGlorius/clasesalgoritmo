package barian;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private String clave;

    private double vida;
    private int armadura;

    private int ataque;
    private int suerte;

    private int magia;
    private double mana;

    private int monedas;
    private double exp;
    private int nivel;
    

    private List<Objeto> objetos;
    private List<Propiedad> propiedades;
    public Jugador (String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.vida = 100;
        this.armadura = 0;
        this.ataque = 10;
        this.suerte = 0;
        this.magia = 0;
        this.mana = 100;
        this.monedas = 0;
        this.exp = 0;
        this.nivel = 1;
        objetos = new ArrayList<>();
        propiedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }
}