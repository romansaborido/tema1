package tema1_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		double segundos;
		double minutos;
		double horas;
		
		//pedimos el número de segundos al usuario
		System.out.println("Introduzca una cantidad de segundos");
		segundos = reader.nextDouble();
		
		//calculamos el número de minutos y horas
		minutos = segundos / 60;
		horas = segundos / 3600;
		
		//mostramos los resultados al usuario
		System.out.println("Minutos: "+minutos+"");
		System.out.println("Horas: "+horas+"");
		
		//cerramos el scanner
		reader.close();

		
	}

}
