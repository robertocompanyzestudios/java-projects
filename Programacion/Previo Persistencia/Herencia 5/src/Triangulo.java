public class Triangulo extends FiguraGeometrica{

    public Triangulo(Double alto, Double ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        double area;
        area = this.getAlto() * this.getAncho() / 2;
        return area;
    }
}
