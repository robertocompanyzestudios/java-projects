public class Estudiante extends Persona{
    private double evaluacion;

    public Estudiante(String nombre, String apellidos, double evaluacion) {
        super(nombre, apellidos);
        this.evaluacion = evaluacion;
    }
}
