package org.algorithm.pointtooffer;

/**
 * ������6���ؽ�������
 * 
 * @author dell
 * 
 */
public class Item06 {
	public static void main(String args[]) {
		// ��������ǰ�����
		int preOrder[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
		// ���������������
		int inOrder[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
		
		BinaryTreeNode root = constructTree(preOrder, inOrder);
		printPostOrder(root);
	}

	public static BinaryTreeNode constructTree(int preOrder[], int inOrder[]) {
		// ����ǰ��������������
		BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
		root.setLeft(null);
		root.setRight(null);

		int leftNum = 0;//�������Ľ�����

		// ���������ҵ����ڵ�
		for (int i = 0; i < inOrder.length; i++) {
			if (inOrder[i] == root.getValue()) {
				break;
			} else {
				leftNum++;
			}
		}
		int rightNum = preOrder.length - 1 - leftNum;

		// ��������Ϊ��
		if (leftNum > 0) {
			//������������ǰ��������������
			int leftPreOrder[] = new int[leftNum];
			int leftInOrder[] = new int[leftNum];
			for (int i = 0; i < leftNum; i++) {
				leftPreOrder[i] = preOrder[i + 1];
				leftInOrder[i] = inOrder[i];
			}
			//�ݹ鹹��������
			BinaryTreeNode leftRoot = constructTree(leftPreOrder, leftInOrder);
			root.setLeft(leftRoot);
		}
		
		//��������Ϊ��
		if (rightNum > 0) {
			//������������ǰ��������������
			int rightPreOrder[] = new int[rightNum];
			int rightInOrder[] = new int[rightNum];
			for (int i = 0; i < rightNum; i++) {
				rightPreOrder[i] = preOrder[leftNum + i + 1];
				rightInOrder[i] = inOrder[leftNum + i + 1];
			}
			//�ݹ鹹��������
			BinaryTreeNode rightRoot = constructTree(rightPreOrder,
					rightInOrder);	
			root.setRight(rightRoot);
		}
		return root;
	}
	
	/**
	 * �������ĺ������(�ݹ�ʵ��)
	 * @param root ���ĸ����
	 */
	public static void printPostOrder(BinaryTreeNode root) {
		if (root != null) {
			printPostOrder(root.getLeft());
			printPostOrder(root.getRight());
			System.out.print(root.getValue() + "��");
		}
	}
}
