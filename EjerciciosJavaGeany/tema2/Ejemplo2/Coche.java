public class Coche{
	
	private double precio;
	private String marca;
	private String modelo;
	private int year;
	private int cv;
	private String combustible;
	private int km;
	private String color;
	private boolean publicado;
	
	
		public Coche(double precio, String marca, String modelo, int year, int cv, String combustible, int km, String color, boolean publicado){
			
			this.precio = precio;
			this.marca = marca;
			this.modelo = modelo;
			this.year = year;
			this.cv = cv;
			this.combustible = combustible;
			this.km = km;
			this.color = color;
			this.publicado = publicado;
			
			
			
			}
	
	
	
		public void publicar(){
			
			this.publicado = true;
			
			}
		
		public void despublicar(){
			
			this.publicado = false;
			
			}
	
		public void pintar(String nuevoColor){
			
			this.color = nuevoColor;
			
			}
			
		public void trucarKm(int km){
			
			this.km = km;
			
			}
		
		public int getKm(){
			
			return km;
			
			}
			
		public String getcolor(){
			
			return color;
			
			}

}
