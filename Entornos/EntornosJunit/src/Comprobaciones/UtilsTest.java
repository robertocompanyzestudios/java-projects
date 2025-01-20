package Comprobaciones;

import static org.junit.Assert.*;

import org.junit.Test;


class UtilsTest {

	@Test
	void testTipoTriangulo() {
		String resultado = Utils.tipoTriangulo(5, 6, 7);
		assertEquals("ESCALENO", resultado);
		
		resultado = Utils.tipoTriangulo(3, 2, 3);
		assertEquals("ISOSCELES", resultado);
		
		resultado = Utils.tipoTriangulo(5, 5, 5);
		assertEquals("EQUILATERO", resultado);
		
		resultado = Utils.tipoTriangulo(5, 1, 1);
		assertEquals("ERROR", resultado);
		
	}

	@Test
	void testEsTriangulo() {
		boolean resultado = Utils.esTriangulo(5, 5, 5);
		assertTrue(resultado);
		
		resultado = Utils.esTriangulo(1, 2, 4);
		assertFalse(resultado);
		
	}

	@Test
	void testMasFrecuente() {
		int[] miArray = {5, 1, 5, 4, 2, 1, 5, 3, 4, 2};
		
		int resultado = Utils.masFrecuente(miArray);
		assertEquals(5, resultado);
		
		resultado = Utils.masFrecuente(miArray);
		assertNotEquals(2, resultado);
		
	}
	@Test
	void testBuscarInt() {
		int[] miarray = {7, 3, 10, 1, 6, 4, 9, 2, 8, 5};
		
		int resultado = Utils.buscarInt(miarray, 10);
		assertEquals(2, resultado);
		
	}

}
