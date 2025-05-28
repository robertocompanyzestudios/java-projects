import java.io.File;
import java.util.Scanner;

/**
 * Esta clase proporciona utilidades para solicitar datos por teclado al usuario
 * @author Rcompany
 * @version 1.0
 */
public class Interface {
	private static Scanner keyboard = new Scanner(System.in);

	/**
	 * Pide un entero por teclado sin enunciado
	 * @return Un entero
	 */
	public static int getInt() {
		int number = -1;
		String value = keyboard.nextLine();
		try {
			number = Integer.parseInt(value);
		} catch (Exception e) {
			System.err.println("El valor introducido no es un numero");
		}
		return number;
	}


	/**
	 * Pide un String por teclado, lo convierte a entero e imprime un enunciado
	 * @param text String que imprimirá al pedir el dato
	 * @return Un entero
	 */
	public static int getInt(String text) {
		System.out.print(text);
		return getInt();
	}

	/**
	 * Pide un String por teclado sin enunciado
	 * @return Un String
	 */
	public static String getString() {
		return keyboard.nextLine().trim();

	}

	/**
	 * Pide un string por teclado e imprime un enunciado
	 * @param text String que imprimirá al pedir el dato
	 * @return Un String
	 */
	public static String getString(String text) {
		System.out.print(text);
		return keyboard.nextLine().trim();
	}

	/**
	 * Metodo para que pida una accion para continuar
	 */
	public static void toContinue() {
		System.out.print("\nPulse 'enter' para continuar");
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}



}
