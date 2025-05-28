import Modelo.*;
import Utils.*;
import DAO.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws SQLException {

        // Crear bd
        try{
        BDConection.crearBD();
        Connection conn = BDConection.getInstance();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Obtener alumnos del fichero
        AlumnoDao alumnoDaoFile = new AlumnoDAOFileImpl();
        ArrayList<Alumno> alumnos = alumnoDaoFile.getAlumnos();

        // insertarlos en la BDD
        AlumnoDao alumnoDAO = new AlumnoDAOImpl();
        AlumnoFPDAOImpl alumnoFPDAO = new AlumnoFPDAOImpl();


        for(AlumnoFP a : alumnos){
            a.set
            alumnoFPDAO.insertar(a);
        }

        ArrayList<Alumno> alumnosBDD = alumnoDAO.getAlumnos();

        /*
        for (Alumno a : alumnosBDD){
            System.out.println(a);
            System.out.println("------------------------");
        }
         */



    }



}
