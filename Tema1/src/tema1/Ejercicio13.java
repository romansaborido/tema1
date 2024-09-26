package tema1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos los booleanos
		boolean lluvia;
		boolean tareas;
		boolean biblioteca;
		
		//preguntamos al usuario si tiene que ir a la biblioteca
		System.out.println("Do you have to go to the library? (true/false)");
		biblioteca = reader.nextBoolean();
		
		//preguntamos al usuario si esta lloviendo
		System.out.println("It's raining?? (true/false)");
		lluvia = reader.nextBoolean();
		
		//preguntamos al usuario si ha hecho las tareas 
		System.out.println("Have you done your homework? (true/false)");
		tareas = reader.nextBoolean();
		
		//procesamos si el usuario puede salir a la calle o no 
		System.out.println("Can you go out? " + (biblioteca || (!lluvia && tareas)));
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
