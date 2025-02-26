import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase adminstra una sesion de usuario + contraseña
 * @author Rcompany
 * @version 0.1
 */
public class Session {
    /**
     * Usuario al que pertenece la sesión
     */
    private User user;

    /**
     * Almacena si hay un usuario logeado
     */
    private Boolean logged = false;

    //Getters
    //Setters no declarados por seguridad y encapsulacion

    /**
     * Devuelve el usuario de la sesion
     * @return el usuario de la sesion
     */
    public User getUser() {
        return user;
    }

    /**
     * Devuelve si esta logeado el usuario
     * @return si el usuario esta logeado
     */
    public boolean getLogged() {
        return logged.booleanValue();
    }

    //Constructors

    /**
     * Devuelve la instancia a su estado default
     */
    public Session(){
        super();
        this.user = null;
        this.logged = false;
    }

    /**
     * Comprueba que puede acceder al fichero y que el username está libre
     * Entonces solicita los datos y los guarda en la BD
     * @return true/false si ha sido exitoso el registro
     */

    public boolean signup(){
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

        try(FileWriter writer = new FileWriter(Config.FILE_PATH + Config.USERS_FILE, true)){

            writer.write(username +"#-#" + password + "#-#" + name + "#-#" + email + "#-#" + "\n");


            return true;
        }catch (IOException e){
            return false;
        }
    }

    /**
     * Administra el login
     * Pide un username y cotraseña y si es correcto instancia un User para la Session y cambia el valor logged a true
     * @return true/false si ha sido existoso
     */
    public boolean login() {

        String username;
        String password;

        System.out.println("Introduzca su username: ");
        username = Interface.getString();

        System.out.println("Introduzca su password: ");
        password = Interface.getString();

        //Comprueba si coincide con la bd e instancia el objeto user
        if(checkUsernamePassword(username, password)){
            String[] data = getUserData(username);
            User userToAdd = new User(data[0], data[2], data[3]);
            this.user = userToAdd;
            this.logged = true;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Desconectar usuario
     * Cambia el valor de logged a false
     */
    public void logOut(){
        this.logged = false;
    }

    /**
     * Comprueba si el username se encuentra en la BD
     * Devuelve true si lo encuentra
     * @param username El nombre del usuario
     * @return true/false si se encuentra
     */
    private boolean checkUsername(String username){
      try{
          File database = new File(Config.FILE_PATH + Config.USERS_FILE);
          Scanner reader = new Scanner(database);

          //Lee linea a linea
          while(reader.hasNextLine()){
              String data = reader.nextLine();
              String[] splittedData = data.split("#-#");

              if(splittedData[0].equals(username)){
                  reader.close();
                  return true;
              }
          }
            reader.close();
            return false;

      } catch (FileNotFoundException e){
          return false;
      }
    }

    /**
     * Compara la contraseña de un usuario con la recibida como parametro
     * @param username
     * @param password
     * @return true/false si ha sido exitoso
     */
    private boolean checkUsernamePassword(String username, String password){
        try{
            File database = new File(Config.FILE_PATH + Config.USERS_FILE);
            Scanner reader = new Scanner(database);

            //Lee linea a linea
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] splittedData = data.split("#-#");

                if(splittedData[0].equals(username) && splittedData[1].equals(password)){
                    reader.close();
                    return true;
                }
            }

            reader.close();
            return false;

        } catch (FileNotFoundException e){
            return false;
        }
    }

    /**
     * Devuelve
     * @param username
     * @return Un array con los datos de un usuario recibido como parametro
     */
    private String[] getUserData(String username){
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
                    reader.close();
                    return splittedData;
                }
            }

            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
        return errorArray;
    }


}

