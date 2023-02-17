package triangulos_poo;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	 double perimetro(){
		double perimetro = (a + b + c) / 2;
		return perimetro;
	}
	
	double area(){
		double perimetro = perimetro();
		double area = Math.sqrt((perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c)));
		return area;
	}
}

	