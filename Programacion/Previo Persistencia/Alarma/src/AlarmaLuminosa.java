public class AlarmaLuminosa extends Alarma{
    protected Bombilla bombilla;

    public AlarmaLuminosa(double umbral, Sensor sensor, Timbre timbre, Bombilla bombilla) {
        super(umbral, sensor, timbre);
        this.bombilla = bombilla;
    }

    public Bombilla getBombilla() {
        return bombilla;
    }

    @Override
    public void comprobar(){
        super.comprobar();
        if (sensor.getValorActual() > umbral){
            bombilla.encender();

        } else {
            bombilla.apagar();
        }

    }


}
