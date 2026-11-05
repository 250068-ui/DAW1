package ejemploenumeracion;

public class Profesor {

    private String nombre;
    private Departamento departamento;

    public Profesor(String nombre, Departamento departamento){

        this.nombre = nombre;
        this.departamento = departamento;

    }

    @Override
    public String toString(){

        return String.format("Profesor: %s, departamento %s",nombre, departamento);

    }

    public void setDepartamento(Departamento departamento){

            this.departamento = departamento;

    }

    public void cambiarDepartamento(Departamento departamento){

        if (this.nombre.equals("Edward"))
            this.departamento = departamento;

    }

    public Departamento getDepartamento(){

        return this.departamento;

    }
}
