package tema1_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		double numero;
		double decimales;
		int parteEntera;
		int resultado;
		
		//pedimos el número al usuario 
		System.out.println("Introduzca un número decimal");
		numero = reader.nextDouble();
		
		//restamos al número introducido por el usuario la parte entera para sacar los decimales
		decimales = numero - (int)numero;
		
		//restamos al número introducido por el usuario los decimales para sacar la parte entera
		parteEntera = (int)(numero - decimales);
		
		//creamos la condicion
		resultado = decimales >= 0.5 ? parteEntera + 1 : parteEntera;
		
		//mostramos el resultado 
		System.out.println("Redondeamos -> "+resultado+"");
		
		//cerramos el scanner
		reader.close();
		
	
	}

}
