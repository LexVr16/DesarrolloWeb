package com.utp.alg.est.controller;

import com.utp.alg.est.model.Cliente;
import com.utp.alg.est.view.JD_Venta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class VentaController {

    // Metodos de control de acceso en las capas visuales
    private static JD_Venta frmVenta = new JD_Venta(null, true);
    static DefaultTableModel model;

    public static void callFrmVenta() {
        frmVenta.setLocationRelativeTo(null);
        frmVenta.setVisible(true);
    }

    public static void callFrmVenta(String idUsuario, String nombreUsuario) {
        System.out.println("idUsuario " + idUsuario);
        System.out.println("nombreUsuario " + nombreUsuario);

        frmVenta.txt_usuario.setText(nombreUsuario);
        frmVenta.txt_idUsuario.setText(idUsuario);
        frmVenta.txt_estadoVenta.setText("0");
        frmVenta.setLocationRelativeTo(null);
        frmVenta.setVisible(true);
    }

    public static void callFrmVenta(Cliente cliente) {

        frmVenta.txt_idCliente.setText(String.valueOf(cliente.getIdCliente()));
        frmVenta.txt_nombresClie.setText(cliente.getNombres());
        frmVenta.txt_apellidosClie.setText(cliente.getApellidos());
        frmVenta.txt_direccionClie.setText(cliente.getDireccion());
        frmVenta.txt_dniClie.setText(String.valueOf(cliente.getNum_documento()));
        frmVenta.txt_telfClie.setText(String.valueOf(cliente.getTelefono()));
        frmVenta.txt_emailClie.setText(String.valueOf(cliente.getEmail()));

        frmVenta.setVisible(true);
    }

    

}
