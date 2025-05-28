package DAO;

import Modelo.Alumno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoDAOFileImpl implements AlumnoDao{
    private static final String  rutaAlumnos = "./assets/alumnos.txt";


    @Override
    public ArrayList<Alumno> getAlumnos() {
        try{
            File archivo = new File(rutaAlumnos);
            Scanner reader = new Scanner(archivo);
            ArrayList<Alumno> alumnos = new ArrayList<>();
            String[] data;
            while (reader.hasNextLine()){
                data = reader.nextLine().split("&");
                alumnos.add(new Alumno(Integer.valueOf(data[0]), data[1], data[2],
                        data[3], data[4], data[5], data[6]));
            }

            return alumnos;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void insertar(Alumno a) {
        System.out.println("Sin implementar");
    }
}
