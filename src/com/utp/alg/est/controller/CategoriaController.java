package com.utp.alg.est.controller;

import com.utp.alg.est.view.JD_Categoria;
import com.utp.alg.est.view.list.JD_ListaCategoria;

/**
 *
 * @author
 */
public class CategoriaController {

    public static void callFrmCategoria() {
        // Activar Categoria
        JD_Categoria jDCategoria = new JD_Categoria(null, true);
        jDCategoria.setLocationRelativeTo(null);
        jDCategoria.setVisible(true);
    }

    public static void callFrmListaCategoria() {
        // Activar Categoria
        JD_ListaCategoria frmListaCategoria = new JD_ListaCategoria(null, true);
        frmListaCategoria.setLocationRelativeTo(null);
        frmListaCategoria.setVisible(true);
    }

   
}
