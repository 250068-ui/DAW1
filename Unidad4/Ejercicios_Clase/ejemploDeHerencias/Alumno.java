package ejemploDeHerencias;

public class Alumno extends Persona{

    private int numCurso;
    private int notaMedia;
    private boolean haTitulado;

    public Alumno(String nombre, String apellido1, String apellido2, int numCurso, int notaMedia, boolean haTitulado){

        super(nombre, apellido1, apellido2);

        this.numCurso = numCurso;
        this.notaMedia = notaMedia;
        this.haTitulado = haTitulado;

    }



}
