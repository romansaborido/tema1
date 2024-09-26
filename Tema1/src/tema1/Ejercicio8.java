package tema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable del nombre y de su edad
		String nombre;
		int edad;
		
		//pedimos al usuario su nombre
		System.out.println("Introduzca su nombre");
		nombre = reader.nextLine();
		
		//pedimos al usuario su edad 
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();
		
		//creamos el mensaje 
		System.out.println("Hola "+nombre+", tienes "+edad+" años, ¡qué mayor eres!");
		
		//cerramos el scanner
		reader.close();

		
	}

}
