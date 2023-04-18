package com.utp.alg.est.controller;

import com.utp.alg.est.view.JD_Usuario;

/**
 *
 * @author
 */
public class UsuarioController {
    
    static JD_Usuario frmUsuario = new JD_Usuario(null, true);
    
    public static void callFrmUsuario() {
        // Activar Usuario

        frmUsuario.setLocationRelativeTo(null);
        frmUsuario.setVisible(true);
    }
    
    public static void callFrmRol(String idRol) {
        // Activar Rol
        frmUsuario.txt_idRol.setText(idRol);
        frmUsuario.setLocationRelativeTo(null);
        frmUsuario.setVisible(true);
    }
}
