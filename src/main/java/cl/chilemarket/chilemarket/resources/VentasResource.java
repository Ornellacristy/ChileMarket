package cl.chilemarket.chilemarket.resources;

import cl.chilemarket.chilemarket.model.dto.VentaDTO;
import cl.chilemarket.chilemarket.service.VentasService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("ventas")
public class VentasResource {

    private final VentasService ventasService = new VentasService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<VentaDTO> obtenerVentasJson() {
        return ventasService.obtenerVentasRecientes();
    }
}