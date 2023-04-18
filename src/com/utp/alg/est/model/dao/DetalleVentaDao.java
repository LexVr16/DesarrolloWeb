package com.utp.alg.est.model.dao;

import com.utp.alg.est.model.DetalleVenta;

/**
 *
 * @author
 */
public interface DetalleVentaDao extends  EntidadDao<DetalleVenta, Integer>{
    public int getLastIdDetalleVenta();
}
