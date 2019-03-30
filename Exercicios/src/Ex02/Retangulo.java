package Ex02;

public class Retangulo implements AreaCalculavel{

	private double base;
	private double altura;
	static double area = 0;

	
	public double getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	

	
	@Override
	public double calcularArea() {
		
		area = base*altura;
		return area;
	}
	
	
}
