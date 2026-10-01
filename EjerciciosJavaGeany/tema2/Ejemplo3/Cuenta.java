import java.util.Scanner;
public class Cuenta{
	
	private static final double REMUNERACION = 3;
	private static int siguienteNumCuenta = 1;
	
	private double saldo;
	private int numCuenta;
	private TitularCC titularCC;
	
	
	public Cuenta(TitularCC titularCC){
		
		this.saldo = 20;
		this.numCuenta = siguienteNumCuenta;
		siguienteNumCuenta += 1;
		this.titularCC = titularCC;
		
		}
	
		public void muestraSaldo(){
			
		System.out.println("El saldo es: " + saldo);	
			
		}
		
		public void muestraCuenta(){
			
				System.out.println("El numero de cuenta es: " + numCuenta);
			
		}
		
		public void ingresarDinero(double cantidad){
			
			
			saldo = saldo + cantidad;
			
			}
			
		public void sacarDinero(double cantidad){
			
		saldo -= cantidad;	
			
			
		}
		
		public static Cuenta altaNuevaCuenta(){
			
		
		String nombre = dameDato("nombre");
		String apellido1 = dameDato("primer apellido");
		String apellido2 = dameDato("segundo apellido");
		String dni = dameDato("dni");
		String email = dameDato("email");
		String telefono = dameDato("telefono");
		String calle = dameDato("calle");
		String numero = dameDato("numero");
		int piso = Integer.parseInt(dameDato("piso"));
		char letra = dameDato("letra").charAt(0);
		String poblacion = dameDato("poblacion");
		int cp = Integer.parseInt(dameDato("Codigo postal"));
		String provincia = dameDato("provincia");
		String pais = dameDato("pais");
		
		
		Direccion nuevaDireccion = new Direccion(calle, numero, piso, letra, poblacion, cp, provincia, pais);
		
		TitularCC nuevoTitular = new TitularCC(nombre, apellido1, apellido2, dni, email, telefono, nuevaDireccion);
		
		Cuenta nuevaCuenta = new Cuenta(nuevoTitular);
		
		return nuevaCuenta;
		
		}
		
		public static String dameDato(String nombreDato){
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame " + nombreDato);	
		return sc.nextLine();
		}
		
		public static void muestraRemuneracion(){
			
		System.out.println("La remuneracion de la cuenta es del " + REMUNERACION + " % anual");	
			
			
		}
		
		
		
		
	
}
