package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * ������25���������к�Ϊĳһֵ��·��
 * 
 * @author dell
 * 
 */
public class Item25 {

	public static void main(String args[]) {

	}

	public static void printFindPath(BinaryTreeNode root, int expectedSum) {
		// Ҫ��ȱ�����㣬��ջ�Ľṹʵ��
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		int currentSum = 0;// ͳ��ջ�е�ֵ�Ĵ�С

		if (root == null) {
			System.out.println("��Ϊ��");
			return;// �����ķ���
		}

		// root��Ϊ��
		stack.add(root);
		currentSum += root.getValue();

	}

}
