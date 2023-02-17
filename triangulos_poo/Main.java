package triangulos_poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Triangulo x, y;
		double areaX, areaY, areaMaior;
		
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite os lados do triângulo X: ");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		areaMaior = area_maior(areaX, areaY);
		
		System.out.println(areaX + " " + areaY);
		System.out.println("A maior área mede " + areaMaior + " cm");
		
		input.close();
	}
	
	public static double area_maior(double area1, double area2) {
		if(area1 > area2){
			return area1;
		}
		
		else {
			return area2;
		}
	}

}
