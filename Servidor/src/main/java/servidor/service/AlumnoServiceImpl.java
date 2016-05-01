package servidor.service;

import servidor.vo.AlumnoVO;

/**
 *
 * @author Omar Paché
 */
public class AlumnoServiceImpl implements AlumnoService{

    @Override
    public AlumnoVO getJuanPerez() {
        AlumnoVO alumno = new AlumnoVO();
        alumno.setId(1);
        alumno.setEdad(10);
        alumno.setNombre("Juan Perez");
        return alumno;
    }
    
}
