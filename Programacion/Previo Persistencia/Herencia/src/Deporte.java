public abstract class Deporte {
    protected String nombre;


    public Deporte(String nombre){
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println(this.nombre);
    }

    //Abstractos

    public abstract void jugar();

}
