package programacionPOO;

public class Main {

	public static void main(String[] args) {
		Automovil auto = new Automovil();
		
		/*auto.cilindrada = 100;
		auto.marca = "Kia";
		auto.modelo = "Carnival";
		*/
		
		auto.setMarca("KIA");
		auto.setModelo("Carnival");
		auto.setColor("gris");
		auto.setCilindrada(160);
		
		
		System.out.println(auto.detalle());
		System.out.println(auto.acelerar(auto.getVelocidad()));
		System.out.println(auto.detalle());
		
		System.out.println("El automovil " + auto.getMarca() + " " + auto.getModelo() + " ha tardado en frenar "
		+ auto.frenarAuto(123) + "s");
		
	}
	
}
