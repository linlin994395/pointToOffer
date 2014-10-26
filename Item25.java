package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * 面试题25：二叉树中和为某一值的路径
 * 
 * @author dell
 * 
 */
public class Item25 {

	public static void main(String args[]) {

	}

	public static void printFindPath(BinaryTreeNode root, int expectedSum) {
		// 要深度遍历结点，用栈的结构实现
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		int currentSum = 0;// 统计栈中的值的大小

		if (root == null) {
			System.out.println("树为空");
			return;// 函数的返回
		}

		// root不为空
		stack.add(root);
		currentSum += root.getValue();

	}

}
