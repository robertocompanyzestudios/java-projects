import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Session {
    private User user;
    private Boolean logged = false;

    public Session(User user){
        super();
        this.user = user;
        logged = true;
    }

    //Comprueba que puede acceder al fichero y que no existe dicho usuario
    public static boolean signup(){
        Scanner keyboard = new Scanner(System.in);
        String username = "";
        String password;
        boolean exists = true;

        while (exists){
            System.out.println("Introduzca su username: ");
            username = keyboard.nextLine();

            if (checkUsername(username)){
                System.out.println("Username no disponible");
            }else {
                exists = true;
            }
        }

        System.out.println("Introduzca su password: ");
        password = keyboard.nextLine();

        //Escribir datos en la BDD
        //Sin completar

        try{
            FileWriter writer = new FileWriter(Config.FILE_PATH + Config.USERS_FILE);

            writer.write(username +"#" + password);

            return true;
        }catch (IOException e){
            return false;
        }

    }

    //Controla el login
    public static boolean login() {
        Scanner keyboard = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Introduzca su username: ");
        username = keyboard.nextLine();

        System.out.println("Introduzca su password: ");
        password = keyboard.nextLine();

        //Comprueba si coincide con la bd
        if(checkUsernamePassword(username, password)){
            return true;
        }else{
            return false;
        }

    }

    //Comprueba si el username se encuentra en la BD
    //Devuelve true si lo encuentra
    public static Boolean checkUsername(String username){
      try{
          File database = new File(Config.FILE_PATH + Config.USERS_FILE);
          Scanner reader = new Scanner(database);

          //Lee linea a linea
          while(reader.hasNextLine()){
              String data = reader.nextLine();
              String[] splittedData = data.split("#");

              if(splittedData[1].equals(username)){
                  return true;
              }
          }

            return false;

      } catch (FileNotFoundException e){
          return false;
      }
    }

    public static Boolean checkUsernamePassword(String username, String password){
        try{
            File database = new File(Config.FILE_PATH + Config.USERS_FILE);
            Scanner reader = new Scanner(database);

            //Lee linea a linea
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] splittedData = data.split("#");

                if(splittedData[1].equals(username) && splittedData[2].equals(password)){
                    return true;
                }
            }

            return false;

        } catch (FileNotFoundException e){
            return false;
        }
    }

    //Por hacer
    public static void addUser(String userInfo){}
}

