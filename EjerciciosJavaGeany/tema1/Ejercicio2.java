//Programa que pide una cantidad de segundos y devuelve a cuantas horas, minutos y segundos corresponde

import java.util.Scanner;
public class Ejercicio2{
	
		public static void main (String[] args){
			
		Scanner sc = new Scanner(System.in);
			
			int segTotales;
			int horas;
			int minutos;
			int segundos;
			int restoHoras;
			int restoMin;
			
			System.out.println("Escribeme la cantidad total de segundos");
			
			segTotales= sc.nextInt();
			horas = segTotales / 3600;
			restoHoras = segTotales % 3600;
			minutos = restoHoras / 60;
			restoMin = restoHoras % 60;
			segundos = restoMin;
			
			
			
			
			System.out.printf("%d segundos es equivalente a %d horas, %d minutos y %d segundos.", segTotales, horas, minutos, segundos);
			
			
			
	}
}
