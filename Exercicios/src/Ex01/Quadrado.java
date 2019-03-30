package Ex01;


public class Quadrado implements FormaGeometrica{

	private double lado;
	public double getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = lado*lado;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro = 0;
		perimetro = lado*4;
		return perimetro;
	}
	
	@Override
	public String getNomeFigura() {
		return "quadrado";
	}
	
}