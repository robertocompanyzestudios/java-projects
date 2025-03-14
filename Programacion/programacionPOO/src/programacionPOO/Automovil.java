package programacionPOO;

public class Automovil {
	private String marca;
	private String modelo;
	private String color = "blanco";
	private int cilindrada;
	private int velocidad = 0;
	
	
	public Automovil() {
		super();
	}
	
	public Automovil(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String detalle() {
		String salida = "";
		
		salida = "\nMarca = " + this.marca + "\nModelo = " + this.modelo + "\nColor = " + this.color 
				+"\nCilindrada = " + this.cilindrada + "\nVelocidad = " + this.velocidad;
		
		return salida;
	}
	
	public int acelerar(int velocidad){
		 velocidad = velocidad + 10;
		return velocidad;
	}
	
	public int frenar(int velocidad ){
		 velocidad = velocidad - 10;
		return velocidad;
	}
	
	public double frenarAuto(int velocidad) {
		double tiempo = 0;
		while(true){
			tiempo = tiempo + 1;
			velocidad = velocidad -10;
			if (velocidad < 0) {
				tiempo = tiempo + (velocidad * - 0.1);
				break;
			}
		}
		
		return tiempo;
	}
	
}
