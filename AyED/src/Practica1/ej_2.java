package Practica1;

import java.util.Scanner;

public class ej_2 {

		public static int [] arreglo (int a) {
			int [] array = new int [a];
			for (int x=0; x< a; x++){
				array [x]= a*(x + 1);  // El arreglo empieza en 0 por eso le tengo que sumar 1 a x. Sino el primer elemento sería 0
			}
			return array;
		}
		
		public static void main (String[] args) {
			Scanner s = new Scanner(System.in) ; 
			System.out.print("Ingresa un número: ");
		    int numero = s.nextInt();
			int [] resultado =arreglo (numero);
			for (int i = 0; i < resultado.length; i++) {
	            System.out.println("Elemento " + i + ": " + resultado[i]);
	        }
		}
}