package cl.chilemarket.chilemarket.model.dto;

import java.math.BigDecimal;

public class VentaDTO {
    private String producto;
    private int cantidad;
    private BigDecimal total;

    public VentaDTO(String producto, int cantidad, BigDecimal total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public BigDecimal getTotal() { return total; }
}