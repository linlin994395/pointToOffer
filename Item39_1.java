package org.algorithm.pointtooffer;

/**
 * �����⣺�ж�һ�����Ƿ���ƽ�������
 * 
 * @author dell
 * 
 */
public class Item39_1 {
	public static void main(String args[]) {
		// ����������
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
	}
	
	public static boolean isBalanced(BinaryTreeNode root){
		
	}

}
