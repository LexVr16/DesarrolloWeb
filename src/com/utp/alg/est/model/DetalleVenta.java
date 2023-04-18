package com.utp.alg.est.model;

/**
 *
 * @author
 */
public class DetalleVenta {

    private int idDetalle_venta;
    private int idVenta;
    private int idArticulo;
    private int cantidad;
    private double precio;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalle_venta, int idVenta, int idArticulo,
            int cantidad, double precio) {
        this.idDetalle_venta = idDetalle_venta;
        this.idVenta = idVenta;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdDetalle_venta() {
        return idDetalle_venta;
    }

    public void setIdDetalle_venta(int idDetalle_venta) {
        this.idDetalle_venta = idDetalle_venta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n DetalleVenta{"
                + "\n iddetalle_venta=" + idDetalle_venta + ""
                + "\n idVenta=" + idVenta + ""
                + "\n idArticulo=" + idArticulo + ""
                + "\n cantidad=" + cantidad + ""
                + "\n precio=" + precio + '}';
    }
}
