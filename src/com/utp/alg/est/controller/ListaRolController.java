package com.utp.alg.est.controller;

import com.utp.alg.est.model.Rol;
import com.utp.alg.est.model.dao.RolDao;
import com.utp.alg.est.model.dao.impl.RolDaoImp;
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
public class ListaRolController {

    public static DefaultTableModel loadJTable_ListaRol(JTable tablaRol) {
        RolDao rolDao = new RolDaoImp();
        String[] titulo = {"Id Rol", "Nombre", "Descripción", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        List<Rol> listaRol = rolDao.findAll();

        for (int i = 0; i < listaRol.size(); i++) {
            Object[] datos = {
                listaRol.listIterator(i).next().getIdRol(),
                listaRol.listIterator(i).next().getNombre(),
                listaRol.listIterator(i).next().getDescripcion(),
                listaRol.listIterator(i).next().getEstado()
            };

            modelo.addRow(datos);
        }
        tablaRol.setModel(modelo);
        return modelo;
    }

    public static DefaultTableModel ordenarPorNombres(DefaultTableModel model, JToggleButton jTB_orderPorRazonSocial) {
        System.out.println(jTB_orderPorRazonSocial.isSelected());

        // Ordenamos 
        RolDao databaseClientes = new RolDaoImp();

        List<Rol> listaArticulos = databaseClientes.findAll();

        Rol[] articulos = new Rol[listaArticulos.size()];

        listaArticulos.toArray(articulos);

        if (jTB_orderPorRazonSocial.isSelected()) {
            articulos = Util.ordenarRolPorNombre(articulos, Util.ASCENDENTE);
            System.out.println("ASCENDENTE");
        } else {
            articulos = Util.ordenarRolPorNombre(articulos, Util.DESCENDENTE);
            System.out.println("DESCENDENTE");
        }

        // Actualizamos la base de datos       
        listaArticulos.clear();

        listaArticulos.addAll(Arrays.asList(articulos));

        // Actualizamos el modelo
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        for (Rol articulo : articulos) {
            Object[] o = {
                articulo.getIdRol(),
                articulo.getNombre(),
                articulo.getDescripcion(),
                articulo.getEstado()
            };
            model.addRow(o);
        }
        return model;
    }
}
