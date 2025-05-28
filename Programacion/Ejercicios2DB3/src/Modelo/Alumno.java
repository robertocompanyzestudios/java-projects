package Modelo;

public class Alumno {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;
    protected String direccion;
    protected String telefono;

    public Alumno(int id, String nombre, String apellidos, String dni, String email, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Alumno:" +
                "\nid= " + id +
                "\nnombre= " + nombre +
                "\napellidos= " + apellidos +
                "\ndni= " + dni +
                "\nemail= " + email +
                "\ndireccion= " + direccion +
                "\ntelefono= " + telefono;
    }
}
