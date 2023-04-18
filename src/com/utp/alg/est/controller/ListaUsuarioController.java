package com.utp.alg.est.controller;

import com.utp.alg.est.model.Usuario;
import com.utp.alg.est.model.dao.UsuarioDao;
import com.utp.alg.est.model.dao.impl.UsuarioDaoImp;
import com.utp.alg.est.model.util.Util;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class ListaUsuarioController {

    public static DefaultTableModel loadJTable_ListaUsuario(JTable tablaUsuario) {
        UsuarioDao usuarioDao = new UsuarioDaoImp();
        String[] titulo = {"Id User", "Id Rol", "Nombres", "Apellidos", "Tipo Documento", "N° Documento", "Direccion", "Telefono", "Email", "Password", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        List<Usuario> listaUsuario = usuarioDao.findAll();

        for (int i = 0; i < listaUsuario.size(); i++) {
            Object[] datos = {
                listaUsuario.listIterator(i).next().getIdUsuario(),
                listaUsuario.listIterator(i).next().getIdRol(),
                listaUsuario.listIterator(i).next().getNombres(),
                listaUsuario.listIterator(i).next().getApellidos(),
                listaUsuario.listIterator(i).next().getTipo_documento(),
                listaUsuario.listIterator(i).next().getNum_documento(),
                listaUsuario.listIterator(i).next().getDireccion(),
                listaUsuario.listIterator(i).next().getTelefono(),
                listaUsuario.listIterator(i).next().getEmail(),
                listaUsuario.listIterator(i).next().getPassword(),
                listaUsuario.listIterator(i).next().getEstado()
            };

            modelo.addRow(datos);
        }

        tablaUsuario.setModel(modelo);
        return modelo;
    }

    public static DefaultTableModel ordenarPorNombres(DefaultTableModel model, JToggleButton jTB_orderPorRazonSocial) {
        System.out.println(jTB_orderPorRazonSocial.isSelected());

        // Ordenamos 
        UsuarioDao dataBaseUsuario = new UsuarioDaoImp();

        List<Usuario> listaUsuarios = dataBaseUsuario.findAll();

        Usuario[] usuarios = new Usuario[listaUsuarios.size()];

        listaUsuarios.toArray(usuarios);

        if (jTB_orderPorRazonSocial.isSelected()) {
            usuarios = Util.ordenarUsuarioPorNombre(usuarios, Util.ASCENDENTE);
            System.out.println("ASCENDENTE");
        } else {
            usuarios = Util.ordenarUsuarioPorNombre(usuarios, Util.DESCENDENTE);
            System.out.println("DESCENDENTE");
        }

        // Actualizamos la base de datos       
        listaUsuarios.clear();

        listaUsuarios.addAll(Arrays.asList(usuarios));

        // Actualizamos el modelo
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        for (Usuario usuario : usuarios) {
            Object[] o = {
                usuario.getIdUsuario(),
                usuario.getIdRol(),
                usuario.getNombres(),
                usuario.getApellidos(),
                usuario.getTipo_documento(),
                usuario.getNum_documento(),
                usuario.getDireccion(),
                usuario.getTelefono(),
                usuario.getEmail(),
                usuario.getPassword(),
                usuario.getEstado()
            };
            model.addRow(o);
        }
        return model;
    }
}
