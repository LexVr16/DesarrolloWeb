package com.utp.alg.est.controller;

import com.utp.alg.est.model.Articulo;
import com.utp.alg.est.model.dao.ArticuloDao;
import com.utp.alg.est.model.dao.impl.ArticuloDaoImp;
import com.utp.alg.est.model.util.Util;
import com.utp.alg.est.view.list.JD_ListaArticulo;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class ListaArticuloController {

    public static void callFrmListaArticulos() {
        // Activar Articulos
        JD_ListaArticulo frmListaArticulos = new JD_ListaArticulo(null, true);
        frmListaArticulos.setLocationRelativeTo(null);
        frmListaArticulos.setVisible(true);
    }

    public static DefaultTableModel loadJTable_ListaArticulo(JTable tablaArticulos) {

        String[] titulo = {"Id Articulo", "Id Categoria", "Descripcion", "Precio Venta", "Stock", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);

        ArticuloDao articuloDao = new ArticuloDaoImp();

        List<Articulo> listaArticulo = articuloDao.findAll();

        for (Articulo articulo : listaArticulo) {
            Object[] objectData = {
                articulo.getIdArticulo(),
                articulo.getIdCategoria(),
                articulo.getDescripcion(),
                articulo.getPrecio_venta(),
                articulo.getStock(),
                articulo.getEstado()
            };
            modelo.addRow(objectData);
        }

        tablaArticulos.setModel(modelo);
        return modelo;
    }

    public static DefaultTableModel ordenarPorNombres(DefaultTableModel model, JToggleButton jTB_orderPorRazonSocial) {
        System.out.println(jTB_orderPorRazonSocial.isSelected());

        // Ordenamos 
        ArticuloDao databaseClientes = new ArticuloDaoImp();

        List<Articulo> listaArticulos = databaseClientes.findAll();

        Articulo[] articulos = new Articulo[listaArticulos.size()];

        listaArticulos.toArray(articulos);

        if (jTB_orderPorRazonSocial.isSelected()) {
            articulos = Util.ordenarArticulosPorNombre(articulos, Util.ASCENDENTE);
            System.out.println("ASCENDENTE");
        } else {
            articulos = Util.ordenarArticulosPorNombre(articulos, Util.DESCENDENTE);
            System.out.println("DESCENDENTE");
        }

        // Actualizamos la base de datos       
        listaArticulos.clear();

        listaArticulos.addAll(Arrays.asList(articulos));

        // Actualizamos el modelo
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (Articulo articulo : articulos) {
            Object[] objectData = {
                articulo.getIdArticulo(),
                articulo.getIdCategoria(),
                articulo.getDescripcion(),
                articulo.getPrecio_venta(),
                articulo.getStock(),
                articulo.getEstado()
            };
            model.addRow(objectData);
        }
        return model;
    }
}
