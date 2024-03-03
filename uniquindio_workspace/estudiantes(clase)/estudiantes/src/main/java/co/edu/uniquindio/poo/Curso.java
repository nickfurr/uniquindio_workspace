package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*public class Curso {

    private String nombre;
    private ArrayList <Estudiantes> estudiantes;

    public Curso(String curso){

        this.nombre = curso;


       }

    public void inColection (Estudiantes estudiante){
    
        this.estudiantes.add(estudiante);

    } 

    public ArrayList<Estudiantes> retunColections(){

        return estudiantes;
    }

    


}*/

public class Curso {

    private final String nombre;
    private final Collection <Estudiantes> listaEstudiantes;

    public Curso(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiantes>();
    }

    public String getNombre 

}
