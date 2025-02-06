import java.util.ArrayList;

public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String direccion;
    private int tel;
    private ArrayList<Modulo> modulos;


    //Constructors
    public Alumno(int id, String nombre, String apellidos, String dni, String email, String direccion, int tel) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.tel = tel;
        this.modulos = new ArrayList<Modulo>();
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

    public int gettel() {
        return tel;
    }
    public void settel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "\nid= " + id +
                "\n nombre= " + nombre +
                "\n apellidos= " + apellidos +
                "\n dni= " + dni +
                "\n email= " + email +
                "\n direccion= " + direccion +
                "\n tel= " + tel +
                "}\n";
    }

    //Metodos
    public void addModulo(Modulo modulo){
        this.modulos.add(modulo);
    }

    public String getInfo() {
        return "Alumno:" +
                "\n \tid= " + id +
                "\n \tnombre= " + nombre +
                "\n \tapellidos= " + apellidos +
                "\n \tdni= " + dni +
                "\n \temail= " + email +
                "\n \tdireccion= " + direccion +
                "\n \ttel= " + tel +
                "}";
    }
}
