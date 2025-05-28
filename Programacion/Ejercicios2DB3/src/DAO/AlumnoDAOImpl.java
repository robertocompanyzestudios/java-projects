package DAO;

import Modelo.Alumno;
import Utils.BDConection;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoDAOImpl implements AlumnoDao {
    @Override
    public ArrayList<Alumno> getAlumnos() {
        ArrayList alumnos = new ArrayList();
        String sql = "select * from alumno";

        try {
            Connection conn = BDConection.getInstance();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                    int id = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellidos = rs.getString(3);
                    String dni = rs.getString(4);
                    String email = rs.getString(5);
                    String direccion = rs.getString(6);
                    String telf = rs.getString(7);

                    alumnos.add(new Alumno(id, nombre, apellidos, dni, email, direccion, telf));

            }

            rs.close();
            return alumnos;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertar(Alumno a) {
        String sql = "insert into alumno values(?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = BDConection.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, a.getId());
            pstmt.setString(2, a.getNombre());
            pstmt.setString(3, a.getApellidos());
            pstmt.setString(4, a.getDni());
            pstmt.setString(5, a.getEmail());
            pstmt.setString(6, a.getDireccion());
            pstmt.setString(7, a.getTelefono());

            pstmt.executeUpdate();
            pstmt.close();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
