import java.util.Scanner;

public class Practica4{
	
		public static void main (String[] args){
			
	Scanner sc = new Scanner(System.in);
			
	final double PI = 3.1416;
	
	System.out.println("Escribe el radio del circulo a calcular");
	double radio = sc.nextDouble();
	
	double area = PI*(2*radio);
	
	System.out.printf("Sabiendo que el area del circulo es PI*radio2 y a introducido %.2f como radio, el area de su circulo es: %.2f ", radio, area);
	 		
			
	}
}
