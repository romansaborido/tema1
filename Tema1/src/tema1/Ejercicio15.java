package tema1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos la constante iva
		final int IVA	 = 21;
		
		//creamos la variable precio y precioconiva
		double precio;
		double precioConIva;
		
		//pedimos al usuario que nos de un precio
		System.out.println("Introduzca el precio sin IVA");
		precio = reader.nextDouble();
		
		//definimos la variable precioconiva
		precioConIva = (precio * IVA / 100) + precio;
		
		//mostramos los resultados al usuario
		System.out.println("El precio total con IVA incluido es "+precioConIva+"");
		
		//cerramos el scanner
		reader.close();
		

	}

}
