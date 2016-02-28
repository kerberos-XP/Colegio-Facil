package server.service;

import server.model.Alumno;

/**
 *
 * @author Omar Paché
 */
public class AlumnoServiceImpl implements AlumnoService{

    @Override
    public Alumno getJuanPerez() {
        Alumno alumno = new Alumno();
        alumno.setId(1);
        alumno.setEdad(10);
        alumno.setNombre("Juan Perez");
        return alumno;
    }
    
}
