package com.pool.l4.algorithm.trees;

public class TreeNode {
	private TreeNode next;
	private TreeNode child;
	private String data;
	private boolean hasChild;

	public TreeNode getNext() {
		return next;
	}

	public TreeNode setNext(TreeNode next) {
		this.next = next;
		return this;
	}

	public TreeNode getChild() {
		return child;
	}

	public TreeNode setChild(TreeNode child) {
		this.child = child;
		return this;
	}

	public String getData() {
		return data;
	}

	public TreeNode setData(String data) {
		this.data = data;
		return this;
	}

	public boolean isHasChild() {
		return hasChild;
	}

	public TreeNode setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
		return this;
	}

}
