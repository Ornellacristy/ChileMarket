package cl.chilemarket.chilemarket.controller;

import cl.chilemarket.chilemarket.model.dto.VentaDTO;
import cl.chilemarket.chilemarket.service.VentasService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "VentasServlet", urlPatterns = {"/ventas"})
public class VentasServlet extends HttpServlet {

    private final VentasService ventasService = new VentasService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<VentaDTO> ventas = ventasService.obtenerVentasRecientes();
        BigDecimal totalAcumulado = ventasService.calcularTotalVentas(ventas);

        request.setAttribute("ventas", ventas);
        request.setAttribute("totalAcumulado", totalAcumulado);
        
        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }
}