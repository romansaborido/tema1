package tema1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		//pedimos al usuario la nota del primer trimestre
		System.out.println("Introduzca la nota del primer trimestre");
		nota1 = reader.nextDouble();
		
		//pedimos al usuario la nota del segundo trimestre
		System.out.println("Introduzca la nota del segundo trimestre");
		nota2 = reader.nextDouble();
		
		//pedimos al usuario la nota del tercer trimestre
		System.out.println("Introduzca la nota del segundo trimestre");
		nota3 = reader.nextDouble();
		
		//calculamos la nota media 
		media = (nota1 + nota2 + nota3) / 3;
		
		//mostramos los resultados al usuario 
		System.out.println("Boletín de calificaciones, nota media: "+(int)media+"");
		System.out.println("Expediente académico, nota media: "+media+"");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
