import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Agrupa todos los modulos en un ArrayList
        ArrayList<Modulo> modulos = new ArrayList<Modulo>();
        try{
            File ficheroModulos = new File("./assets/modulos.txt");
            Scanner lector = new Scanner(ficheroModulos);
            while(lector.hasNextLine()){

                String data = lector.nextLine();
                String[] splittedData = data.split("&");
                Modulo modulo = new Modulo(Integer.parseInt(splittedData[0]), splittedData[1], Integer.parseInt(splittedData[2]), Integer.parseInt(splittedData[3]), splittedData[4]);

                modulos.add(modulo);

            }
            lector.close();

        }catch (Exception e){
            System.out.println("Error Modulos");
        }

        //Agrupa todos los alumnos en un ArrayList
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        try{
            File ficheroAlumnos = new File("./assets/alumnos.txt");
            Scanner lector = new Scanner(ficheroAlumnos);
            while(lector.hasNextLine()){

                String data = lector.nextLine();
                String[] splittedData = data.split("&");
                Alumno alumno = new Alumno(Integer.parseInt(splittedData[0]), splittedData[1], splittedData[2], splittedData[3], splittedData[4], splittedData[5], Integer.parseInt(splittedData[6]));
                alumnos.add(alumno);
            }
            lector.close();

        }catch (Exception e){
            System.out.println("Error Modulos");
        }

        //Relaciona y añade los alumnos a los módulos
        //los almacena en el ArrayList del Modulo
        try{
            File ficheroRelacion = new File("./assets/modulo_alumno.txt");
            Scanner lector = new Scanner(ficheroRelacion);

            //Lee cada relacion del fichero
            while (lector.hasNextLine()){
                String data = lector.nextLine();
                String[] splittedData = data.split(",");

                //Busca el id del modulo
                for(Modulo i:modulos){

                    //Si coincide el id del modulo
                    if (i.getId() == Integer.parseInt(splittedData[0]) ){

                        //Busca el id del alumno
                        bucleAlumnos:
                        for(Alumno j:alumnos){
                            //Si coincide el id del alumno
                            if(j.getId() == Integer.parseInt(splittedData[1])){
                                j.addModulo(i);
                                break bucleAlumnos;
                            }
                        }


                    }
                }
            }

        }catch (Exception e){
            System.out.println("Error relación");
        }

        //Mostrar resultados
        for(Alumno i:alumnos){
            System.out.println("--------------------------Alumno---------------------------");
            System.out.println(i.getInfo());
            System.out.println("\t" +"--------------------------Modulos---------------------------");
            for(Modulo j: i.getModulos()){
                System.out.println("\t" + j.getInfo());
                System.out.println("\t" +"--------------------------------------------------------");
            }
        }




    }


}
