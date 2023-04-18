package com.utp.alg.est.controller;

import com.utp.alg.est.model.Categoria;
import com.utp.alg.est.model.dao.CategoriaDao;
import com.utp.alg.est.model.dao.impl.CategoriaDaoImp;
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
public class ListaCategoriaController {

    public static DefaultTableModel loadJTable_ListaCategoria(JTable tablaCategoria) {
        CategoriaDao categoriaDao = new CategoriaDaoImp();
        String[] titulo = {"Id Categoria", "Descripcion", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        List<Categoria> listaCategoria = categoriaDao.findAll();

        for (int i = 0; i < listaCategoria.size(); i++) {
            Object[] datos = {
                listaCategoria.listIterator(i).next().getIdCategoria(),
                listaCategoria.listIterator(i).next().getDescripcion(),
                listaCategoria.listIterator(i).next().getEstado()
            };
            modelo.addRow(datos);
        }

        tablaCategoria.setModel(modelo);
        return modelo;
    }

    public static DefaultTableModel ordenarPorNombres(DefaultTableModel model, JToggleButton jTB_orderPorRazonSocial) {
        System.out.println(jTB_orderPorRazonSocial.isSelected());

        // Ordenamos 
        CategoriaDao databaseClientes = new CategoriaDaoImp();

        List<Categoria> listaCategorias = databaseClientes.findAll();

        Categoria[] categorias = new Categoria[listaCategorias.size()];

        listaCategorias.toArray(categorias);

        if (jTB_orderPorRazonSocial.isSelected()) {
            categorias = Util.ordenarCategoriaPorNombre(categorias, Util.ASCENDENTE);
            System.out.println("ASCENDENTE");
        } else {
            categorias = Util.ordenarCategoriaPorNombre(categorias, Util.DESCENDENTE);
            System.out.println("DESCENDENTE");
        }

        // Actualizamos la base de datos       
        listaCategorias.clear();

        listaCategorias.addAll(Arrays.asList(categorias));

        // Actualizamos el modelo
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        for (Categoria categoria : categorias) {
            Object[] o = {
                categoria.getIdCategoria(),
                categoria.getDescripcion(),
                categoria.getEstado()
            };
            model.addRow(o);
        }
        return model;
    }
}
