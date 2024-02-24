package co.edu.uniquindio.poo;

public record Veterinaria(int edad, double peso, String color, String nombre, String especie, String raza, String genero) {

    public Veterinaria{

        assert nombre != null;
        assert color != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert edad > 0;
        assert peso > 0;
    
    }


}

/*  género,.
 */