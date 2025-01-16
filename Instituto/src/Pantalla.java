public class Pantalla {
    private double tamano;
    private String fabricante;
    private String modelo;

    public Pantalla(double tamano, String fabricante, String modelo) {
        this.tamano = tamano;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Getters and Setters
    public double getTamano() {
        return tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
