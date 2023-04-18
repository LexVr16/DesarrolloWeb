package com.utp.alg.est.model.dao.impl;

import com.utp.alg.est.model.Cliente;
import com.utp.alg.est.model.dao.ClienteDao;
import com.utp.alg.est.model.dao.repository.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class ClienteDaoImp extends DataBase implements ClienteDao {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public void insert(Cliente cliente) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("insert into cliente (tipo_cliente,nombres,apellidos,tipo_documento,num_documento,direccion,telefono,email) values(?,?,?,?,?,?,?,?)");

            pst.setString(1, cliente.getTipo_cliente());
            pst.setString(2, cliente.getNombres());
            pst.setString(3, cliente.getApellidos());
            pst.setString(4, cliente.getTipo_documento());
            pst.setInt(5, cliente.getNum_documento());
            pst.setString(6, cliente.getDireccion());
            pst.setInt(7, cliente.getTelefono());
            pst.setString(8, cliente.getEmail());

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
    public Cliente find(Integer idCliente) {
        Cliente cliente = null;
        try {
            con = this.getConnection();
            pst = con.prepareStatement("select * from cliente where idcliente= " + idCliente + "");
            rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setTipo_cliente(rs.getString(2));
                cliente.setNombres(rs.getString(3));
                cliente.setApellidos(rs.getString(4));
                cliente.setTipo_documento(rs.getString(5));
                cliente.setNum_documento(rs.getInt(6));
                cliente.setDireccion(rs.getString(7));
                cliente.setTelefono(rs.getInt(8));
                cliente.setEmail(rs.getString(9));
            } else {
                System.out.println("No se encontró Cliente con el idcliente = " + idCliente);
            }
            rs.close();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO FIND - find()");
        } catch (SQLException e) {
            System.out.println("ERROR TO FIND - find()");
            System.out.println(e);
        }
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            con = this.getConnection();
            pst = con.prepareStatement("select * from cliente");
            rs = pst.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt(1));
                cliente.setTipo_cliente(rs.getString(2));
                cliente.setNombres(rs.getString(3));
                cliente.setApellidos(rs.getString(4));
                cliente.setTipo_documento(rs.getString(5));
                cliente.setNum_documento(rs.getInt(6));
                cliente.setDireccion(rs.getString(7));
                cliente.setTelefono(rs.getInt(8));
                cliente.setEmail(rs.getString(9));

                clientes.add(cliente);
            }
            rs.close();
            pst.close();
            con.close();
            System.out.println("SUCCESS TO FINDALL - findAll()");
        } catch (SQLException e) {
            System.out.println("ERROR TO FINDALL - findAll()");
            System.out.println(e);
        }
        return clientes;
    }

    @Override
    public void update(Cliente cliente) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("update cliente set tipo_cliente=?, nombres=?,"
                    + " apellidos=?, tipo_documento=?, num_documento=?, direccion=?,"
                    + " telefono=?, email=? where idcliente=?");

            pst.setString(1, cliente.getTipo_cliente());
            pst.setString(2, cliente.getNombres());
            pst.setString(3, cliente.getApellidos());
            pst.setString(4, cliente.getTipo_documento());
            pst.setInt(5, cliente.getNum_documento());
            pst.setString(6, cliente.getDireccion());
            pst.setInt(7, cliente.getTelefono());
            pst.setString(8, cliente.getEmail());

            pst.setInt(9, cliente.getIdCliente());
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
    public void delete(Integer idCliente) {
        try {
            con = this.getConnection();
            pst = con.prepareStatement("delete from cliente where idcliente=?");
            pst.setInt(1, idCliente);

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
