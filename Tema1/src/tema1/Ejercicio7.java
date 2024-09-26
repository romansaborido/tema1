package tema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables nombre, direccion y telefono
		String nombre;
		String direccion;
		String telefono;
		
		//pedimos al usuario su nombre
		System.out.println("Introduzca su nombre");
		nombre = reader.nextLine();
		
		//pedimos al usuario su direccion
		System.out.println("Introduzca su dirección");
		direccion = reader.nextLine();
		
		//pedimos al usuario su telefono 
		System.out.println("Introduzca su número de teléfono");
		telefono = reader.nextLine();
		
		//mostramos al usuario la informacion
		System.out.println("Nombre: "+nombre+"");
		System.out.println("Dirección: "+direccion+"");
		System.out.println("Teléfono: "+telefono+"");
		
		//cerramos el scanner
		reader.close();
		
		
	}

}
