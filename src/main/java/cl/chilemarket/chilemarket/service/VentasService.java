package cl.chilemarket.chilemarket.service;

import cl.chilemarket.chilemarket.model.dto.VentaDTO;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class VentasService {

    public List<VentaDTO> obtenerVentasRecientes() {
        return Arrays.asList(
            new VentaDTO("Queso Artesanal Biobío", 3, new BigDecimal("25500.00")),
            new VentaDTO("Miel Organica", 5, new BigDecimal("31000.00")),
            new VentaDTO("Queso Artesanal Biobío", 2, new BigDecimal("17000.00"))
        );
    }

    public BigDecimal calcularTotalVentas(List<VentaDTO> ventas) {
        return ventas.stream()
                .map(VentaDTO::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}