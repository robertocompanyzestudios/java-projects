/**
 * Esta clase contiene la información general y menus del programa
 * @author Rcompany
 * @version 0.1.0
 */
public class Config {
    /**
     * Version actual del proyecto
     */
    public static final  String VERSION = "0.2.0";

    /**
     * Direccion de la carpeta con recursos
     */
    public static final  String FILE_PATH = "./assets/";

    /**
     * Nombre del fichero que almacena la información de los usuarios
     */
    public static final  String USERS_FILE = "users.txt";

    /**
     * RUta del directorio que almacena los laberintos
     */
    public static final String MAZES_PATH = "./assets/mazes/";

    /**
     * Mensaje de bienvenida
     */
    public static final  String WELCOME = "========================================================================================" + "\n" +
                            "¡Bienvenido al Sistema de Gestión del Laberinto! \n" +
                            "En esta plataforma podrás gestionar usuarios y explorar caminos dentro de un laberinto.\n" +
                            "Versión: 0.1.0\n" +
                            "========================================================================================\n";

    /**
     * Mensaje de despedida
     */
    private static final  String GOODBYE = "========================================================================================\n" +
                            "Gracias por usar el Sistema de Gestión del Laberinto.\n" +
                            "¡Hasta pronto!\n" +
                            "========================================================================================\n";

    /**
     * Menú sin usuario loggeado
     */
    public static final  String UNLOGGED_MENU = "1. Iniciar sesión\n" +
                                "2. Registro\n" +
                                "0. Salir\n";

    /**
     * Menú con usuario loggeado
     */
    public static final  String LOGGED_MENU = "1. Cargar laberinto\n" +
                                "2. Ver laberinto actual\n" +
                                "3. Establecer casillas de entrada y salida\n" +
                                "4. Buscar caminos\n" +
                                "5. Ver usuario actual\n" +
                                "6. Cerrar sesión\n" +
                                "0. Salir\n" +
                                "========================================================================================\n";

}
