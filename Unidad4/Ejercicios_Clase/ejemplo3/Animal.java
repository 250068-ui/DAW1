package ejemplo3;

import java.time.LocalDate;

public abstract class Animal {

    private String nombre;
    private String especie;
    private LocalDate fechaNacimiento;

    public Animal (String nombre, String especie, int year, int month, int day){

        this.nombre = nombre;

    }


    public void moverse(){

        System.out.println("El animal se ha movido");

    }

    public void describir(){

        System.out.println("Esto es un animal");

    }

    public abstract void limpiar();


}
