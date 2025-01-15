package Comprobaciones;
public class Utils {

	public static void main(String[] args) {
		/*
		int[] miArray = {7, 3, 10, 1, 6, 6, 9, 6, 8, 5};
				
		
		System.out.println("Es triangulo? = " + esTriangulo(5, 5, 5));
		System.out.println("Tipo triangulo = " + tipoTriangulo(5, 5, 5));
		System.out.println("Mas frecuente = " + masFrecuente(miArray));
		System.out.println("Posicion del numero 10 = " + buscarInt(miArray, 10));
		*/
	}
	
	public static String tipoTriangulo(double a, double b, double c) {
		
		if(esTriangulo(a, b, c)) {
			//equilatero
			if(a == b && b == c) {
				return "EQUILATERO";
			}else if(a != b && b != c && c != a) {
				return "ESCALENO";
			}else if(a == b || b == c || c == a) {
				return "ISOSCELES";
			}
			
		}
		
		return "ERROR";
	}
	
	
	public static boolean esTriangulo(double a, double b, double c) {
		if(a+b > c && a+c > b && b+c > a) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static int masFrecuente(int[] miArray) {
		
		int masFrecuente = 0;
		int cantidadMasFrecuente = 0;
		int contador = 0;
		for(int i:miArray){
			contador = 0;
			for(int j = 0; j < miArray.length; j++) {
				if(miArray[j] == i) {
					contador ++;
					if(contador > cantidadMasFrecuente) {
						masFrecuente = i;
						cantidadMasFrecuente = contador;
					}
				}	
			}
		}
		
		return masFrecuente;
	}
	
	
	public static int buscarInt(int[] miArray, int x) {
		for(int i = 0; i < miArray.length; i++) {
			if(miArray[i] == x) {
				return i;
			}
		}
		return 1;
	}
	
	
}
