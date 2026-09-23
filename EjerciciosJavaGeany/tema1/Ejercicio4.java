// Una variable precio y que calcule el precio con iva (que sea facil de cambiar)

public class Ejercicio4{
	
	public static void main(String[] args){
		
		
		final double IVA = 21;
		
		double precioSinIva= 34.34;
		double precioConIva;
		double valorDeIva;
		
		valorDeIva = precioSinIva * (IVA/100);
		precioConIva = precioSinIva + valorDeIva;
		
		System.out.printf("Precio sin IVA %.2f\nValor del iva %.2f\nPrecio final es de %.2f €",precioSinIva, valorDeIva, precioConIva); 
		
		}
	
	}
