package Ex02;

public class Circulo implements AreaCalculavel{

	private int diametro;
	double pi = 3.14;
	static double area = 0;
	

	
	public int getDiametro() {
		return diametro;
	}
	
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	
	
	
	
	@Override
	public double calcularArea() {
	
		double raio = diametro/2;
		
		
		area = pi * Math.pow(raio, 2);
		
		return area;
	}
	

	
}
