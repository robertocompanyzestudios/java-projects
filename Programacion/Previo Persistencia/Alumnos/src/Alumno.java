public class Alumno {
    private String nombre;
    private String apellidos;
    private String nre;
    private String email;
    private String direccion;


    public Alumno(String nombre, String apellidos, String nre, String email, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nre = nre;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String info() {
        return "Alumno:\n" +
                "nombre=" + nombre + "\n" +
                "apellidos=" + apellidos + "\n" +
                "nre=" + nre + "\n" +
                "email=" + email + "\n" +
                "direccion=" + direccion + "\n";
    }
}
