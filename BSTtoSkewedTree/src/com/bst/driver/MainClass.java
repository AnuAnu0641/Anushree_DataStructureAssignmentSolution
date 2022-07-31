package com.bst.driver;
// Java implementation to flatten the binary search tree into a skewed tree in increasing / decreasing order

import com.bst.service.BSTtoSkewed;
import com.bst.util.Node;

public class MainClass {
	
	static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	public static void main(String[] args) {
		
		MainClass.node = new Node(50);
		MainClass.node.left = new Node(30);
		MainClass.node.right = new Node(60);
		MainClass.node.left.left = new Node(10);
		MainClass.node.right.left = new Node(55);

		BSTtoSkewed obj = new BSTtoSkewed();
		obj.flattenBSToSkewed(node);
		headNode = BSTtoSkewed.getHeadNode();
		obj.traverseRightSkewed(headNode);
	}
}