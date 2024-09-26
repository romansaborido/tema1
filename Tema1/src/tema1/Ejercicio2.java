package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable de la edad y la del próximo año
		int edad;
		int edadproxima;
		
		//pedimos la edad al usuario
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();
		
		//definimos la variable edadproxima sumando un año más
		edadproxima = ++edad;
		
		//mostramos al usuario la edad que tendrá el próximo año
		System.out.println("El próximo año tendrás "+edadproxima+" años");
		
		//cerramos el scanner
		reader.close();

	}

}
