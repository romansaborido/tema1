package tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable del número
		int numero;
		
		//pedimos al usuario que introduzca un número 
		System.out.println("Introduzca un número ");
		numero = reader.nextInt();
		
		//mostramos al usuario el número que ha elegido
		System.out.println("Has elegido "+numero+" como número");
		
		//cerramos el scanner
		reader.close();
		
		

	}

}
