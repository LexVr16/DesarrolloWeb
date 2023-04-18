package com.utp.alg.est.model.dao.impl;

import com.utp.alg.est.model.Rol;
import com.utp.alg.est.model.dao.RolDao;
import com.utp.alg.est.model.dao.repository.DataBase;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class RolDaoImp extends DataBase implements RolDao {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public void insert(Rol rol) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("insert into rol (nombre,descripcion,estado) values(?,?,?)");

            pst.setString(1, rol.getNombre());
            pst.setString(2, rol.getDescripcion());
            pst.setInt(3, rol.getEstado());

            pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO INSERT - insert()");
        } catch (SQLException e) {
            System.out.println("ERROR TO INSERT - insert()");
            System.out.println(e);
        }
    }

    @Override
    public Rol find(Integer idRol) {

        Rol rol = null;
        try {
            con = this.getConnection();
            pst = con.prepareStatement("select * from rol where idrol= " + idRol + "");
            rs = pst.executeQuery();
            if (rs.next()) {
                rol = new Rol();

                rol.setIdRol(rs.getInt(1));
                rol.setNombre(rs.getString(2));
                rol.setDescripcion(rs.getString(3));
                rol.setEstado(rs.getByte(4));
            } else {
                System.out.println("No se encontró Rol con el idrol = " + idRol);
            }
            rs.close();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO FIND - find()");
        } catch (SQLException e) {
            System.out.println("ERROR TO FIND - find()");
            System.out.println(e);
        }
        return rol;
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> rols = new ArrayList<>();
        try {
            con = this.getConnection();
            pst = con.prepareStatement("select * from rol");
            rs = pst.executeQuery();

            while (rs.next()) {
                Rol rol = new Rol();

                rol.setIdRol(rs.getInt(1));
                rol.setNombre(rs.getString(2));
                rol.setDescripcion(rs.getString(3));
                rol.setEstado(rs.getByte(4));

                rols.add(rol);
            }
            rs.close();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO FINDALL - findAll()");
        } catch (SQLException e) {
            System.out.println("ERROR TO FINDALL - findAll()");
            System.out.println(e);
        }
        return rols;
    }

    @Override
    public void update(Rol rol) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("update rol set nombre= ?, descripcion= ?, estado= ? where idrol=?");

            pst.setString(1, rol.getNombre());
            pst.setString(2, rol.getDescripcion());
            pst.setInt(3, rol.getEstado());

            pst.setInt(4, rol.getIdRol());
            pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO UPDATE - update()");
        } catch (SQLException e) {
            System.out.println("ERROR TO UPDATE - update()");
            System.out.println(e);
        }
    }

    @Override
    public void delete(Integer idRol) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("delete from rol where idrol=?");
            pst.setInt(1, idRol);

            pst.executeUpdate();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO DELETE - delete()");
        } catch (SQLException e) {
            System.out.println("ERROR TO DELETE - delete()");
            System.out.println(e);
        }
    }

}
