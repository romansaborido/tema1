package tema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int numero;
		boolean par;
		
		//pedimos el numero al usuario 
		System.out.println("Introduzca un número entero");
		numero = reader.nextInt();
		
		//definimos el booleano
		par = numero % 2 == 0;
		
		//mostramos el resultado
		System.out.println(par);
		
		//cerramos el scanner
		reader.close();
		

	}

}
