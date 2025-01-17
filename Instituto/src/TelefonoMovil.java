public class TelefonoMovil {
	private String modelo;
	private String fabricante;
	private Double precio;
	private Bateria bateria;
	private Pantalla pantalla;
	private Estudiante propietario;


	public TelefonoMovil(String modelo, String fabricante, Double precio){
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
	}

	public TelefonoMovil(Double precio, Bateria bateria, Pantalla pantalla, Estudiante propietario, String modelo, String fabricante) {
		super();
		this.precio = precio;
		this.bateria = bateria;
		this.pantalla = pantalla;
		this.propietario = propietario;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	//En caso de no saber el propietario/Estudiante
	public TelefonoMovil(String modelo, String fabricante, Double precio, Bateria bateria, Pantalla pantalla) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
		this.bateria = bateria;
		this.pantalla = pantalla;
	}

	//Getters and Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Estudiante getPropietario() {
		return propietario;
	}
	public void setPropietario(Estudiante propietario) {
		this.propietario = propietario;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}
	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Bateria getBateria() {
		return bateria;
	}
	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String toString(){
		return "TelefonoMovil\nModelo = "+ this.modelo + "\nFabricante = " + this.fabricante + "\nPrecio = " + this.precio + "\nBateria = " + this.bateria + "\nPantalla = " + this.pantalla;
	}
}
