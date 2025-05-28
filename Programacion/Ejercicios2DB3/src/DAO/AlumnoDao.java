package DAO;

import Modelo.Alumno;

import java.util.ArrayList;

public interface AlumnoDao {
    public ArrayList<Alumno> getAlumnos();

    public void insertar(Alumno a);

}
