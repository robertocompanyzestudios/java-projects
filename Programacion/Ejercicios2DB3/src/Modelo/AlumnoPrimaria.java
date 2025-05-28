package Modelo;

public class AlumnoPrimaria extends Alumno{
    private int curso;

    public int getCurso() {
        return curso;
    }

    public AlumnoPrimaria(int id, String nombre, String apellidos, String dni, String email, String direccion, String telefono, int curso) {
        super(id, nombre, apellidos, dni, email, direccion, telefono);
        this.curso = curso;
    }
}
