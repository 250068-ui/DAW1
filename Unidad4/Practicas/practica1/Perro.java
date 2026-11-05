package practica1;

public class Perro {

    private String nombre;
    private String raza;
    private String color;


    public Perro(String nombre, String raza, String color){

        this.nombre = nombre;
        this.raza = raza;
        this.color = color;



    }


    public void acariciarPerro(){

        if(this.raza.equals("Setter")){

            System.out.println("Acariciaste a tu Setter");
        }else if (this.raza.equals("Braco")){

            System.out.println("Acariciaste a tu Braco");

        }else if (this.raza.equals("Podenco")){

            System.out.println("Acariciaste a tu Podenco");

        }else {

            System.out.println("Acariciaste a tu perro");
        }


    }
}
