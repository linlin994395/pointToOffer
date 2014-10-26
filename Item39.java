package org.algorithm.pointtooffer;

/**
 * 面试题39：二叉树的深度
 * 
 * @author dell
 * 
 */
public class Item39 {

	public static void main(String args[]) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node_2 = new BinaryTreeNode(2);
		BinaryTreeNode node_3 = new BinaryTreeNode(3);
		BinaryTreeNode node_4 = new BinaryTreeNode(4);
		BinaryTreeNode node_5 = new BinaryTreeNode(5);
		BinaryTreeNode node_6 = new BinaryTreeNode(6);
		BinaryTreeNode node_7 = new BinaryTreeNode(7);
		root.setLeft(node_2);
		root.setRight(node_3);
		node_2.setLeft(node_4);
		node_2.setRight(node_5);
		node_3.setLeft(null);
		node_3.setRight(node_6);
		node_4.setLeft(null);
		node_4.setRight(null);
		node_5.setLeft(node_7);
		node_5.setRight(null);
		node_6.setLeft(null);
		node_6.setRight(null);
		node_7.setLeft(null);
		node_7.setRight(null);

		// 计算深度
		System.out.println("二叉树的深度为：" + treeDepth(root));
	}

	/**
	 * 计算二叉树的深度
	 * 
	 * @param root根结点
	 * @return深度
	 */
	public static int treeDepth(BinaryTreeNode root) {
		// 先判断树是否存在
		if (root == null) {
			return 0;
		}

		// 递归实现左右子树的深度
		int leftDepth = treeDepth(root.getLeft());
		int rightDepth = treeDepth(root.getRight());

		// 找到最大值
		return (leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1));
	}

}
