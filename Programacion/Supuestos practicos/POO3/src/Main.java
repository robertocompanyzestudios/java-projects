import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Generamos --módulo a módulo-- (sin los alumnos asignados)
        try{
            File documento = new File("./assets/modulos.txt");
            Scanner lector = new Scanner(documento);

            while(lector.hasNextLine()){
                String data = lector.nextLine();
                String[] splittedData = data.split("&");

                Modulo modulo = new Modulo(Integer.parseInt(splittedData[0]), splittedData[1], Integer.parseInt(splittedData[3]), splittedData[4]);

                //Ahora añadimos los comprobamos la relacion Y
                //Añadimos solamente los alumnos que formen parte de del modulo
                File documentoRelacion = new File("./assets/modulo_alumno.txt");
                Scanner lectorRelacion = new Scanner(documentoRelacion);
                while (lectorRelacion.hasNextLine()){
                    data = lectorRelacion.nextLine();
                    splittedData = data.split(",");
                    //Si coincide la el id de modulo -> busca el id del alumno y lo añade al ArrayList
                    if (Integer.parseInt(splittedData[0]) == modulo.getId()){
                        //Comprobamos los alumnos hasta encontrar el id de la relacion
                        File documentoAlumno = new File("./assets/alumnos.txt");
                        Scanner lectorAlumnos = new Scanner(documentoAlumno);
                        while (lectorAlumnos.hasNextLine()){
                           data = lectorAlumnos.nextLine();
                           splittedData = data.split("&");
                           if (Integer.parseInt(splittedData[0]) == ){

                           }


                        }
                    }

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
