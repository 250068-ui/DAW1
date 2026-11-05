package ejemploenumeracion;

public class Main {
    static void main() {
        Profesor profesor1 = new Profesor("Edward", Departamento.INFORMATICA);

        Profesor profesor2 = new Profesor("Gemma", Departamento.INFORMATICA);

        Profesor profesor3 = new Profesor("Joselu", Departamento.INFORMATICA);

        Profesor profesor4 = new Profesor("Roberto", Departamento.ELECTRICIDAD);

        System.out.println(profesor3);

        profesor1.cambiarDepartamento(Departamento.OBRA_CIVIL);

        System.out.println(profesor1);

    }
}
