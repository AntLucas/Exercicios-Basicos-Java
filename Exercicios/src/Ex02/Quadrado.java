package Ex02;

public class Quadrado implements AreaCalculavel{

	private double lado ;
	static double area = 0;

	
	public double getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	

	
	
	@Override
	public double calcularArea() {
		
		area = lado*lado;
		return area;
	}
	
	

	
	
}
