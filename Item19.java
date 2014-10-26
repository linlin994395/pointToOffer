package org.algorithm.pointtooffer;

/**
 * ������19���������ľ���
 * 
 * @author dell
 * 
 */
public class Item19 {
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

		// ����
		mirrorRecursively(root);

		// ǰ��������
		printPreOrder(root);
	}

	/**
	 * �����������1����Ϊ�գ�2��ֻ�и���㣻3����������������һ����Ϊ�� �Ը��������������Ĵ�����������Ĵ���һ�£����Բ��õݹ�ķ�ʽ���
	 * 
	 * @param root
	 */
	public static void mirrorRecursively(BinaryTreeNode root) {
		// ��Ϊ��
		if (root == null) {
			return;
		}
		// ֻ��һ�������
		if (root.getLeft() == null && root.getRight() == null) {
			return;
		}

		// ��������������һ����Ϊ��
		BinaryTreeNode treeTmp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(treeTmp);

		// �ݹ������������
		if (root.getLeft() != null) {
			mirrorRecursively(root.getLeft());
		}

		if (root.getRight() != null) {
			mirrorRecursively(root.getRight());
		}
	}
	
	/**
	 * �ݹ鷽ʽʵ��ǰ��������
	 * @param root
	 */
	public static void printPreOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.getValue() + "��");
			printPreOrder(root.getLeft());
			printPreOrder(root.getRight());
		}
	}
}
