package TP3.EJ4;

import java.util.List;

import Practica1.ej8.*;
import TP3.EJ1.*;

public class AnalizadorArbol {

	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		double promedioFinal = 0;
		double promedioActual;
		double suma = 0;
		int cantNodos = 0;
		GeneralTree<AreaEmpresa> ab;
		Queue <GeneralTree<AreaEmpresa>> cola = new Queue<>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			if (ab != null) {
				cantNodos ++;
				suma += ab.getData().getRetardo();
				List<GeneralTree<AreaEmpresa>> children = ab.getChildren();
				for (GeneralTree<AreaEmpresa> child : children) {
					cola.enqueue(child);
				}
			} else if (!cola.isEmpty()) {
				promedioActual = suma/cantNodos;
				promedioFinal = Math.max(promedioFinal, promedioActual);
				cola.enqueue(null);
				suma = 0;
				cantNodos = 0;
			}
		}
		return promedioFinal;
	}
}
