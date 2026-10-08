public class Trabajador{
	
	
	
		private static final double PRECIO_HORAS_NORMAL = 12;
		private static final double PRECIO_HORAS_EXTRA = 16;
		
		private String nombre;
		private int horasTrabajadas;
	
	
	public Trabajador(String nombre){
		
			this.nombre = nombre;
			this.horasTrabajadas = 0;
		
		
	}
	
	
	public int addHoras(int horasSemana){
		
		
	horasTrabajadas += horasSemana;
	return horasTrabajadas;	
		
	}
	
	public double calcularSalarioSemanal(){
	
	if(horasTrabajadas<0){
		
	return 0;
		
	}
		
	double salario;
	
	
	
		if(horasTrabajadas <=40){
			
		salario = horasTrabajadas * PRECIO_HORAS_NORMAL;	
			
		}else{
			
		salario = PRECIO_HORAS_EXTRA * (horasTrabajadas-40) + (40 * PRECIO_HORAS_NORMAL);	
			
		}
		
		return salario;
	}
	
	
	
	
}
