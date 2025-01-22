import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Session {
    private static User user;
    private static Boolean logged = false;


    //Getters
    //Setters no declarados por seguridad y encapsulacion
    public static User getUser() {
        return user;
    }

    public static Boolean getLogged() {
        return logged;
    }

    //Constructors

    //Vaciar la clase / Retorno a valores default
    public Session(){
        super();
        Session.user = null;
        Session.logged = false;
        //setLogged(true);
    }

    //Comprueba que puede acceder al fichero y que no existe dicho usuario
    //Entonces solicita los datos y los guarda en la BD
    public static boolean signup(){
        String username = "";
        boolean exists = true;

        while (exists){
            System.out.println("Introduzca su username: ");
            username = Interface.getString();

            if (checkUsername(username)){
                System.out.println("Username no disponible");
            }else {
                exists = false;
            }
        }

        //Recibe todos los datos restantes
        System.out.println("Introduzca su password: ");
        String password = Interface.getString().trim();

        System.out.println("Introduzca su nombre: ");
        String name = Interface.getString().trim();

        System.out.println("Introduzca su email: ");
        String email = Interface.getString().trim();

        //Escribir datos en la BDD

        try{
            FileWriter writer = new FileWriter(Config.FILE_PATH + Config.USERS_FILE, true);

            writer.write(username +"#-#" + password + "#-#" + name + "#-#" + email + "#-#" + "\n");
            writer.close();

            return true;
        }catch (IOException e){
            return false;
        }

    }

    //Controla el login
    //Si es correcto instancia una Session(tipo = Session session) con un User(tipo = User user)
    public static boolean login() {

        String username;
        String password;

        System.out.println("Introduzca su username: ");
        username = Interface.getString();

        System.out.println("Introduzca su password: ");
        password = Interface.getString();

        //Comprueba si coincide con la bd e instancia el objeto user
        if(checkUsernamePassword(username, password)){
            String[] data = getUserData(username);
            User user = new User(data[0], data[2], data[3]);
            Session.user = user;
            Session.logged = true;
            return true;
        }else{
            return false;
        }



    }

    //Comprueba si el username se encuentra en la BD
    //Devuelve true si lo encuentra
    private static boolean checkUsername(String username){
      try{
          File database = new File(Config.FILE_PATH + Config.USERS_FILE);
          Scanner reader = new Scanner(database);

          //Lee linea a linea
          while(reader.hasNextLine()){
              String data = reader.nextLine();
              String[] splittedData = data.split("#-#");

              if(splittedData[0].equals(username)){
                  return true;
              }
          }

            return false;

      } catch (FileNotFoundException e){
          return false;
      }
    }

    private static boolean checkUsernamePassword(String username, String password){
        try{
            File database = new File(Config.FILE_PATH + Config.USERS_FILE);
            Scanner reader = new Scanner(database);

            //Lee linea a linea
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] splittedData = data.split("#-#");

                if(splittedData[0].equals(username) && splittedData[1].equals(password)){
                    return true;
                }
            }

            return false;

        } catch (FileNotFoundException e){
            return false;
        }
    }

    private static String[] getUserData(String username){
        String[] errorArray = new String[1];
        errorArray[0] = "ERROR";

        try{
            File database = new File(Config.FILE_PATH + Config.USERS_FILE);
            Scanner reader = new Scanner(database);


            //Lee linea a linea
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] splittedData = data.split("#-#");

                if(splittedData[0].equals(username)){
                    return splittedData;
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
        return errorArray;
    }



}

