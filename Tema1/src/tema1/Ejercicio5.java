package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable del radio
		double radio;
		
		//pedimos el radio al usuario
		System.out.println("Introduzca el radio de la circunferencia");
		radio = reader.nextInt();
	
		//creamos la variable de la longitud y el área de la circunferencia
		double longitud = 2 * Math.PI * radio;
		double area = Math.PI * (radio * radio);
		
		//mostramos la longitud y el área de la circunferencia al usuario
		System.out.println("La longitud de la circunferencia es "+longitud+"");
		System.out.println("El área de la circunferencia es "+area+"");
		
		//cerramos el scanner
		reader.close();
		
	}

}
