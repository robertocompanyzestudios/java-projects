public class Alarma {
    protected double umbral;
    protected Sensor sensor;
    protected Timbre timbre;

    public Alarma(double umbral, Sensor sensor, Timbre timbre) {
        this.umbral = umbral;
        this.sensor = sensor;
        this.timbre = timbre;
    }

    public void comprobar(){
        if (sensor.getValorActual() > umbral){
            timbre.activar();
        } else {
            timbre.desactivar();
        }
    }

}
