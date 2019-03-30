
package Ex01;

import java.lang.*;


	public class Circulo implements FormaGeometrica{

		private int raio;
		double pi = 3.14;
	
		
	
		
		public int getRaio() {
			return raio;
		}
		
		public void setRaio(int raio) {
			this.raio = raio;
		}
		
		
		
		@Override
		public String getNomeFigura() {
			return "Circulo";
		}
		
		@Override
		public double getArea() {
			double area ;
			
			
			area = pi * Math.pow(raio, 2);
			
			return area;
		}
		
		@Override
		public double getPerimetro() {
			double perimetro = 0;
			perimetro =2*pi*raio;
			
			return perimetro;
		}
	}

	

