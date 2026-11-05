package ejemplo1;
//Crea una clase Persona con los atributos nombre y fecha de nacimiento.
//Agrega un método presentarse() que muestre un mensaje como "Hola, me llamo [nombre] y tengo [edad] años".
//Luego, crea varias instancias de Persona y llama al método presentarse() en cada una.

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, int year, int month, int day){

        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.of(year, month, day);

    }


    public String presentarse(){

        int edad = (Period.between(fechaNacimiento, LocalDate.now())).getYears() ;

        String presentarse = String.format("Hola, me llamo %s y tengo %d años", nombre, edad);
        return presentarse;

    }


}
