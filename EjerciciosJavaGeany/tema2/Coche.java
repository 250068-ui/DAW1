public class Coche{
	
	private double precio;
	private String marca;
	private String modelo;
	private int year;
	private int cv;
	private String combustible;
	int km;
	String color;
	boolean publicado;
	
	
		public Coche(double precio, String marca, String modelo, int year, int cv, String combustible, int km, String color, boolean publicado){
			
			this.precio = precio;
			this.marca = marca;
			this.modelo = modelo;
			this.year = year;
			
			
			
			
			}
	
	
	
		void publicar(){
			
			publicado = true;
			
			}
		
		void despublicar(){
			
			publicado = false;
			
			}
	
		void pintar(String nuevoColor){
			
			color = nuevoColor;
			
			}


}
