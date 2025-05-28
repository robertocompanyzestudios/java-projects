public class Circulo extends FiguraGeometrica{
    private Double radio;
    public Circulo(Double radio) {
        super(radio, radio);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        Double area;
        area = Math.pow(this.radio ,2.0)* Math.PI ;
        return area;
    }
}
