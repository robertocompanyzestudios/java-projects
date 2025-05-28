public class Timbre {
    private boolean estado;

    public Timbre() {
        this.estado = false;
    }

    public void activar(){
        this.estado = true;
    }

    public void desactivar(){
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Timbre: " + estado;
    }
}
