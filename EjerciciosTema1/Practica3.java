/*Escribe un programa que defina una constante que represente el número 
 * de meses del año y una variable para almacenar un número de mes,
 * inicializado con el valor que desees. El programa debe imprimir por pantalla
 *  el orden (número) de mes y la porción de año transcurrida.
 * Un ejemplo de ejecución posible:
 * 
 * Mes 8 de 12
 * 
 * Porcentaje transcurrido: 66.6667%
 * 
 * Prueba con otros valores iniciales del número de mes para asegurarte de su funcionamiento.*/
 
import java.util.Scanner;
public class Practica3{
	
		public static void main (String[] args){
			
			Scanner sc = new Scanner(System.in);
			
	final double year = 12;
	
			System.out.println("Escribe el numero referente al mes del año\n");
	
	double mesElegido = sc.nextDouble();
	
	double porcentaje = (mesElegido/year)*100;
	
	System.out.println("\nMes " + mesElegido + " de 12\n");
	
	System.out.printf("Porcentaje transcurrido: %.3f", porcentaje);
	
			
	}
}
