import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SesionTest {

	
	//Compara el funcionamiento del metodo login(String nombre, String contrasena)
	@Test
	void testLogin() {
		assertTrue(Sesion.login("dmunuera", "123456"));
		assertTrue(Sesion.login("pepe", "654321"));
		assertTrue(Sesion.login("maria", "987654321"));
		assertFalse(Sesion.login("pepe", "123456"));
	}

}
