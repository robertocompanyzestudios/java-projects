public abstract class FiguraGeometrica {
    private Double alto;
    private Double ancho;

    public FiguraGeometrica(Double alto,Double ancho ){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public abstract double calcularArea();

}
