//Programa que suma, resta, multiplica y divide (con decimales) dos numeros enteros introducidos por teclado
import java.util.Scanner;
public class Ejemplo6{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	/*String num1 = "1234";
	String num2 = "5678";
	
	int entero1 = Integer.parseInt(num1);
	int	entero2 = Integer.parseInt(num2);
	
	System.out.print(entero1 + entero2);*/
	
	System.out.println("Introduce el primer numero y pulsa ENTER");	
	int a= sc.nextInt();
	
	System.out.println("Introduce el segundo numero y pulsa ENTER");	
	int b= sc.nextInt();
	
	int suma = a + b;
	
	System.out.println("El resultado de la suma es " + suma);	
		
	}
	
}
