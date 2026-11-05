package ejemploDeHerencias;

public class Persona{

    private String nombre;
    private String apellido1;
    private String apellido2;

    public Persona(String nombre,String apellido1,String apellido2){

        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

    }


    @Override
    public String toString(){

        String salida = String.format("Alumno: %s %s, %s ", apellido1, apellido2, nombre);

        return salida;
    }
}
