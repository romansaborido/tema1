package tema1_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable milímetros donde almaceneramos la cantidad en milímetros introducida por el usuario
		double milimetros;
		
		// Creamos la variable centímetros donde almacenaremos la cantidad en centímetros introducida por el usuario
		double centimetros;
		
		// Creamos la variable metros donde almacenaremos la cantidad en metros introducida por el usuario
		double metros;
		
		// Creamos la variable resultado donde realizaremos los cálculos
		double resultado;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario la cantidad de milímetros
		System.out.println("Introduzca la cantidad de milímetros");
		milimetros = reader.nextDouble();
		
		// Pedimos al usuario la cantidad de centímetros
		System.out.println("Introduzca la cantidad de centímetros");
		centimetros = reader.nextDouble();
		
		// Pedimos al usuario la cantidad de metros
		System.out.println("Introduzca la cantidad de metros");
		metros = reader.nextDouble();
		
		// Pasamos todas las unidades introducidas por el usuario a centímetros y sumamos
		resultado = metros * 100 + centimetros + milimetros / 10;
		
		// Finalmente mostramos al usuario el resultado final 
		System.out.println("Ha introducido en total "+resultado+" cm");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
