package sevices;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Funciones;
import models.Plantilla;
import repositories.RepositoryPlantilla;

@Path("/plantilla")
public class ServicePlantilla {

    RepositoryPlantilla repo;

    public ServicePlantilla() {
        this.repo = new RepositoryPlantilla();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Plantilla> getPlantilla() throws SQLException {
        return this.repo.getPlantilla();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Plantilla getBuscarPlantilla(@PathParam("id") String id) throws SQLException {
        int idempleado = Integer.parseInt(id);
        return this.repo.BuscarPlantilla(idempleado);
    }

    @GET
    @Path("buscarfuncion/{funciones}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Plantilla> getBuscarFuncion(@PathParam("funciones") String funciones) throws SQLException {
        return this.repo.BuscarPlantillaFuncion(funciones);
    }

    @GET
    @Path("funciones")
    @Produces(MediaType.APPLICATION_XML)
    public Funciones getFunciones() throws SQLException {
        return this.repo.getFunciones();
    }

    @GET
    @Path("buscarsalario/{salario}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Plantilla> getPlantillaSalario(@PathParam("salario") String salario) throws SQLException {
        int sal = Integer.parseInt(salario);
        return this.repo.getPlantillaSalario(sal);
    }
}
