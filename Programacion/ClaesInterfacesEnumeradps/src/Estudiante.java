
public class Estudiante {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String grado;
	private String universidad;
	private String email;
	private int telnum;
	
	private static int numEstudiantesl = 0;
	
	
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
	

	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	

	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public int getTelnum() {
		return telnum;
	}
	public void setTelnum(int telnum) {
		this.telnum = telnum;
	}


	public static int getNumEstudiantesl() {
		return numEstudiantesl;
	}
	public static void setNumEstudiantesl(int numEstudiantesl) {
		Estudiante.numEstudiantesl = numEstudiantesl;
	}

	public Estudiante(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		numEstudiantesl++;
	}
	
	public Estudiante(String nombre, String apellido1, String apellido2,
			String grado, String universidad, String email, int telnum) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.grado = grado;
		this.universidad = universidad;
		this.email = email;
		this.telnum = telnum;
		numEstudiantesl++;
	}
	

	public String mostrarInformacion() {
		return (" nombre: " + this.nombre + " apellido1: " + this.apellido1 + " apellido2: " + this.apellido2 +
				" grado: " + this.grado + " universidad: " + this.universidad + " email: " + this.email + " numero de telefono: " + this.telnum);
	}

}
