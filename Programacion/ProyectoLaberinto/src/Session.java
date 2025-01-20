import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Session {

    //Se le pasa usuario y contraseña y verifica su existencia en el fichero de usuarios
    public static boolean login(String nombre, String contrasena) {
        try {
            File myFile = new File(Config.FILE_PATH + Config.USERS_FILE);
            Scanner myScanner = new Scanner(myFile);

            //Analiza cada entrada del fichero, lo separa filtrando por # y lo guarda en un array
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                String[] myString = data.split("#");

                //compara los datos de la entrada con var-nombre y var-contrasena (los datos a comprobar)
                if(nombre.equals(myString[0]) && contrasena.equals(myString[1])) {
                    myScanner.close();
                    return true;
                }

            }
            myScanner.close();
            return false;


        } catch (FileNotFoundException e) {
            System.out.println("--ERROR--");
            return false;
        }



    }

    //Por hacer
    public static String register(){}


    //Por hacer
    Public static void addUser(String userInfo){}
}

