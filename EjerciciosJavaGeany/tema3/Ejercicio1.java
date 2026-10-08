/*Crea una clase Trabajador con nombre y horas semanales, y un método calcularSalarioSemanal().
 *  Las 40 primeras horas se pagan a 12 €/h y, a partir de la hora 41, a 16 €/h.
 *  Usa constantes (static final) para los precios y el límite de horas.
 *  Instancia varios trabajadores y muestra su salario.*/
 
public class Ejercicio1{
	
		public static void main (String[] args){
			
			
	Trabajador trabajador1 = new Trabajador("David");
	Trabajador trabajador2 = new Trabajador("Fran");
	
	
	trabajador1.addHoras(9);
	trabajador2.addHoras(47);
	
	System.out.println("trabajador1 tiene que cobrar " + trabajador1.calcularSalarioSemanal() + " €");
	System.out.println("trabajador2 tiene que cobrar " + trabajador2.calcularSalarioSemanal() + " €");		
			
	}
}
