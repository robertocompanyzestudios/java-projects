import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println(Config.WELCOME);

        Programa:
        while (true){
            System.out.println(Config.UNLOGGED_MENU);

            //Session();
            choice = keyboard.nextInt();

            switch (choice){
                case 1:
                    //iniciar sesion
                    System.out.println(Session.login());
                    break;

                case 2:
                    //registrarse
                    Session.signup();
                    break;

                case 0:
                    //salir
                    break Programa;

                default:
                    System.out.println("Introduzca una eleccion válida");
                    break;
            }

        }





    }
}
