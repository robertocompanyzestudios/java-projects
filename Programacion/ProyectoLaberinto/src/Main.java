/**
 * Esta Se encarga de administrar el flujo de ejecución del proyecto
 * todo el flujo del programa
 * @author Rcompany
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Session activeSession = new Session();
        Maze miLaberinto = new Maze();
        int choice;


        System.out.println(Config.WELCOME);

        boolean continuar = true;
        while (continuar){
            System.out.println(Config.UNLOGGED_MENU);

            choice = Interface.getInt();

            switch (choice){
                case 1:
                    //iniciar sesion


                    activeSession.login();

                    //Inicio de sesion correcto
                    if (activeSession.getLogged()){

                        System.out.println(Config.WELCOME);

                        //Mientras el usuario está loggeado
                        do {
                            System.out.println(Config.LOGGED_MENU);
                            choice = Interface.getInt();

                            switch (choice){
                                case 1:
                                    miLaberinto.loadMaze();
                                    break;
                                case 2:
                                    if(miLaberinto.isLoaded()){
                                        System.out.println(miLaberinto.showMap());
                                    } else {
                                        System.out.println("Primero seleccione un laberinto.");
                                    }
                                    break;
                                case 3:

                                case 4:
                                    System.out.println("Disponible proximamente");
                                    Interface.toContinue();
                                    break;

                                case 5:
                                    //Mostrar usuario
                                    System.out.println("Usuario: @" + activeSession.getUser().getUsername());
                                    Interface.toContinue();
                                    break;

                                case 6:
                                    //Cerrar sesion
                                    activeSession.logOut();
                                    Interface.toContinue();
                                    break;

                                case 0:
                                    //Cerrar programa
                                    System.exit(0);
                                    break;

                                default:
                                    //Numero incorrecto
                                    System.out.println("Eleccion fuera de rango");
                            }
                        }while (activeSession.getLogged());

                    //Inicio de sesion incorreccto
                    }else{
                        System.out.println("Usuario o contraseña incorrectos");
                        Interface.toContinue();
                    }
                    break;

                case 2:
                    //registrarse
                    activeSession.signup();
                    break;

                case 0:
                    //salir
                    System.exit(0);
                    break;

                default:
                    System.out.println("Introduzca una eleccion válida");
                    break;
            }

        }





    }
}
