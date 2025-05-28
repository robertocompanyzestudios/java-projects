package ejerciciosDB2.src.modulo;

public class Producto {

    private String nombre;
    private double precio;
    private String fabricante;

    public Producto(String nombre, double precio, String fabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - " + "Precio: " + precio + " - Fabricante: " + fabricante;
    }
}
