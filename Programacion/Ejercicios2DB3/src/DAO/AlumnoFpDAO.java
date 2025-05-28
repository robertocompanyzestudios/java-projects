package DAO;

import Modelo.Alumno;
import Modelo.AlumnoFP;

import java.util.ArrayList;

public interface AlumnoFpDAO {

    public ArrayList<AlumnoFP> recuperarAlumnos();

    public void insertar(AlumnoFP a);

    public void eliminar(AlumnoFP a);
}
