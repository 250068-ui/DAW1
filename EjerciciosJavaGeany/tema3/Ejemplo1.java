/*Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
 *  Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
 *  Sólo se tiene en cuenta las horas, los minutos no se deben introducir por teclado.
 *  Además, si la hora introducida es distinta del rango 0-23 se indicará por pantalla que no es correcta.*/

import java.util.Scanner;

public class Ejemplo1{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int horaElegida;
	
	do{
	
	System.out.println("Tria una hora");
	horaElegida = sc.nextInt();
	
	if(horaElegida < 0 || horaElegida >23){
		
		System.out.println("A hora no ye valida");
		horaElegida = sc.nextInt();
		
	}else if(horaElegida >= 6 && horaElegida <=12){
		
			System.out.println("Bons dias");
		
	}else if(horaElegida > 12 && horaElegida < 21){
		
		System.out.println("Buenas tardes");
		
	}else{
		
	System.out.println("Bona nuei");
		
	}
	}while(horaElegida >=0 || horaElegida <=23);
		
		
		}
	
	
	}
