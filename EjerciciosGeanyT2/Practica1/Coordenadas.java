public class Coordenadas{
	
	private int x;
	private int y;
	
	
	
	public Coordenadas(int x, int y){
		
		this.x = 0;
		this.y = 0;
		
		
		}
		
		public void muestraCoordenadas(){
			
		System.out.println("Tus cordenadas son " + x + " , " + y);	
			
		
		}
		
		public void subirY(int subirBajarY){
			
		y += subirBajarY;	
			
		}
		
		public void izquierdaX(int izquierdaDerechaX){
			
		x -= izquierdaDerechaX;
			
		}
	
		public void bajarY(int subirBajarY){
			
		y -= subirBajarY;	
			
		}
		
		public void derechaX(int izquierdaDerechaX){
			
		x += izquierdaDerechaX;	
			
		}
	
	}
