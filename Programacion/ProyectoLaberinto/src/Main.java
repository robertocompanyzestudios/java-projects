/*
*
*
* Autor: Roberto Company Zomeño
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Session activeSession = new Session();
        int choice;

        System.out.println(Config.WELCOME);

        program:
        while (true){
            System.out.println(Config.UNLOGGED_MENU);

            //Session();
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

                                case 2:

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
                                    break program;
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
                    break program;

                default:
                    System.out.println("Introduzca una eleccion válida");
                    break;
            }

        }





    }
}
