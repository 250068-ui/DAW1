package ejemplo3;

public class Ave extends Animal{

    private double envergaduraAlas;

    public Ave(String nombre, String especie, int year, int month, int day, double envergaduraAlas){

        super(nombre, especie, year, month,day);
        this.envergaduraAlas = envergaduraAlas;

    }


    @Override
    public void limpiar(){

        System.out.println("Soplale las plumas");

    }
}
