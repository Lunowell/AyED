package Practica1;
import java.util.*;
import Practica1.ej3.*;
public class ej_7 {

		
	public void incisoA (ArrayList<Integer> lista, int[] arreglo){
		for (int i=0; i<arreglo.length;i++) {
			lista.add(arreglo[i]);
		}
		for (int j =0; j<lista.size(); j++) {
			System.out.println(lista.get(j));
		}
	}
	
	/*
	 * INCISO B (USANDO LIKEDLIST)
	 * 
	 */
	
	public void incisoC () {
		Estudiante est1 = new Estudiante ("Pedro", "Rodriguez", "pepe@gmail.com", "3D", "calle 45 numero 42");
		Estudiante est2 = new Estudiante ("Maria", "Gonzales", "mari@gmail.com", "3D", "calle 44 numero 422");
		Estudiante est3 = new Estudiante ("Troy", "volton", "tv@gmail.com", "3D", "calle 9 numero 42");
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(est1);
		estudiantes.add(est2);
		estudiantes.add(est3);
		
		
	}
}
