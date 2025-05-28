package DAO;

import Modelo.Alumno;
import Modelo.AlumnoFP;
import Utils.BDConection;

import java.sql.*;
import java.util.ArrayList;

public class AlumnoFPDAOImpl implements AlumnoFpDAO {
    @Override
    public ArrayList<AlumnoFP> recuperarAlumnos() {
        ArrayList<AlumnoFP> alumnos = new ArrayList();
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
                String familia = rs.getString(8);

                alumnos.add(new AlumnoFP(id, nombre, apellidos, dni, email, direccion, telf, familia));

            }

            rs.close();
            return alumnos;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertar(AlumnoFP a) {
        String sql = "insert into alumno_fp values(?, ?, ?, ?, ?, ?, ?, ?)";
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
            pstmt.setString(8, a.getFamilia());

            pstmt.executeUpdate();
            pstmt.close();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void eliminar(AlumnoFP a) {

    }
}
