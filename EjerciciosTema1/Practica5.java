import java.util.Scanner;

public class Practica5{
	
		public static void main (String[] args){
			
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dame la longitud de tu habitacion con decimales");
	
	double lon = sc.nextDouble();
	
	System.out.println("Dame la anchura de tu habitacion con decimales");		
	
	double anch = sc.nextDouble();
	double supe = lon*anch;
	
	System.out.printf("Siendo la longitud " + lon + "y la anchura " + anch + "la superficie total de la habitacion es de %.4f", supe);
	
	}
}
