package TP2.EJ3;

import TP2.EJ1.*;
import java.util.*;

public class ContadorArbol {
	
	private BinaryTree<Integer> ab;
	
	public ContadorArbol(BinaryTree<Integer> unAb) {
		this.ab = unAb;
	}
	
	public LinkedList<Integer> llamarInOrden() {
		LinkedList<Integer> listaPares = new LinkedList<Integer>();
		numerosParesInOrden (ab,listaPares);
		return listaPares ;
	}
	private void numerosParesInOrden(BinaryTree<Integer> arb, LinkedList<Integer> listaPares){
		if (arb.getData() % 2 == 0) {
			listaPares.add(arb.getData());
		}
		if (arb.hasLeftChild()){
			numerosParesInOrden(arb.getLeftChild(),listaPares); 
		}
		if (arb.hasRightChild()) {
			numerosParesInOrden(arb.getRightChild(),listaPares);
		}
	}
	
	public LinkedList<Integer> llamarPostOrden(){
		LinkedList<Integer> listaPares = new LinkedList<Integer>();
		numerosParesPostOrden (ab,listaPares);
		return listaPares;
	}
	private void numerosParesPostOrden (BinaryTree<Integer> arb, LinkedList<Integer> listaPares) {
		if (arb.hasLeftChild()) {
			numerosParesPostOrden(arb.getLeftChild(),listaPares);
		}
		if (arb.hasLeftChild()) {
			numerosParesPostOrden (arb.getRightChild(),listaPares);
		}
		if (arb.getData() % 2== 0) {
			listaPares.add(arb.getData());
		}
	}
	

    public static void main(String[] args) {
        // Crear nodos del árbol
        BinaryTree<Integer> root = new BinaryTree<>(10);
        BinaryTree<Integer> left = new BinaryTree<>(5);
        BinaryTree<Integer> right = new BinaryTree<>(20);
        BinaryTree<Integer> leftLeft = new BinaryTree<>(2);
        BinaryTree<Integer> leftRight = new BinaryTree<>(8);
        BinaryTree<Integer> rightLeft = new BinaryTree<>(15);
        BinaryTree<Integer> rightRight = new BinaryTree<>(22);

        // Armar el árbol
        root.addLeftChild(left);
        root.addRightChild(right);
        left.addLeftChild(leftLeft);
        left.addRightChild(leftRight);
        right.addLeftChild(rightLeft);
        right.addRightChild(rightRight);

        // Crear el contador
        ContadorArbol contador = new ContadorArbol(root);

        // Obtener y mostrar pares en inorden
        LinkedList<Integer> inOrdenPares = contador.llamarInOrden();
        System.out.println("Números pares (inorden): " + inOrdenPares);

        // Obtener y mostrar pares en postorden
        LinkedList<Integer> postOrdenPares = contador.llamarPostOrden();
        System.out.println("Números pares (postorden): " + postOrdenPares);
    }
}
