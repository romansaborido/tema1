package tema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable de la nota del primer trimestre y del segundo trimestre
		int nota1;
		int nota2;
		
		//pedimos al usuario la nota del primer trimestre
	    System.out.println("Introduzca la nota del primer trimestre");
		nota1 = reader.nextInt();
		 
		//pedimos al usuario la nota del segundo trimestre
		System.out.println("Introduzca la nota del segundo trimestre");
		nota2 = reader.nextInt();
		 
		//creamos la variable de la media
		int media = (nota1 + nota2) / 2;
		 
		//mostramos la nota media al usuario 
		System.out.println("Tu nota media es "+media+"");
		 
		//cerramos el scanner
		reader.close();	

	}

}
