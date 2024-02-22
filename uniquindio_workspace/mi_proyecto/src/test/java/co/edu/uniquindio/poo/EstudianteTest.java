/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import co.edu.uniquindio.poo.EstudianteTest;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosCompletos(){

        LOG.info("inicio de prueba de datos completos");

        Estudiante estudiante = new Estudiante("carlos","gomez","2521456","carlosgomes@gmail.com","55"); 

        assertEquals("carlos", estudiante.nombres());


    }

    
    
}
