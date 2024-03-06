package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Veterinaria {

    private final String nombre;
    private final Collection<Mascota> mascotas;
    
    

    public Veterinaria(String nombre){

        assert nombre != null && nombre != "":"no se permiten nombres nulos";
        this.nombre = nombre;
        this.mascotas = new LinkedList<Mascota>();
        

    }


    /*
     * Este metodo verifica si hay id repetido a la hora de igresar elementos a la coleccion
     * de mascotas, si esta vacia la lista agrega y si hay dos iguales lanza excepcion.
     */

     /* 
    public void setMascotas (Mascota inMascota){
        
        if (this.mascotas.isEmpty()){

            mascotas.add(inMascota);

        }

        boolean agregar = true;
  
        for(Mascota a : this.mascotas){
     
            if (a.ID() == inMascota.ID()){

                agregar = false;
      
            }
            
        }

        if (agregar){

            this.mascotas.add(inMascota);
            
        }


       
        
        
   
    }
 */

    public void setMascotas (Mascota inMascota){
        
        if (this.mascotas.isEmpty()){

            mascotas.add(inMascota);

        }else{

            for (Mascota mascota : mascotas) {
                if (mascota.ID() == inMascota.ID()){
    
                    assert false :"el elemento esta repetido" ;
                }
            }
        }

        
    }

    public Collection<Mascota> getMascota (){

        return this.mascotas;
    }

    /*
     * este metodo crea una sublista iterando y comparando la edad de las instancias
     * dentro de la coleccion, y guardando en la sublista las instancias con edad mayor a diez
     */
    public Collection<Mascota> buscarMayoresDiez (){

        Collection <Mascota> mayoresDiez = new LinkedList<>();

        for (Mascota mascota : this.mascotas ){

            if (mascota.edad() > 10){

                mayoresDiez.add(mascota);

            }

        }

        return mayoresDiez;
    }

    private boolean compararExistencia (Mascota mascotaIn){

            boolean resultado = false;

        for (Mascota mascota : this.mascotas) {

            if (mascota.nombre().equals(mascotaIn.nombre())){
                
                resultado = true;

            }
            

        }

        return resultado;
    }
 
}
