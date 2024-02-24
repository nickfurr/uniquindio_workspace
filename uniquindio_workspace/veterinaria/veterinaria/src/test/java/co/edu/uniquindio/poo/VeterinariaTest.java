/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        

        Veterinaria perro = new Veterinaria(8, 15.5, "blanco", "pepe", "husky", "ciberiano", "masculino");

        assertEquals("husky", perro.especie());

        assertEquals("blanco", perro.color());

        assertEquals("ciberiano", perro.raza());

        assertEquals("pepe", perro.nombre());

        assertEquals(8, perro.edad());

        assertEquals(15.5, perro.peso());

        assertEquals("masculino", perro.genero());
        
        

        

        LOG.info("Finalizando test shouldAnswerWithTrue");


    }
}
