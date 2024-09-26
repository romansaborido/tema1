package tema1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		double euros;
		double pesetas;
		
		//pedimos al usuario que introduzca los euros
		System.out.println("Introduzca la cantidad de euros");
		euros = reader.nextDouble();
		
		//definimos la variable pesetas
		pesetas = euros * 166;
		
		//mostramos el resultado 
		System.out.println(""+euros+" € = "+pesetas+" pesetas");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
