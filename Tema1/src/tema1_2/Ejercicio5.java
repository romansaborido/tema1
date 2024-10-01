package tema1_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int segundos;
		int minutos;
		int horas;
		int segundosFinales;
		
		//pedimos el número de segundos al usuario
		System.out.println("Introduzca una cantidad de segundos");
		segundos = reader.nextInt();
		
		//calculamos el número de minutos y horas
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundosFinales = segundos % 60; 
		
		//mostramos los resultados al usuario
		System.out.println(""+horas+" horas, "+minutos+" minutos, "+segundosFinales+" segundos");
		
		//cerramos el scanner
		reader.close();

		
	}

}
