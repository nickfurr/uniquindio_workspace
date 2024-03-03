package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        
        Veterinaria perrosCariñosos = new Veterinaria("perros cariñosos");

        Mascota pedro = new Mascota(10000, 1, 1, "narana", "pedro", "gao", "mestio", "masulio");

        perrosCariñosos.setMascotas(pedro);

        Mascota camilo = new Mascota(45, 0, 0, "amarillo", "camilo","xx", "fadf", "asf");

        Mascota juan = new Mascota(45, 0, 0, "amarillo", "juan","xx", "fadf", "asf");

        perrosCariñosos.setMascotas(juan);

        perrosCariñosos.setMascotas(camilo);

        System.out.println(perrosCariñosos.getMascota());
         
        


    }
}
