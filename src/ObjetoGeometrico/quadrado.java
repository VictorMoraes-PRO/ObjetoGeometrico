package ObjetoGeometrico;

public class quadrado extends objetoGeometrico {
	private double lado;
	quadrado(double l) {
		lado = l;
	}

	public double getArea ( ) {
		area = lado * lado;
		return area;
	}
	
	public double getPerimetro ( ) {
		perimetro = 2 * lado;
		return perimetro;
	}

}