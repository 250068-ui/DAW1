public class Ejemplo1{
	
	public static void main(String[] args){
	
	Coche cocheDavid, cocheArseny, cocheMario, cocheGabriel, cocheFran;
	
	cocheDavid = new Coche();
	
	cocheArseny = new Coche();
	
	
	
	/*System.out.println(cocheDavid.publicado);
	
	cocheDavid.publicar();
	
	System.out.println(cocheDavid.publicado);
	
	cocheDavid.despublicar();
	
	System.out.println(cocheDavid.publicado);
	*/
	
	cocheDavid.color = "rojo";
	
	System.out.println(cocheDavid.color);
	
	cocheDavid.pintar("azul");
	
	System.out.println(cocheDavid.color);
	
	}
}
