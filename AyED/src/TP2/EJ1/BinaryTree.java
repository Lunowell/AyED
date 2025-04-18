package TP2.EJ1;

import java.util.*;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	/*
	 *  ESTÁ BIEN 
	 */

	public  int contarHojas() {
	  int cant=0;
	  if (! this.isEmpty()) {
		  if (this.isLeaf()) {
			  cant ++;
		  }  else {
			  if (this.hasLeftChild()) 
				  cant = this.getLeftChild().contarHojas();
			  if (this.hasRightChild()) 
				  cant += this.getRightChild().contarHojas();
		  }
	  } 
	  return cant;
	}
		
		
	/*
	 * ESTÁ BIEN COMO HAGO CON LA RAIZ? si, está bien
	 */
    public BinaryTree<T> espejo(){
    	BinaryTree<T> arbEspejo = new BinaryTree<T>(this.getData());
    	if (this.hasLeftChild()) {
    		arbEspejo.addRightChild(this.getLeftChild().espejo());
    	}
    	if (this.hasRightChild()) {
    		arbEspejo.addLeftChild(this.getRightChild().espejo());
    	}
 	   return arbEspejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if (this.isEmpty() || n<0 || m<n) return;
		Queue<BinaryTree<T>> cola = new LinkedList();
		cola.add(this);
		int nivelActual = 0;
		while (!cola.isEmpty()) {
			int nodosXNivel = cola.size();
			if (nivelActual>=n && nivelActual<=m) {
				for (int i=0; i<nodosXNivel; i++) {
					BinaryTree<T> nodo = cola.remove();
					System.out.println(nodo.getData());
					if (nodo.hasLeftChild()) cola.add(nodo.getLeftChild());
					if (nodo.hasRightChild()) cola.add(nodo.getRightChild());
				}
			}else {
				for (int j=0; j<nodosXNivel;j++) {
					cola.remove();
				}
			}
			nivelActual++;
		}
   }
		
}

 