import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Ahorcado {
    private String user;
    private String[][] palabras;
    private int intentos;

    public Ahorcado(String user){
        this.user = user;
        this.palabras = loadPalabras();
        this.intentos = 5;
    }

    //--Metodos estaticos--
    public static String[][] loadPalabras(){
        ArrayList<String> data = new ArrayList<>();

        try{
            File file = new File("./assets/palabras.txt");
            Scanner reader = new Scanner(file);

            //Añadimos todas las lineas a la lista
            while (reader.hasNextLine()){
                data.add(reader.nextLine());
            }

            String[][] auxPalabras = new String[data.size()][2];

            String[] dataSplitted;
            for (int i = 0; i< auxPalabras.length; i++){
                dataSplitted = data.get(i).trim().split("#");

                auxPalabras[i][0] = dataSplitted[0];
                auxPalabras[i][1] = dataSplitted[1];

            }



            return auxPalabras;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    //--Metodos de instancia--
    public boolean nuevoJuego(String dificultad){
        String palabra = getPalabra(dificultad);
        Scanner teclado = new Scanner(System.in);
        char[] palabraMostrada = new char[palabra.length()];
        boolean adivinado = false;
        Character caracter;


        //Llena el array vacio
        for (int i = 0; i<palabraMostrada.length; i++){
            palabraMostrada[i] = '_';
        }

        boolean contiene = false;
        while (!adivinado){
            //DEBUG
            System.out.println("Palabra: " + palabra);

            System.out.println("Intentos restantes: " + intentos);
            System.out.println("\nPalabra: " + charToString(palabraMostrada));
            System.out.println(" Introduzca 1 caracter: ");
            caracter = teclado.next().charAt(0);

            //Comprueba si contiene el caracter
            contiene = false;
            for (int i = 0; i< palabraMostrada.length; i++){
                if (palabra.toLowerCase().toCharArray()[i] == caracter || palabra.toUpperCase().toCharArray()[i] == caracter){
                    palabraMostrada[i] = palabra.toCharArray()[i];
                    contiene = true;
                }
            }
            if (contiene == false){
                intentos -= 1;
                System.out.println("La palabra no contiene " + caracter);
            } else {
                System.out.println("La palabra sí contiene " + caracter);
            }

            System.out.println(palabraMostrada);
            System.out.println("¿Desea intentar adivinar la palabra?(S/N)");
            caracter = teclado.next().charAt(0);
             if (caracter == 'S' || caracter == 's'){
                 System.out.println("Palabra propuesta: ");
                 //Borra el buffer
                 teclado.nextLine();
                  adivinado = (palabra.equals(teclado.nextLine()));

             }


                //Si la palabra está completa termina el programa
            if (palabraMostrada.toString() == palabra){
                adivinado=true;
            }

            //si no le quedan intentos, termina el proceso
            //y devuelve false
            if (intentos == 0){
                break;
            }



        }



        guardarResultado(palabra, dificultad);
        return adivinado;
    }
/*
    public String mostrarRanking(){
        String[] data;
        String[] resultados = cargarResultados();
        String[][] resultadosSplit = new String[resultados.length][5];

        for (int i = 0; i <resultados.length; i++) {
            data = resultados[i].split("#");
            resultadosSplit[i][0] = data[0];
            resultadosSplit[i][0] = data[1];
            resultadosSplit[i][0] = data[2];
            resultadosSplit[i][0] = data[3];
            resultadosSplit[i][0] = data[4];
        }

        //Ordenar por rango
        String aux = "";
        int valor = 0;
        int valorAux = 0;

        for (int i = 0; i < resultadosSplit.length; i++) {
            //Almacena el valor de cada resultado
            getValor(resultadosSplit[i][2]);
            getValor(resultadosSplit[i+1][2]);





        }

        String cadena = "";



        return cadena;
    }

 */

    //--Metodos-privados--
    private void guardarResultado(String palabra, String dificultad){
        try{
            File fichero = new File("./assets/ranking.txt");
            //Si no existe -> lo crea
            if (!fichero.exists()){
                fichero.createNewFile();
            }
            FileWriter escritor = new FileWriter(fichero);
            Date todayDate = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

            escritor.write(user + "#" + palabra + "#" + dificultad + "#" + (5 - intentos) + "#" + format.format(todayDate));

            escritor.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private String[] cargarResultados(){
        try{
            File file = new File("./assets/ranking.txt");
            Scanner reader = new Scanner(file);
            ArrayList<String> resultados = new ArrayList<>();

            while(reader.hasNextLine()){
                resultados.add(reader.nextLine());
            }

            return (String[]) resultados.toArray();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private String getPalabra(String dificultad){
        String palabra;
        int index;

        while(true){
            index = (int) (Math.random() * palabras.length);
            if (palabras[index][1].equals(dificultad)){
                palabra = palabras[index][0];
                return palabra;
            }
        }
    }

    private String charToString(char[] conjunto){
        String cadena = "";

        for (char i:conjunto){
            cadena += i;
        }

        return cadena;

    }

    private int getValor(String dificultad){
        if(dificultad == "facil"){
            return 0;
        } else if(dificultad == "normal"){
            return 1;
        } else if(dificultad == "dificil"){
            return 2;
        }

        return -1;
    }

}
