import java.util.Scanner;

public class Practica7{
	
		public static void main (String[] args){
			
Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad");
	
	int cant = sc.nextInt();
	
	int b500 = cant / 500;
	int reb500 = cant % 500;
	
	int b200 = reb500 /200;
	int reb200 = reb500 % 200;
	
	int b100 = reb200 / 100;
	int reb100 = reb200 % 100;
	
	int b50 = reb100 / 50;
	int reb50 = reb100 % 50;
	
	int b20 = reb50 /20;
	int reb20 = reb50 % 20;
	
	int b10 = reb20 / 10;
	int reb10 = reb20 / 10;
	
	int b5 = reb10 / 5;
	int reb5 = reb10 % 5;
	
	int b1 = reb5;

	System.out.printf("\nBilletes de 500: %d\n\nBilletes de 200: %d\n\nBilletes de 100: %d\n\nBilletes de 50: %d\n\nBilletes de 20: %d\n\nBilletes de 10: %d\n\nBilletes de 5: %d\n\nEuros en monedas: %d", b500, b200, b100, b50, b20, b10, b5, b1);
	
			
	}
}
