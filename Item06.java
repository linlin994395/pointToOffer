package org.algorithm.pointtooffer;

/**
 * 面试题6：重建二叉树
 * 
 * @author dell
 * 
 */
public class Item06 {
	public static void main(String args[]) {
		// 二叉树的前序遍历
		int preOrder[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
		// 二叉树的中序遍历
		int inOrder[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
		
		BinaryTreeNode root = constructTree(preOrder, inOrder);
		printPostOrder(root);
	}

	public static BinaryTreeNode constructTree(int preOrder[], int inOrder[]) {
		// 根据前序遍历创建根结点
		BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
		root.setLeft(null);
		root.setRight(null);

		int leftNum = 0;//左子树的结点个数

		// 在中序中找到根节点
		for (int i = 0; i < inOrder.length; i++) {
			if (inOrder[i] == root.getValue()) {
				break;
			} else {
				leftNum++;
			}
		}
		int rightNum = preOrder.length - 1 - leftNum;

		// 左子树不为空
		if (leftNum > 0) {
			//构造左子树的前序和中序遍历序列
			int leftPreOrder[] = new int[leftNum];
			int leftInOrder[] = new int[leftNum];
			for (int i = 0; i < leftNum; i++) {
				leftPreOrder[i] = preOrder[i + 1];
				leftInOrder[i] = inOrder[i];
			}
			//递归构造左子树
			BinaryTreeNode leftRoot = constructTree(leftPreOrder, leftInOrder);
			root.setLeft(leftRoot);
		}
		
		//右子树不为空
		if (rightNum > 0) {
			//构造右子树的前序和中序遍历序列
			int rightPreOrder[] = new int[rightNum];
			int rightInOrder[] = new int[rightNum];
			for (int i = 0; i < rightNum; i++) {
				rightPreOrder[i] = preOrder[leftNum + i + 1];
				rightInOrder[i] = inOrder[leftNum + i + 1];
			}
			//递归构造右子树
			BinaryTreeNode rightRoot = constructTree(rightPreOrder,
					rightInOrder);	
			root.setRight(rightRoot);
		}
		return root;
	}
	
	/**
	 * 二叉树的后序遍历(递归实现)
	 * @param root 树的根结点
	 */
	public static void printPostOrder(BinaryTreeNode root) {
		if (root != null) {
			printPostOrder(root.getLeft());
			printPostOrder(root.getRight());
			System.out.print(root.getValue() + "、");
		}
	}
}
