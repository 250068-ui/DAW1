package ejemplo3;

public class Mamifero extends Animal{


    private String tipoPelo;

    public Mamifero(String nombre, String especie, int year, int month, int day, String tipoPelo){

        super(nombre,especie,year,month,day);
        this.tipoPelo = tipoPelo;
    }

    public void moverse(){

        System.out.println("El mamifero se mueve 30 metros");

    }

    @Override
    public void limpiar(){

        System.out.println("Limpia el pelo con un cepillo");
    }




}
