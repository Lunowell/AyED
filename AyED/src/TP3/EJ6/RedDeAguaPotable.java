package TP3.EJ6;
import TP3.EJ1.*;
public class RedDeAguaPotable {
    private GeneralTree<Character> red; 
    
    public RedDeAguaPotable(GeneralTree<Character> red) {
        this.red = red;
    }

    public double minimoCaudal(double caudal) {
        if (red == null || red.isEmpty()) {
            return 0;
        }
        return minimoCaudal(red, caudal);
    }

    private double minimoCaudal(GeneralTree<Character> nodo, double caudalActual) {
        if (nodo.isLeaf()) {
            return caudalActual;
        }
        
        double minCaudal = Double.MAX_VALUE;
        int hijos = nodo.getChildren().size();
        double caudalPorHijo = caudalActual / hijos;
        
        for (GeneralTree<Character> child : nodo.getChildren()) {
            double caudalHijo = minimoCaudal(child, caudalPorHijo);
            if (caudalHijo < minCaudal) {
                minCaudal = caudalHijo;
            }
        }
        
        return minCaudal;
    }
}
