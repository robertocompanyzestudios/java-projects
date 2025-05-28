package modelo;

public class Producto {

    private String nombre;
    private double eur;
    private double dol;

    public Producto(double eur, double dol, String nombre) {
        this.eur = eur;
        this.dol = dol;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + eur + "€" + " / " + dol + "$";
    }
}
