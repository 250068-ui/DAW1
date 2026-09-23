import java.util.Scanner;

public class Practica6{
	
		public static void main (String[] args){
			
			Scanner sc = new Scanner(System.in);
	
	System.out.println("Escribe un caracter\n");		
			
	char letra = sc.next().charAt(0);
	
	System.out.printf("\nCodigo de ASCII de " + letra + " es %d\n\n", (int)letra);
	
	System.out.println("Los tres siguientes son: " + ((char)((int)letra+1)) + " , " + ((char)((int)letra+2)) + " y " + ((char)((int)letra+3)) );
			
	}
}
