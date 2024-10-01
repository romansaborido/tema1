package tema1_2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables 
		int numero1;
		int numero2;
		int multiploAnterior;
		int multiploSiguiente;
		int resultado;

		//pedimos el número 1 al usuario
		System.out.println("Introduzca un número");
		numero1 = reader.nextInt();
		
		//pedimos el número 2 al usuario
		System.out.println("Introduzca otro número");
		numero2 = reader.nextInt();
				
		//definimos el multiplo anterior y el multiplo siguiente
		multiploAnterior = numero1 - numero1 % numero2;
		multiploSiguiente = multiploAnterior + numero2;
				
		//calculamos el resultado
		resultado = multiploSiguiente - numero1 + numero2;
				
		//mostramos el resultado
		System.out.println("Hay que sumarle "+resultado+" para que sea múltiplo de "+numero2+"");
				
		//cerramos el scanner
		reader.close();

	}

}
