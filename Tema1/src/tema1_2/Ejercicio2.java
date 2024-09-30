package tema1_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables 
		int numero;
		int multiploAnterior;
		int multiploSiguiente;
		int resultado;

		//pedimos el número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		//definimos el multiplo anterior y el multiplo siguiente
		multiploAnterior = numero - numero%7;
		multiploSiguiente = multiploAnterior + 7;
		
		//calculamos el resultado
		resultado = multiploSiguiente - numero;
		
		//mostramos el resultado
		System.out.println("Hay que sumarle "+resultado+" para que sea múltiplo de 7");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
