/*Crea un objeto posición en 2D. Deberá tener dos coordenadas (x, y). Crea métodos para:
Mover a la izquierda, derecha, arriba y abajo una cantidad de puntos.
Saber la distancia en línea recta al "origen" (0, 0)*/


public class Practica1{
	
	public static void main (String[] args){
		
	
	Coordenadas coor = new Coordenadas(0,0);
	
	
		coor.muestraCoordenadas();
		
		coor.subirY(7);
		
		coor.muestraCoordenadas();
		
		coor.izquierdaX(9);
		
		coor.muestraCoordenadas();
		
		coor.bajarY(4);
		
		coor.muestraCoordenadas();
		
		coor.derechaX(12);
		
		coor.muestraCoordenadas();
		
	}
}
