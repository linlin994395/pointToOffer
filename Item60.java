package org.algorithm.pointtooffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ������60���Ѷ�������ӡ�ɶ���
 * 
 * @author dell
 * 
 */
public class Item60 {
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
		// ����ӡ
		printMulti(root);
	}
	
	/**
	 * ����ӡ
	 * @param root�����
	 */
	public static void printMulti(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		int num = 1;// ��ʾ��ǰlever���ϵĽ�����
		while (!queue.isEmpty()) {// ���зǿ�
			int nextNum = 0;// ��ʱ������������¼��һ��Ľ�����
			// ȡ����ǰ�㲢��ӡ����������һ��Ľ��
			for (int i = 0; i < num; i++) {
				BinaryTreeNode tmp = queue.poll();// ȡ������ͷ

				// ���Ӳ�Ϊ��
				if (tmp.getLeft() != null) {
					queue.add(tmp.getLeft());
					nextNum++;
				}

				// �Һ��Ӳ�Ϊ��
				if (tmp.getRight() != null) {
					queue.add(tmp.getRight());
					nextNum++;
				}
				System.out.print(tmp.getValue() + "\t");

			}
			System.out.println();
			num = nextNum;
		}
	}

}
