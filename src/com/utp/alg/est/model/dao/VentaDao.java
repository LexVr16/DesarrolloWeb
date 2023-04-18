package com.utp.alg.est.model.dao;

import com.utp.alg.est.model.Venta;

/**
 *
 * @author
 */
public interface VentaDao extends EntidadDao<Venta, Integer> {

    public String findLastSerieComprobante();

    public int findLastNumeroComprobante();

    public int getLastIdVenta();

    void updateEstadoVenta(Integer idVenta);
}
