package DAO;

import Modelo.AlumnoFP;
import Modelo.AlumnoPrimaria;

import java.util.ArrayList;

public interface AlumnoPrimariaDAO {
    public ArrayList<AlumnoPrimaria> recuperarAlumnos();

    public void insertar(AlumnoPrimaria a);

    public void eliminar(AlumnoPrimaria a);
}
