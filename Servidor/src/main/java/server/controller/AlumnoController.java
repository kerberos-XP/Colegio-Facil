package server.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import server.model.Alumno;
import server.service.AlumnoService;
import server.service.AlumnoServiceImpl;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class AlumnoController {

    /**
     * Manejo de peticiones HTTP de tipo GET
     *
     * @return Objeto de tipo Alumno retornado en formato JSON
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Alumno getAlumno() {
        AlumnoService servicioAlumnos = new AlumnoServiceImpl();
        return servicioAlumnos.getJuanPerez();
    }
}
