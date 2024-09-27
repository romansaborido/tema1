package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable del año actual, la del año de nacimiento y la de su edad actual
		int añoAct;
		int añoNac;
		int edad;
		
		//pedimos al usuario el año actual 
		System.out.println("Introduzca el año en el que estamos");
		añoAct = reader.nextInt();
		
		//pedimos al usuario el año en el que nació
		System.out.println("Introduzca el año en el que nacistes");
		añoNac = reader.nextInt();
		
		//creamos la variable de su edad actual
		edad = añoAct - añoNac;
		
		//mostramos la edad
		System.out.println("Tienes "+edad+" años");
		
		//cerramos el scanner
		reader.close();
		
	}

}
