package introduccionJava;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		//definimos los valores
		Scanner teclado= new Scanner(System.in);
		String texto;
		float division;
		int num1, num2, suma, producto;
		texto= "Ingrese primer valor: ";
		// Introducimos los valores por teclado
		System.out.println(texto);
		num1=teclado.nextInt();
		System.out.println(texto);
		num2=teclado.nextInt();
		
		//hacemos las operaciones
		suma=num1 + num2;
		producto= num1 * num2;
		division=num1 / num2;
		
		
		
		// imprimimos los datos en consola
		System.out.println("La suma de los dos valores es: ");
		System.out.println(suma);
		System.out.println("El producto de los dos valores es: ");
		System.out.println(producto);
		System.out.println("La division de los dos valores es: ");
		System.out.println(division);
		
		
	}

}
