import java.util.ArrayList;

public class Modulo {
    private int id;
    private String nombre;
    private int curso;
    private int horasSemanales;
    private String profesor;
    private ArrayList<Alumno> alumnos;

    //Constructors


    public Modulo(int id, String nombre, int curso, int horasSemanales, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.horasSemanales = horasSemanales;
        this.profesor = profesor;
        this.alumnos = new ArrayList<Alumno>();
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

    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //End Getters and Setters

    public String getInfo() {

        return "Modulo{" +
                "\n \tid= " + id +
                "\n \tnombre= " + nombre +
                "\n \tcurso= " + curso +
                "\n \thorasSemanales= " + horasSemanales +
                "\n \tprofesor= " + profesor +
                "}";
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
}
