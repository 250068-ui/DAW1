//Programa que pide dos numeros decimales (flotantes y por teclado) y luego muestra su division con tres decimales.

import java.util.Scanner;
public class Ejercicio3{
	
		public static void main (String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Escribe el primer numero decimal");
			
			double num1 = sc.nextDouble();
			
			System.out.println("Escribe el segundo numero decimal");
			
			double num2 = sc.nextDouble();
			
			sc.close();
			
			double div = num1 / num2;
			
			System.out.printf("La division de " + num1 + " y de " + num2 + " da como resultado %.3f ", div);
			
			
			
			
	}

} 
