package com.utp.alg.est.controller;

import static com.utp.alg.est.controller.MenuController.callFrmMenu;
import com.utp.alg.est.model.Usuario;
import com.utp.alg.est.model.dao.impl.LoginDaoImp;
import com.utp.alg.est.view.JD_Login;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class LoginController {
    
//    private static MenuController controller = new MenuController();
    
    public static void callFrmLogin() {
        JD_Login frmLogin = new JD_Login(null,true);
        frmLogin.setLocationRelativeTo(null);
        frmLogin.setVisible(true);
    }
    
    //recibe el dni, password, objeto frmLogin
    public static void validateFrmLogin(String dni, String password, JD_Login frmLogin) {
        //creo objeto login
        LoginDaoImp login = new LoginDaoImp();

        //valida el dni y password en el metodo validateLogin y devuelve el usuario
        Usuario usuario = login.validateLogin(dni, password);

        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "No se encontró Usuario, vuelva a intentarlo");
        } else {
            //llama al frm_menu y le pasan el objeto usuario
            callFrmMenu(usuario);
            frmLogin.dispose();
        }

    }
}
