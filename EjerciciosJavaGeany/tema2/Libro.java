public class Libro{
	
	private double precio;
	private String titulo;
	private String autor;
	private int paginas;
	private boolean esEbook;
	private double valoracion;
	private int porcentajeDescuento;
	
	
	public Libro(double precio, String titulo, String autor, int paginas, boolean esEbook, double valoracion, int porcentajeDescuento){
		
		this.precio = precio;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.esEbook = esEbook;
		this.valoracion = valoracion;
		this.porcentajeDescuento = porcentajeDescuento;
		
		
		}
	
	public String infoBasica(){
		
		String salida;
		
		salida= "Titulo: " + titulo + " , autor: " + autor + " , precio: " + precio;
		
		return salida;
		
		}
	
	public void muestraInfoBasica(){
		
		System.out.println(infoBasica());
		
		
		}
	
	public String infoCompleta(){
		
		String salida;
		
		salida = String.format("Titulo: %s, precio: %.2f€, autor: %s, %d páginas, ¿eBook?: %s, valoración: %.1f, descuento: %d %%, precio con descuento: %.2f", titulo, precio, autor, paginas, esEbook, valoracion, porcentajeDescuento, calcularPrecioFinal());
		
		return salida;
		
		}
	
	public double calcularPrecioFinal(){
		
		double precioFinal, precioFinalRedodeado;
		int precioCentimos;
			
		precioFinal = precio * (1- ((double)porcentajeDescuento/100));
		
		precioCentimos = Math.round((float)(100*precioFinal));
		
		return (double) precioCentimos/ 100;
		
		}
	
	}
