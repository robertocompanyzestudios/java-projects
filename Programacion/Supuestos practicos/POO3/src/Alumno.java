public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String direccion;
    private String nre;


    //Constructors
    public Alumno(int id, String nombre, String apellidos, String dni, String email, String direccion, String nre) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.nre = nre;
    }


    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
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

    public String getNre() {
        return nre;
    }
    public void setNre(String nre) {
        this.nre = nre;
    }
}
