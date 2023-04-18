package com.utp.alg.est.controller;

import com.utp.alg.est.view.JD_Articulo;


/**
 *
 * @author
 */
public class ArticuloController {
    
    private static JD_Articulo frmArticulo = new JD_Articulo(null, true);
    
    public static void callFrmArticulo() {
        // Activar Articulo
        frmArticulo.setLocationRelativeTo(null);
        frmArticulo.setVisible(true);
    }
    
    public static void callFrmArticulo(String idCategoria) {
        // Activar Articulo
        frmArticulo.txt_idCategoria.setText(idCategoria);
        frmArticulo.setLocationRelativeTo(null);
        frmArticulo.setVisible(true);
    }
    
   
    
}
