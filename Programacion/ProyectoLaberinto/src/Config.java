public class Config {
    public static final  String VERSION = "0.1.0";
    public static final  String FILE_PATH = "./assets/";
    public static final  String USERS_FILE = "users.txt";
    public static final  String WELCOME = "========================================================================================" + "\n" +
                            "¡Bienvenido al Sistema de Gestión del Laberinto! \n" +
                            "En esta plataforma podrás gestionar usuarios y explorar caminos dentro de un laberinto.\n" +
                            "Versión: 0.1.0\n" +
                            "========================================================================================\n";

    private static final  String GOODBYE = "========================================================================================\n" +
                            "Gracias por usar el Sistema de Gestión del Laberinto.\n" +
                            "¡Hasta pronto!\n" +
                            "========================================================================================\n";
    public static final  String UNLOGGED_MENU = "1. Iniciar sesión\n" +
                                "2. Registro\n" +
                                "0. Salir\n";
    public static final  String LOGGED_MENU = "1. Cargar laberinto\n" +
                                "2. Ver laberinto actual\n" +
                                "3. Establecer casillas de entrada y salida\n" +
                                "4. Buscar caminos\n" +
                                "5. Ver usuario actual\n" +
                                "6. Cerrar sesión\n" +
                                "0. Salir\n" +
                                "========================================================================================\n";

}
