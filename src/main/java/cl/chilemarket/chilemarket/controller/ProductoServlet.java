package cl.chilemarket.chilemarket.controller;

import cl.chilemarket.chilemarket.model.entity.Producto;
import cl.chilemarket.chilemarket.repository.ProductoRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductoServlet", urlPatterns = {"/productos"})
public class ProductoServlet extends HttpServlet {

    private final ProductoRepository productoRepository = new ProductoRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtiene los productos desde el repositorio
        List<Producto> listaProductos = productoRepository.obtenerTodos();
        
        request.setAttribute("productos", listaProductos);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}