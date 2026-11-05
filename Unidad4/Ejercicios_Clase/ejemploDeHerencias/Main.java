package ejemploDeHerencias;

public class Main {

    static void main(String[] args) {

        Persona persona1 = new Persona("Fran", "Auría", "Miana");

        Persona persona2 = new Persona("Caperucita","Roja", "Con capa");

        Alumno alumno1 = new Alumno("Juan", "Perez", "Garcia", 2, 7, false);


        System.out.println(persona1);

        System.out.println(persona2);

        System.out.println(alumno1);
    }
}
