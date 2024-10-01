package tema1_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables 
		double a;
		double b;
		double c;
		double x;
		double y;
		
		//pedimos al usuario el valor de a 
		System.out.println("Introduzca el valor de a");
		a = reader.nextDouble();
		
		//pedimos al usuario el valor de b 
		System.out.println("Introduzca el valor de b");
		b = reader.nextDouble();
		
		//pedimos al usuario el valor de c
		System.out.println("Introduzca el valor de c");
		c = reader.nextDouble();
		
		//pedimos al usuario el valor de x
		System.out.println("Introduzca el valor de x");
		x = reader.nextDouble();
		
		//calculamos el valor de y
		y = a * x * x + b * x + c;
		
		//mostramos al usuario el valor de y
		System.out.println("y = "+y+"");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
