package com.utp.alg.est.controller;


import com.utp.alg.est.model.Articulo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class DetalleVentaController {

    static DefaultTableModel modelo;

    public static DefaultTableModel loadJTable_ListaVenta(JTable tablaDetalleVenta) {
        String[] titulo = {"Id Art.", "Cantidad", "Descripción Producto", "Pre. Unit.", "Importe"};
        modelo = new DefaultTableModel(null, titulo);
        tablaDetalleVenta.setModel(modelo);

        return modelo;
    }

    public static void callFrmVenta(Articulo articulo, int cantidad) {

//        model = DetalleVentaController.loadJTable_ListaVenta(frmVenta.tb_detalleVenta);
        Object[] datos = {articulo.getIdArticulo(), cantidad, articulo.getDescripcion(), articulo.getPrecio_venta()};
        modelo.addRow(datos);

//        int filaTabla;
//        filaTabla = frmVenta.tb_detalleVenta.getSelectedRow() + 1;
//
//        frmVenta.tb_detalleVenta.setValueAt(articulo.getIdArticulo(), filaTabla, 0);
//        frmVenta.tb_detalleVenta.setValueAt(articulo.getDescripcion(), filaTabla, 2);
//        frmVenta.tb_detalleVenta.setValueAt(articulo.getPrecio_venta(), filaTabla, 3);
    }
}
