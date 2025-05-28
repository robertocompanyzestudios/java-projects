public class Sensor {
    private double valorActual;

    public Sensor(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }

    @Override
    public String toString() {
        return "Sensor: " +
                "valorActual=" + valorActual;
    }
}
