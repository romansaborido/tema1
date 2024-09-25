package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable del año actual y la del año de nacimiento
		int añoact;
		int añonac;
		
		//pedimos al usuario el año actual 
		System.out.println("Introduzca el año en el que estamos");
		añoact = reader.nextInt();
		
		//pedimos al usuario el año en el que nació
		System.out.println("Introduzca el año en el que nacistes");
		añonac = reader.nextInt();
		
		//creamos la variable de su edad actual
		int edad = añoact - añonac;
		
		//mostramos la edad
		System.out.println("Tienes "+edad+" años");
		
		//cerramos el scanner
		reader.close();
		
	}

}
