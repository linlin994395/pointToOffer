package org.algorithm.pointtooffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ������23���������´�ӡ������
 * 
 * @author dell
 * 
 */
public class Item23 {
	public static void main(String args[]) {
		// ����������
		BinaryTreeNode root = new BinaryTreeNode(8);
		BinaryTreeNode t1 = new BinaryTreeNode(6);
		BinaryTreeNode t2 = new BinaryTreeNode(10);
		BinaryTreeNode t3 = new BinaryTreeNode(5);
		BinaryTreeNode t4 = new BinaryTreeNode(7);
		BinaryTreeNode t5 = new BinaryTreeNode(9);
		BinaryTreeNode t6 = new BinaryTreeNode(11);
		root.setLeft(t1);
		root.setRight(t2);
		t1.setLeft(t3);
		t1.setRight(t4);
		t2.setLeft(t5);
		t2.setRight(t6);
		t3.setLeft(null);
		t3.setRight(null);
		t4.setLeft(null);
		t4.setRight(null);
		t5.setLeft(null);
		t5.setRight(null);
		t6.setLeft(null);
		t6.setRight(null);

		// ��α���
		System.out.println("��α������У�");
		printFromTopToBottom(root);

	}

	/**
	 * ��α���
	 * 
	 * @param root�����
	 */
	public static void printFromTopToBottom(BinaryTreeNode root) {
		// ʹ�ö��е���ʽ
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		// ��������
		queue.add(root);

		// ���зǿ�
		while (!queue.isEmpty()) {
			// ȥ�����е�ͷ
			BinaryTreeNode treeNode = queue.poll();
			System.out.print(treeNode.getValue() + "��");

			// ���Ӳ�Ϊ��
			if (treeNode.getLeft() != null) {
				queue.add(treeNode.getLeft());
			}

			// �Һ��Ӳ�Ϊ��
			if (treeNode.getRight() != null) {
				queue.add(treeNode.getRight());
			}
		}
	}

}
