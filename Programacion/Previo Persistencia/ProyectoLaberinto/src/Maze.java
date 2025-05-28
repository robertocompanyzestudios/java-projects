import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase proporciona lo necesario para administrar y cargar un laberinto
 */
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

    //Constructor--
    //Empty

    //Getters and Setters--

    /**
     * Comprueba si hay un laberinto cargado
     * @return true/false
     */
    public boolean isLoaded() {
        return loaded;
    }

    //Methods--
    /**
     * Selecciona un nuevo laberinto
     */
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

            this.startI = 0;
            this.startJ = 0;
            this.endI = 0;
            this.endJ = 0;
            this.map = maze;
            this.loaded = true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Muestra el laberinto cargado
     * @return Una cadena con el laberinto cargado
     */
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
            for (int j = digitos(i)-1, index = 0; j >= 0 ; j--, index++) {

                laberintoIndexado[digitos-1-j][i+1] = data.charAt(index);
                laberintoIndexado[i+1][digitos-1-j] = data.charAt(index);

            }
        }


        //Si la entrada y salida están asignadas, las incluye en el array
        if (startI != 0) {
            laberintoIndexado[digitos + startI][digitos + startJ] = 'E';
            laberintoIndexado[digitos + endI][digitos + endJ] = 'S';
        }


        //Va cargando el string final que se mostrará
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

    /**
     * Establece las casillas de Entrada y salida del laberinto
     */
    public void setEntranceExit(){
        int entradaX;
        int entradaY;
        int salidaX;
        int salidaY;

        boolean vacia = false;
        while(!vacia){
            entradaX = Interface.getInt("Introduzca la posición horizontal de la casilla de entrada: ") - 1;
            entradaY = Interface.getInt("Introduzca la posición vertical de la casilla de entrada: ") - 1;

            if(this.map[entradaY][entradaX] != '#'){
                this.startI = entradaY;
                this.startJ = entradaX;
                vacia = true;
            } else {
                System.out.println("La casilla no está vacía");
            }
        }

        vacia = false;
        while(!vacia){
            salidaX = Interface.getInt("Introduzca la posición horizontal de la casilla de salida: ") - 1;
            salidaY = Interface.getInt("Introduzca la posición vertical de la casilla de salida: ") - 1;

            if(this.map[salidaY][salidaX] != '#'){
                this.endI = salidaY;
                this.endJ = salidaX;
                vacia = true;
            } else {
                System.out.println("La casilla no está vacía");
            }

        }


    }


    //Métodos privados--

    /**
     * Devuelve una lista de los ficheros del directorio mazes
     * @return un array de cadenas
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
