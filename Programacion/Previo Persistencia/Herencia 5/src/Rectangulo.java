public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(Double alto, Double ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        double area;
        area = this.getAlto() * this.getAncho();
        return area;
    }
}
