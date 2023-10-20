package introduccionJava;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		float sueldo;
		System.out.println("Introduce el sueldo");
		sueldo=teclado.nextFloat();
		
		if(sueldo>=3000) {
			System.out.println("El usuario tiene que hacer el impuesto de la renta");
			
		}
		if(sueldo<=3000) {
			System.out.println("El ususario esta excento de declarar su renta");
			
		}
			if(sueldo>6000 && sueldo<10000) {
				System.out.println("El usuario tiene que pagar una bonificacion de 100 euros");
				
			}
			if(sueldo==2000 || sueldo == 3000) {
				System.out.println("El usuario paga un 10% de su sueldo");
			}

	}

}
