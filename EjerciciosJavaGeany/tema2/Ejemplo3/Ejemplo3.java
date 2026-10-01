public class Ejemplo3{
	
		public static void main (String[] args){
			
	Direccion direccionFran = new Direccion("Avenida de la luz", "47", 1, 'A', "Orés", 50619, "Zaragoza", "España");		
	
	TitularCC titularFran = new TitularCC("Fran", "Auría", "Miana", "26058749", "fran@mail.com", "785940382", direccionFran);
	
	Cuenta cuentaFran = new Cuenta(titularFran);
			
	cuentaFran.muestraSaldo();
	
	cuentaFran.ingresarDinero(1000);
	
	cuentaFran.muestraSaldo();
	
	cuentaFran.sacarDinero(-200);
	
	cuentaFran.muestraSaldo();
	
	
	Cuenta.muestraRemuneracion();

	Cuenta nuevaCuenta = Cuenta.altaNuevaCuenta();
	
	cuentaFran.muestraCuenta();
	nuevaCuenta.muestraCuenta();
		
	}
}
