package org.algorithm.pointtooffer;

/**
 * 面试题18：树的子结构
 * 
 * @author dell
 * 
 */
public class Item18 {
	public static void main(String args[]) {

	}

	public static boolean isSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		// 如果树2为空，则无需比较
		if (root2 == null) {
			return true;
		}

		// 树1为空，也无需比较
		if (root1 == null) {
			return true;
		}
		
		
	}

}
