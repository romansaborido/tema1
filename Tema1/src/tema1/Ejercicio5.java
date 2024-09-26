package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		double radio;
		double longitud;
		double area;
		
		//pedimos el radio al usuario
		System.out.println("Introduzca el radio de la circunferencia");
		radio = reader.nextDouble();
	
		//definimos la variable de la longitud y el área de la circunferencia
		longitud = 2 * Math.PI * radio;
		area = Math.PI * (radio * radio);
		
		//mostramos la longitud y el área de la circunferencia al usuario
		System.out.println("La longitud de la circunferencia es "+longitud+"");
		System.out.println("El área de la circunferencia es "+area+"");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
