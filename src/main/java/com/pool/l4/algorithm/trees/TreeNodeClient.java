package com.pool.l4.algorithm.trees;

public class TreeNodeClient {
	public static void main(String[] args) {
		TreeNode familyTree = new TreeNode().setData("Dasari").setHasChild(true)
				.setChild(
						new TreeNode().setData("Kotaiah")
								.setChild(new TreeNode().setData("Mattaiah").setHasChild(true)
										.setChild(new TreeNode().setHasChild(false).setData("Satish")))
								.setHasChild(false));
		printTree(familyTree, 4);
	}

	private static void printTree(TreeNode treeNode, int depth) {
		int i;
		while (treeNode.isHasChild()) {
			System.out.println(treeNode.getData());
			if (null != treeNode.getChild()) {
				if (depth > 0) {
					printTree(treeNode.getChild(), depth - 1);
					treeNode = treeNode.getChild();
				} else {
					treeNode = null;
				}
			} else {
				treeNode = null;
			}
		}
	}
}
