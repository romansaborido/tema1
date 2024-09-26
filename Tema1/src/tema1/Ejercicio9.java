package tema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int edad;
		boolean mayoredad;
		
		//pedimos la edad al usuario 
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();
		
		//definimos el booleano
		mayoredad = edad >= 18;
		
		//mostramos el resultado
		System.out.println(mayoredad);
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
