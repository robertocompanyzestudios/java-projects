import java.io.File;
import java.util.Scanner;

public class Maze {
    private char[][] map;
    private String filename;
    private boolean loaded;
    private int startI;
    private int startJ;
    private int endI;
    private int endJ;


    public void loadMaze(){
        String filename = Interface.getString("Introduzca el nombre del fichero: (fichero.txt)");


        try {
            File file = new File(Config.MAZES_PATH + filename);
            this.filename= filename;
            Scanner reader = new Scanner(file);
            int x = 1;
            int y = reader.nextLine().length();
            while (reader.hasNextLine()){
                reader.nextLine();
                x++;
            }
            reader.close();
            char[][] maze = new char[x][y];
            reader = new Scanner(file);

            //Se van introduciendo las líneas en la matriz
            while(reader.hasNextLine()){
                for(int i = 0; i<maze.length; i++){
                    maze[i] = reader.nextLine().toCharArray();
                }
            }

            this.map = maze;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public String showMap(){
        String maze = "";
        for(char[] i : this.map){
            for (char j : i){
                maze = maze + j;
            }
            maze = maze + "\n";
        }
        return maze;
    }








}
