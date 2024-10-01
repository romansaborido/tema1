package tema1_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable entradaAdultos donde almacenaremos el número de entradas para adultos que quiere comprar el usuario
		int entradasAdultos;
		
		// Creamos la variable entradaInfantiles donde almacenaremos el número de entradas para niños que quiere comprar el usuario
		int entradasInfantiles;
		
		// Creamos la constante INFANTILES para establecer el precio de las entradas infantiles
		final double INFANTILES = 15.50;
		
		// Creamos la constante ADULTOS para establecer el precio de las entradas para adultos
		final int ADULTOS = 20;
		
		// Creamos la variable costeEntradas para indicar el precio inicial de las entradas compradas por el usuario
		double costeEntradas;
		
		// Creamos la variable costeTotal para establecer la condición y ver si finalmente aplicamos el descuento o no
		double costeTotal;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos al usuario el número de entradas para adultos que quiere comprar
		System.out.println("¿Cuántas entradas para adultos quieres comprar?");
		entradasAdultos = reader.nextInt();
		
		// Preguntamos al usuario el número de entradas para adultos que quiere comprar
		System.out.println("¿Cuántas entradas para niños quieres comprar?");
		entradasInfantiles = reader.nextInt();
		
		// Calculamos el precio de las entradas
		costeEntradas = entradasAdultos * ADULTOS + entradasInfantiles * INFANTILES;
		
		// Creamos el condicional para ver si finalmente aplicamos el descuento o no 
		costeTotal = costeEntradas >= 100 ? costeEntradas - costeEntradas * 5 / 100 : costeEntradas;
		
		// Mostramos el precio total al usuario
		System.out.println("Precio total: "+costeTotal+" €");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
