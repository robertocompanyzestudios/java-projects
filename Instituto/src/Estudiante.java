public class Estudiante {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int curso;
	private String modulo;
	private String universidad;
	private String email;
	private String numTelefono;
	private TelefonoMovil telefono;
	
	private int numEstudiantes = 0;
	
	public Estudiante(String nombre, String apellido1, String apellido2){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		numEstudiantes++;
	}
	
	public Estudiante(String nombre, String apellido1, String apellido2, String modulo, String universidad){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.modulo = modulo;
		this.universidad = universidad;
		numEstudiantes++;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	
	public String infoEstudiante() {
		return ("Nombre = " + this.nombre + " Apellidos= " + this.apellido1 + " " + this.apellido2 + " Curso= " + this.curso + " Modulo= " + this.modulo + " Universidad= " + this.universidad + " Email= " + this.email + " Telefono= " + this.numTelefono);
	}

	public static void asignarTelefono(){

	}
	

	public static void main(String[] args){
		Estudiante estudiante1 = new Estudiante("Roberto", "Company", "Zomeño");

		TelefonoMovil alcatelRoberto = new TelefonoMovil()




	}
	
	
	

}
