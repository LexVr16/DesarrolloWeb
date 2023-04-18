package com.utp.alg.est.controller;

import com.utp.alg.est.view.JD_Rol;
import com.utp.alg.est.view.list.JD_ListaRol;

/**
 *
 * @author
 */
public class RolController {

    private static JD_Rol frmRol = new JD_Rol(null, true);

    public static void callFrmRol() {
        // Activar Rol
        frmRol.setLocationRelativeTo(null);
        frmRol.setVisible(true);
    }  
    
    public static void callFrmListaRol() {
        // Activar Articulos
        JD_ListaRol frmListaRol = new JD_ListaRol(null, true);
        frmListaRol.setLocationRelativeTo(null);
        frmListaRol.setVisible(true);
    }

    public static void ordernarPornombreDeRol() {
    }
}
