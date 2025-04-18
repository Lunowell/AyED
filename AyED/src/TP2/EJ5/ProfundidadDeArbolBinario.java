package TP2.EJ5;

import TP2.EJ1.*;
import java.util.LinkedList;
import java.util.ArrayList;
import Practica1.ej8.*;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> ab;
		
	public int sumaElementosProfundidad (int p) {
		if (ab.isEmpty()) return -1;
		int suma = 0;
		Queue <BinaryTree<Integer>> cola = new Queue<>();
		cola.enqueue(ab); // le paso la referencia de donde está el nodo raíz
		cola.enqueue(null);
		int nivelActual = 0;
		while (!cola.isEmpty() && nivelActual <= p) {
			int nodosxNivel = cola.size();
			if (nivelActual == p) {
				for (int i=0; i<nodosxNivel; i++) {
					BinaryTree<Integer> nodo = cola.dequeue();
					suma += nodo.getData();
				}
			}else {
				for ( int j=0; j<nodosxNivel; j++) {
					cola.dequeue();
				}
				if (ab.hasLeftChild()) cola.enqueue(ab.getLeftChild());
				if (ab.hasRightChild()) cola.enqueue(ab.getRightChild());
			}
			if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivelActual++;
			}
		}
		return suma;
	}
}
