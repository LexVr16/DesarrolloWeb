package com.utp.alg.est.controller;

import com.utp.alg.est.model.Usuario;
import com.utp.alg.est.view.Frm_Menu;
import com.utp.alg.est.view.JD_AcercaDe;

/**
 *
 * @author 
 */
public class MenuController {
    
    public static void callFrmMenu(Usuario usuario) {
        Frm_Menu frmMenu = new Frm_Menu();
        if (1 == usuario.getIdRol()) {

            frmMenu.lbl_idUsuario.setText(String.valueOf(usuario.getIdUsuario()));
            frmMenu.lbl_nomUsuario.setText(usuario.getNombres());

            frmMenu.menu_administar.setVisible(true);
            frmMenu.setVisible(true);
        } else {

            frmMenu.lbl_idUsuario.setText(String.valueOf(usuario.getIdUsuario()));
            frmMenu.lbl_nomUsuario.setText(usuario.getNombres());

            frmMenu.menu_administar.setVisible(false);
            frmMenu.setVisible(true);
        }
    }          
    
    public static void callFrmAbout() {
        // Activar Acerca de
        JD_AcercaDe frmAbout = new JD_AcercaDe(null, true);
        frmAbout.setLocationRelativeTo(null);
        frmAbout.setVisible(true);
    }
}
