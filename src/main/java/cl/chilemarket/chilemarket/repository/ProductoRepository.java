package cl.chilemarket.chilemarket.repository;

import cl.chilemarket.chilemarket.model.entity.Producto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {

    public List<Producto> obtenerTodos() {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Queso Artesanal Biobío", "Queso madurado de la región", new BigDecimal("8500.00"), 50, "Biobío"));
        lista.add(new Producto("Miel Organica", "Miel pura de bosque nativo", new BigDecimal("6200.00"), 30, "Biobío"));
        return lista;
    }
}