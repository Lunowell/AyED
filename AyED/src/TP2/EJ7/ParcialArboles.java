package TP2.EJ7;

import TP2.EJ1.*;

public class ParcialArboles {
	private BinaryTree<Integer> ab;
	
	public boolean isLeftTree (int num) {
		BinaryTree<Integer> subArbol = recorrerEncontrar(num,ab);
		if (subArbol.isEmpty()) {
			return false;
		}else {
			return contar(subArbol);
		}
	}
	
	private BinaryTree<Integer> recorrerEncontrar (int num, BinaryTree<Integer> arb){
		if (arb.getData() == num) {
			return arb;
		}else {
			if (arb.hasLeftChild()) {
				recorrerEncontrar (num,arb.getLeftChild());
			}
			if (arb.hasRightChild()) {
				recorrerEncontrar (num,arb.getRightChild());
			}
		}
		return null;
	}
	 private boolean contar (BinaryTree<Integer> sa) {
		 int hi = 0;
		 int hd = 0;
		 if (sa.hasLeftChild()) {
			 hi = hijoUnico (sa.getLeftChild());
		 }
		 if (sa.hasRightChild()) {
			 hd = hijoUnico (sa.getRightChild());
		 }
		 return hi>hd;
	 }
	 private int hijoUnico(BinaryTree<Integer> tree) {
			int count = 0;
			if (tree.hasLeftChild()) {
				count+=hijoUnico(tree.getLeftChild());
			}
			if (tree.hasRightChild()) {
				count+=hijoUnico(tree.getRightChild());
			}
			if (tree.hasLeftChild() ^ tree.hasRightChild()) {
				count++;
			}
			return count;
		}
}
