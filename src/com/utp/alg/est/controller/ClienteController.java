package com.utp.alg.est.controller;

import com.utp.alg.est.view.JD_Cliente;
import com.utp.alg.est.view.list.JD_ListaCliente;


/**
 *
 * @author 
 */
public class ClienteController {

    public static void callFrmCliente() {
        // Activar Cliente
        JD_Cliente frmCliente = new JD_Cliente(null, true);
        frmCliente.setLocationRelativeTo(null);
        frmCliente.setVisible(true);
    }

    public static void callFrmListaClientes() {
        // Activar Cliente
        JD_ListaCliente frmListaCliente = new JD_ListaCliente(null, true);
        frmListaCliente.setLocationRelativeTo(null);
        frmListaCliente.setVisible(true);
    }
}
