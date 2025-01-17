public class Bateria{
    private String modelo;
    private double tiempoInactividad;
    private double horasCapacidad;


    public Bateria(String modelo, double tiempoInactividad, double horasCapacidad) {
        this.modelo = modelo;
        this.tiempoInactividad = tiempoInactividad;
        this.horasCapacidad = horasCapacidad;
    }



    //Getters and Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTiempoInactividad() {
        return tiempoInactividad;
    }
    public void setTiempoInactividad(double tiempoInactividad) {
        this.tiempoInactividad = tiempoInactividad;
    }

    public double getHorasCapacidad() {
        return horasCapacidad;
    }
    public void setHorasCapacidad(double horasCapacidad) {
        this.horasCapacidad = horasCapacidad;
    }


    public String toString(
            return "Bateria" + "\nModelo = " + this.modelo + "\nTiempo de inactividad = " + this.tiempoInactividad + ;
    ){

    }


}
