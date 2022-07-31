package com.bst.service;

import com.bst.util.Node;

public class BSTtoSkewed implements IBSTtoSkewed{

	static Node prevNode = null;
	static Node headNode = null;

	public static Node getHeadNode() {
		return headNode;
	}

	@Override
	public void flattenBSToSkewed(Node root) {

		if (root == null) 
			return;

		Node rightNode = root.right;
		Node leftNode = root.left;

		flattenBSToSkewed(leftNode);
		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBSToSkewed(rightNode);

	}


	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}
}
