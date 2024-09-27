package tema1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables 
		double kgManzanas;
		double kgPeras;
		double importeTotal;
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		//pedimos al usuario los kg de manzana que ha vendido este mes
		System.out.println("Introduzca los kg de manzana que ha vendido este mes");
		kgManzanas = reader.nextDouble();
		
		//pedimos al usuario los kg de pera que ha vendido este mes
		System.out.println("Introduzca los kg de pera que ha vendido este mes");
		kgPeras = reader.nextDouble();
		
		//definimos la variable importetotal
		importeTotal = kgManzanas * PRECIO_MANZANAS + kgPeras * PRECIO_PERAS;
		
		//mostramos al usuario el dinero total que ha generado en el mes con la venta de manazanas y peras
		System.out.println("Importe total: "+importeTotal+" €");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
