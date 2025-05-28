public class Bombilla {
    private boolean estado;

    public Bombilla() {
        this.estado = false;
    }

    public void encender(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Bombilla: " +
                "estado=" + estado;
    }
}
