package com.utp.alg.est.controller;

import com.utp.alg.est.model.Cliente;
import com.utp.alg.est.model.dao.ClienteDao;
import com.utp.alg.est.model.dao.impl.ClienteDaoImp;
import com.utp.alg.est.model.util.Util;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class ListaClienteController {
    
    public static DefaultTableModel loadJTable_ListaCliente(DefaultTableModel modelo, JTable tablaClientes) {
        ClienteDao clienteDao = new ClienteDaoImp();
        String[] titulo = {"Id Cliente", "Tipo Cliente", "Nombres", "Apellidos", "Tipo Documento", "N° Documento", "Direccion", "Telefono", "E-mail"};
         modelo = new DefaultTableModel(null, titulo);

        List<Cliente> listaCliente = clienteDao.findAll();

        for (Cliente cliente : listaCliente) {
            Object[] datos = {
                cliente.getIdCliente(),
                cliente.getTipo_cliente(),
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getTipo_documento(),
                cliente.getNum_documento(),
                cliente.getDireccion(),
                cliente.getTelefono(),
                cliente.getEmail()
            };

            modelo.addRow(datos);
        }
//        for (int i = 0; i < listaCliente.size(); i++) {
//            Object[] datos = {
//                listaCliente.listIterator(i).next().getIdCliente(),
//                listaCliente.listIterator(i).next().getTipo_cliente(),
//                listaCliente.listIterator(i).next().getNombres(),
//                listaCliente.listIterator(i).next().getApellidos(),
//                listaCliente.listIterator(i).next().getTipo_documento(),
//                listaCliente.listIterator(i).next().getNum_documento(),
//                listaCliente.listIterator(i).next().getDireccion(),
//                listaCliente.listIterator(i).next().getTelefono(),
//                listaCliente.listIterator(i).next().getEmail()
//            };
//
//            modelo.addRow(datos);
//        }
        tablaClientes.setModel(modelo);

        return modelo;
    }

    public static DefaultTableModel ordenarPorNombres(DefaultTableModel model, JToggleButton jTB_orderPorRazonSocial) {
        System.out.println(jTB_orderPorRazonSocial.isSelected());

        // Ordenamos 
        ClienteDao databaseClientes = new ClienteDaoImp();

        List<Cliente> listaClientes = databaseClientes.findAll();

        Cliente[] clientes = new Cliente[listaClientes.size()];

        listaClientes.toArray(clientes);

        if (jTB_orderPorRazonSocial.isSelected()) {
            clientes = Util.ordenarClientesPorNombre(clientes, Util.ASCENDENTE);
            System.out.println("ASCENDENTE");
        } else {
            clientes = Util.ordenarClientesPorNombre(clientes, Util.DESCENDENTE);
            System.out.println("DESCENDENTE");
        }

        // Actualizamos la base de datos       
        listaClientes.clear();

        listaClientes.addAll(Arrays.asList(clientes));
        
        // Actualizamos el modelo
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombres());
            Object[] o = {
                cliente.getIdCliente(),
                cliente.getTipo_cliente(),
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getTipo_documento(),
                cliente.getNum_documento(),
                cliente.getDireccion(),
                cliente.getTelefono(),
                cliente.getEmail()
            };
            model.addRow(o);
        }
        return model;
    }
}
