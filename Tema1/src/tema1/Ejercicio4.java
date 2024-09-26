package tema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables: la nota del primer y segundo trimestre, y la de la media
		double nota1;
		double nota2;
		double media;
		
		//pedimos al usuario la nota del primer trimestre
	    System.out.println("Introduzca la nota del primer trimestre");
		nota1 = reader.nextDouble();
		 
		//pedimos al usuario la nota del segundo trimestre
		System.out.println("Introduzca la nota del segundo trimestre");
		nota2 = reader.nextDouble();
		 
		//definimos la variable de la media
		media = (nota1 + nota2) / 2;
		 
		//mostramos la nota media al usuario 
		System.out.println("Tu nota media es "+media+"");
		 
		//cerramos el scanner
		reader.close();	

	}

}
