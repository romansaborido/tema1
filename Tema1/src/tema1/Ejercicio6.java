package tema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int num1;
		int num2;
		int suma;
		int resta;
		int division;
		int multiplicacion;
		
		//pedimos que introduzca el numero 1 al usuario 
		System.out.println("Introduzca un número");
		num1 = reader.nextInt();
		
		//pedimos que introduzca el numero 2 al usuario
		System.out.println("Introduzca otro número");
		num2 = reader.nextInt();
		
		//definimos las variables de las operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		division = num1 / num2;
		multiplicacion = num1 * num2;
		
		//mostramos al usuario la suma 
		System.out.println("La suma de los números es "+suma+"");
		System.out.println("La resta de los números es "+resta+"");
		System.out.println("La división de los números es "+resta+"");
		System.out.println("La multiplicación de los números es "+multiplicacion+"");
		
		
	}

}
