package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		//creamos la variable
		int edad;
		//pedimos la edad al usuario
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();
		//sumamos un año más
		int edadproxima = ++edad;
		
		System.out.println("El próximo año tendrás "+edadproxima+" años");
		
		reader.close();

	}

}
