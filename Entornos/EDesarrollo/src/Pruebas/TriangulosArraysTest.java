package Pruebas;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

class TriangulosArraysTest {

	@Test
	public void testEsTriangulo(){
		boolean resultado = TriangulosArrays.esTriangulo(5, 5, 5);
		assertTrue(resultado); 
		
	}

}
