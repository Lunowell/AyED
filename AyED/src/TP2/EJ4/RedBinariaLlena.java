package TP2.EJ4;

import TP2.EJ1.*;


public class RedBinariaLlena {

	private BinaryTree<Integer> ab;
	
	public RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.ab = arbol;
	}

	public  int retardoReenvio () {
		if (! this.ab.isEmpty()) {
			return privateRetardoReenvio(this.ab,0);
		}
		return -1;
	}
	
	private static int privateRetardoReenvio (BinaryTree<Integer> arb, int sumaActual) {
		int retardoMaximoI = Integer.MIN_VALUE;
		int retardoMaximoD= Integer.MIN_VALUE;
		int retardoMaximo = Integer.MIN_VALUE;
		sumaActual+= arb.getData();
		if (arb.isLeaf()) {
			retardoMaximo = sumaActual;//return sumaActual;
		} else {
			if (arb.hasLeftChild()) retardoMaximoI = privateRetardoReenvio (arb.getLeftChild(),sumaActual);
			if (arb.hasRightChild()) retardoMaximoD =privateRetardoReenvio (arb.getRightChild(),sumaActual);
			retardoMaximo = Math.max(retardoMaximoI, retardoMaximoD);
			//return retardoMaximo;
		}	
		return retardoMaximo;
	}
	
	public  int retardoReenvio1 () {
		if (! this.ab.isEmpty()) {
			return privateRetardoReenvio1(this.ab,0,-1);
		}
		return -1;
	}
	
	private static int privateRetardoReenvio1 (BinaryTree<Integer> arb, int sumaActual, int retardoMaximo) {
		sumaActual+= arb.getData();
		if (arb.isLeaf()) {
			if(sumaActual>=retardoMaximo) retardoMaximo = sumaActual;
		} else {
			if (arb.hasLeftChild()) retardoMaximo = privateRetardoReenvio1 (arb.getLeftChild(),sumaActual, retardoMaximo);
			if (arb.hasRightChild()) retardoMaximo =privateRetardoReenvio1 (arb.getRightChild(),sumaActual,retardoMaximo);

		}		
		return retardoMaximo;
	}
	 public static void main(String[] args) {
	        BinaryTree<Integer> root = new BinaryTree<>(5);
	        BinaryTree<Integer> left = new BinaryTree<>(3);
	        BinaryTree<Integer> right = new BinaryTree<>(8);
	        BinaryTree<Integer> leftLeft = new BinaryTree<>(2);
	        BinaryTree<Integer> leftRight = new BinaryTree<>(4);
	        BinaryTree<Integer> rightLeft = new BinaryTree<>(6);
	        BinaryTree<Integer> rightRight = new BinaryTree<>(10);

	        root.addLeftChild(left);
	        root.addRightChild(right);
	        left.addLeftChild(leftLeft);
	        left.addRightChild(leftRight);
	        right.addLeftChild(rightLeft);
	        right.addRightChild(rightRight);
	        
	        RedBinariaLlena red = new RedBinariaLlena(root);
	        int resultado = red.retardoReenvio();
	        System.out.println("El reatrdo lo calcula el padre: " + resultado); 
	        
	        int resultado1 = red.retardoReenvio1();
	        System.out.println("El retardo lo calcula la hoja: " + resultado1); 
	        
	    }
	
	
}
