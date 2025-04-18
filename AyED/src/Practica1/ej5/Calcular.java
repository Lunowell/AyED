package Practica1.ej5;

public class Calcular {
	
	private static Datos datos;

	public Calcular () {
		
	}
	public static Datos incisoA (int[] arreglo) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double sum = 0;
		for (int i=0; i<arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
			sum+=arreglo[i];
		}
		Datos obj= new Datos (min,max,sum/arreglo.length);
		return obj;
	}
	
	public static void incisoB (int[] arreglo, Datos obj) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double sum = 0;
		for (int i=0; i<arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
			sum+=arreglo[i];
		}
		obj.setMin(min);
		obj.setMax(max);
		obj.setProm(sum/arreglo.length);
	}
	
	public static void incisoC (int[] arreglo) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double sum = 0;
		for (int i=0; i<arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
			sum+=arreglo[i];
		}
		datos = new Datos(min, max,sum/arreglo.length);
	}
	
	
}
