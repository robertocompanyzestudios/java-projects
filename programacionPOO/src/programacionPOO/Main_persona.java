package programacionPOO;

public class Main_persona {

	public static void main(String[] args) {
		Persona roberto = new Persona("Roberto", "Company", "Zomeno");
		
		System.out.println(roberto.getNombre());
		System.out.println(roberto.getApellido1());
		System.out.println(roberto.getApellido2());
	}
	
}
