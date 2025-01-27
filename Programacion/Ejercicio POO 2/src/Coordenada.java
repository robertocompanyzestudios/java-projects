public class Coordenada {
    private double x;
    private double y;

    //Constructors
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Getters and Setters
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public static double calcularDistancia(Coordenada coordenada1, Coordenada coordenada2){
        double x1 = coordenada1.getX();
        double x2 = coordenada2.getX();
        double y1 = coordenada1.getY();
        double y2 = coordenada2.getY();

        double distanciaX = (x2 - x1) * (x2 - x1);
        double distanciaY = (y2 - y1) * (y2 - y1);

        double distancia = Math.sqrt((distanciaX + distanciaY));
        //redondeo a 2 decimales
        distancia = Math.round(distancia * 100.0)/ 100.0;

        return distancia;
    }
}
