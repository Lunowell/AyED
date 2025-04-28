package TP3.EJ1;

import java.util.LinkedList;
import java.util.List;
import Practica1.ej8.*;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	 
	    if (this.isLeaf()) {
	        return 0;
	    } else {
	        int maxHeight = 0;
	        for (GeneralTree<T> child : this.getChildren()) {
	            maxHeight = Math.max(maxHeight, child.altura()); //comparo para ver si la altura del hijo es mayor a la altura maxima que tenia guardada
	        }
	        return 1 + maxHeight;
	    }
	}
	
	public int nivel(T dato){
	    if (this.isEmpty()) {
	        return -1; // Si el árbol está vacío, devuelvo -1
	    }
	    
	    Queue<GeneralTree<T>> queue = new Queue<>();
	    queue.enqueue(this); //Encolo la raiz

	    Queue<Integer> levels = new Queue<>();
	    levels.enqueue(0); // Encolo 0, porque es el nivel inicial, el de la raiz 

	    while (!queue.isEmpty()) {
	        GeneralTree<T> current = queue.dequeue();
	        int level = levels.dequeue();
	        
	        if (current.getData().equals(dato)) {
	            return level;
	        }
	        
	        for (GeneralTree<T> child : current.getChildren()) {
	            queue.enqueue(child);
	            levels.enqueue(level + 1);
	        }
	    }
	    
	    return -1; // Si no encontramos el dato
	  }

	public int ancho(){
	    if (this.isEmpty()) {
	        return 0;
	    }

	    Queue<GeneralTree<T>> queue = new Queue<>();
	    queue.enqueue(this);

	    int maxWidth = 0;

	    while (!queue.isEmpty()) {
	        int levelSize = queue.size(); // Cantidad de nodos en el nivel actual
	        maxWidth = Math.max(maxWidth, levelSize);

	        for (int i = 0; i < levelSize; i++) {
	            GeneralTree<T> current = queue.dequeue();
	            for (GeneralTree<T> child : current.getChildren()) {
	                queue.enqueue(child);
	            }
	        }
	    }

	    return maxWidth;
	}
	public boolean esAncestro(T a, T b) {
	    if (this.isEmpty()) {
	        return false;
	    }
	    
	    if (this.getData().equals(a)) {
	        return this.contiene(b); // Si encontramos "a", vemos si su subárbol contiene "b"
	    }
	    
	    for (GeneralTree<T> child : this.getChildren()) {
	        if (child.esAncestro(a, b)) {
	            return true;
	        }
	    }
	    
	    return false;
	}
	
	private boolean contiene(T dato) {
	    if (this.getData().equals(dato)) {
	        return true;
	    }
	    
	    for (GeneralTree<T> child : this.getChildren()) {
	        if (child.contiene(dato)) {
	            return true;
	        }
	    }
	    
	    return false;
	}
}
