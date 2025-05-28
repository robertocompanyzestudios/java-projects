import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static final String  ficheroCoordenadas = "./assets/coordenadas.txt";


    public static void main(String[] args) {
        //Genera un array con todas las coordenadas
        Coordenada[] arrayCoordenadas = obtenerCoordenadas(ficheroCoordenadas);

        //genera un array que almacenará las distancia entre los puntos
        double[] arrayDistancias = new double[arrayCoordenadas.length-1];
        
        for(int i = 0; i < (arrayCoordenadas.length - 1); i++){
            Coordenada coordenada1 = arrayCoordenadas[i];
            Coordenada coordenada2 = arrayCoordenadas[i+1];

            arrayDistancias[i] = Coordenada.calcularDistancia(coordenada1, coordenada2);
        }

        double total = 0;
        //recorre todas las distancias y las suma
        for(double i : arrayDistancias){
            total = total + i;
        }
        System.out.println("total = " + total);



    }

    //Recibe un fichero que deberá estar formateado de la siguiente manera:
    //x,y
    //x,y
    //devuelve un array de tipo Coordenada con todas las coordenadas encontradas en el fichero
    public static Coordenada[] obtenerCoordenadas(String ruta){
        try{
            File fichero = new File(ruta);
            Scanner lector = new Scanner(fichero);
            Scanner lectorAuxiliar = new Scanner(fichero);

            //Cuenta las coordenadas para definir el array
            int cantidad = 0;
            while(lectorAuxiliar.hasNextLine()){
                lectorAuxiliar.nextLine();
                cantidad++;
            }

            Coordenada[] coordenadasArray = new Coordenada[cantidad];
            int posicion = 0;
            while(lector.hasNextLine()){
                //Aislamos las posiciones de cada coordenada
                String data = lector.nextLine();
                String[] splittedData = data.split(",");
                //Instanciamos cada objeto con sus coordenadas
                coordenadasArray[posicion] = new Coordenada(Double.parseDouble(splittedData[0]),Double.parseDouble(splittedData[1]));

                posicion++;
            }
            lector.close();
            lectorAuxiliar.close();
            return coordenadasArray;

        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
            Coordenada[] errorNotFound = new Coordenada[1];
            return errorNotFound;
        }
    }
}
