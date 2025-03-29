import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maze {
    private char[][] map;
    private String filename;
    private boolean loaded;
    private int startI;
    private int startJ;
    private int endI;
    private int endJ;

    @Override
    public String toString() {
        return "Maze:" +
                "\nmap: " + Arrays.toString(map) +
                "\nfilename: " + filename +
                "\nloaded: " + loaded +
                "\nstartI: " + startI +
                "\nstartJ: " + startJ +
                "\nendI: " + endI +
                "\nendJ: " + endJ;
    }

    //Constructor
    public Maze(){

    }

    //Getters and Setters
    public boolean isLoaded() {
        return loaded;
    }

    public void loadMaze(){
        String[] ficheros = getFicheros();
        for(int i = 0; i < ficheros.length; i++){
            System.out.print((i+1) + ". ");
            System.out.print(ficheros[i]);
            System.out.println();
        }

        String filename = ficheros[Interface.getInt("Elija un laberinto: ")-1] + ".txt";


        try {
            File file = new File(Config.MAZES_PATH + filename);
            this.filename= filename;
            Scanner reader = new Scanner(file);
            ArrayList<String> dataFichero = new ArrayList();
            //Cuenta las lineas del fichero
            while (reader.hasNextLine()){
                dataFichero.add(reader.nextLine());
            }
            reader.close();

            //Inicializa el array que contendrá el laberinto
            char[][] maze = new char[dataFichero.size()][dataFichero.get(0).length()];
            //cargamos cada fila del fichero
            for(int i = 0; i<dataFichero.size(); i++){

                char[] data = dataFichero.get(i).toCharArray();
                maze[i] = data;

            }
            reader = new Scanner(file);

            this.map = maze;
            this.loaded = true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public String showMap(){
        String maze = "";

        //digitos que contiene la longitud del array
        int digitos = digitos(this.map[0].length);
        //El laberinto tendrá n(digitos) filas extra para poder mostrar el indice
        char[][] laberintoIndexado = new char[this.map.length + digitos][this.map[0].length + digitos];

        //Debug
        System.out.println("Array original: " + this.map.length + ", " + this.map[0].length);
        System.out.println("Array indexado: " + laberintoIndexado.length + ", " + laberintoIndexado[0].length);

        //Creo que esta fuera de rango
        for (int i = 0; i < this.map.length; i++) {
            System.arraycopy(this.map[i], 0, laberintoIndexado[i + digitos], digitos, this.map[i].length);
        }


        //Coloca los indices
        //i recorre todas las casillas que se rellenarán
        for (int i = 0; i < laberintoIndexado[digitos-1].length-1; i++) {
            //comprueba los digitos de la posicion
            //va rellenando los digitos
            // 12 ->  1 and 12 -> 1 2
            //    ->  2
            String data = String.valueOf(i);
            System.out.println("data: " + data);
            for (int j = digitos(i)-1, index = 0; j >= 0 ; j--, index++) {

                laberintoIndexado[digitos-1-j][i+1] = data.charAt(index);
                laberintoIndexado[i+1][digitos-1-j] = data.charAt(index);

            }
        }

        
        maze = maze + "\n";
        for(char[] i : laberintoIndexado){
            for (char j : i){
                if (j == '\0') {
                    maze = maze + " " + " ";
                } else {
                maze = maze + j + " ";
                }
            }
            maze = maze + "\n";
        }
        return maze;
    }



    //Métodos privados

    /**
     * Devuelve una lista de los ficheros del directorio mazes
     * @return
     */
    private String[] getFicheros(){
        try{
            File file = new File("./assets/mazes/");
            String[] laberintos = file.list();

            //Retira la extension del archivo
            for (int i = 0; i< laberintos.length; i++){
                String data = laberintos[i];
                laberintos[i] = data.substring(0, data.lastIndexOf("."));
            }

            return laberintos;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Calcula los digitos de un numero
     * @param num numero a comprobar
     * @return Numero de digitos
     */
    private int digitos(int num){
        return (int) Math.floor(Math.log10(num)) + 1;
    }

}
