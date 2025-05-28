package Modelo;

public class AlumnoFP extends Alumno{
    private String familia;

    public String getFamilia() {
        return familia;
    }

    public AlumnoFP(int id, String nombre, String apellidos, String dni, String email, String direccion, String telefono, String familia) {
        super(id, nombre, apellidos, dni, email, direccion, telefono);
        this.familia = familia;
    }
}
