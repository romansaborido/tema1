package tema1_2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos la variable metros para almacenar la cantidad en metros que ha realizado el participante
		double metros;
		
		// Creamos la variable centimetros para convertir los metros del lanzamiento en centímetros
		double centimetros;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la longitud de su lanzamiento en metros 
		System.out.println("¿Cuántos metros ha recorrido tu lanzamiento?");
		metros = reader.nextDouble();
		
		// Pasamos los metros a centímetros para calcular el rankingç
		centimetros = metros * 100;
		
		// Mostramos el resultado final sin decimales utilizando la conversión de tipos
		System.out.println("La longitud oficial de su lanzamiento es: "+(int)centimetros+"");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
