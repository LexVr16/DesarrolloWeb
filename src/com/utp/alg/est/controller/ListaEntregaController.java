package com.utp.alg.est.controller;

import com.utp.alg.est.model.dao.EntregaDao;
import com.utp.alg.est.model.dao.impl.EntregaDaoImpl;
import com.utp.alg.est.view.list.JD_ListaEntrega;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class ListaEntregaController {

    public static void callJDEntrega() {
        JD_ListaEntrega frmListaEntrega = new JD_ListaEntrega(null, true);
        // Activar Articulo
        frmListaEntrega.setLocationRelativeTo(null);
        frmListaEntrega.setVisible(true);
    }

    public static DefaultTableModel loadJTable_ListaEntregaPending(JTable tabla) {
        EntregaDao entregaDao = new EntregaDaoImpl();
        String[] titulo = {"Id Entrega", "Id Venta", "Cliente", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);

        List<Map<String, String>> listaEntrega = entregaDao.findAllEntregaPending();
        for (Map<String, String> entrega : listaEntrega) {
//            if (entrega.get("Estado").equals("0")) {
//                entrega.put("Estado", "PENDIENTE");
//            } else {
//                entrega.put("Estado", "ENTREGADO");
//            }
            Object[] datos = {
                entrega.get("idEntrega"),
                entrega.get("idVenta"),
                entrega.get("Cliente"),
                entrega.get("Estado")
            };
            modelo.addRow(datos);
        }
        tabla.setModel(modelo);
        return modelo;
    }

    public static DefaultTableModel loadJTable_ListaEntregaComplete(JTable tabla) {
        EntregaDao entregaDao = new EntregaDaoImpl();
        String[] titulo = {"Id Entrega", "Id Venta", "Cliente", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);

        List<Map<String, String>> listaEntrega = entregaDao.findAllEntregaComplete();
        for (Map<String, String> entrega : listaEntrega) {
//            if (entrega.get("Estado").equals("0")) {
//                entrega.put("Estado", "PENDIENTE");
//            } else {
//                entrega.put("Estado", "ENTREGADO");
//            }
            Object[] datos = {
                entrega.get("idEntrega"),
                entrega.get("idVenta"),
                entrega.get("Cliente"),
                entrega.get("Estado")
            };
            modelo.addRow(datos);
        }
        tabla.setModel(modelo);
        return modelo;
    }
}
