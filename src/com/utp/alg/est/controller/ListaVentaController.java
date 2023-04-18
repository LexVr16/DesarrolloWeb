package com.utp.alg.est.controller;

import com.utp.alg.est.model.Venta;
import com.utp.alg.est.model.dao.VentaDao;
import com.utp.alg.est.model.dao.impl.VentaDaoImp;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class ListaVentaController {

    public static void loadJTable_ListaVenta(JTable tablaVenta) {
        VentaDao ventaDao = new VentaDaoImp();
        String[] titulo = {"Id Venta", "Id Cliente", "Id Usuario", "Tipo Comprobante", "", "Serie Comprobante", "Numero Comprobante", "Fecha", "Impuesto", "Descuento", "Total", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        List<Venta> listaVenta = ventaDao.findAll();

        for (int i = 0; i < listaVenta.size(); i++) {
            Object[] datos = {
                listaVenta.listIterator(i).next().getIdUsuario(),
                listaVenta.listIterator(i).next().getIdCliente(),
                listaVenta.listIterator(i).next().getIdUsuario(),
                listaVenta.listIterator(i).next().getTipo_comprobante(),
                listaVenta.listIterator(i).next().getRuc(),
                listaVenta.listIterator(i).next().getNum_comprobante(),
                listaVenta.listIterator(i).next().getFecha_hora(),
                listaVenta.listIterator(i).next().getImpuesto(),
                listaVenta.listIterator(i).next().getDescuento(),
                listaVenta.listIterator(i).next().getTotal(),
                listaVenta.listIterator(i).next().getEstado()
            };

            modelo.addRow(datos);
        }

        tablaVenta.setModel(modelo);
    }
}
