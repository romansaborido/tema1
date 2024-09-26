package tema1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables 
		double kgmanzanas;
		double kgperas;
		double importetotal;
		
		//pedimos al usuario los kg de manzana que ha vendido este mes
		System.out.println("Introduzca los kg de manzana que ha vendido este mes");
		kgmanzanas = reader.nextDouble();
		
		//pedimos al usuario los kg de pera que ha vendido este mes
		System.out.println("Introduzca los kg de pera que ha vendido este mes");
		kgperas = reader.nextDouble();
		
		//definimos la variable importetotal
		importetotal = kgmanzanas * 2.35 + kgperas * 1.95;
		
		//mostramos al usuario el dinero total que ha generado en el mes con la venta de manazanas y peras
		System.out.println("Importe total: "+importetotal+" €");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
