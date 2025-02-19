import java.util.Scanner;

public class Interface {
	private static Scanner keyboard = new Scanner(System.in);

	// Sin enunciado
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

	// Con enunciado
	public static int getInt(String text) {
		System.out.print(text);
		return getInt();
	}

	// Sin enunciado
	public static String getString() {
		return keyboard.nextLine().trim();

	}

	// Con enunciado
	public static String getString(String text) {
		System.out.print(text);
		return keyboard.nextLine().trim();
	}

	// Metodo para que pida una accion para continuar
	public static void toContinue() {
		System.out.print("\nPulse 'enter' para continuar");
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
