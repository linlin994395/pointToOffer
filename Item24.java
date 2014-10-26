package org.algorithm.pointtooffer;

import java.util.Arrays;

/**
 * 面试题24：二叉搜索树的后序遍历序列
 * 
 * @author dell
 * 
 */
public class Item24 {
	public static void main(String args[]) {
		int array[] = { 5, 7, 6, 9, 11, 10, 8 };
		System.out.println(verifySquenceOfBST(array));
	}

	public static boolean verifySquenceOfBST(int squence[]) {
		// 判断序列是否满足要求
		int length = squence.length;
		if (squence == null || length <= 0) {
			return false;
		}
		// 序列的最后一个数是二查搜索树的根结点
		int root = squence[length - 1];
		int i;
		for (i = 0; i < length; i++) {
			// 当只有根结点的时候要用等于去判断
			if (squence[i] >= root) {
				break;
			}
		}

		// 判断右子树是否满足要求
		for (int j = i; j < length - 1; j++) {
			if (squence[j] < root) {
				return false;
			}
		}

		// 左子树结点的个数
		int leftNum = i;
		// 构造左子树的序列
		int left[] = Arrays.copyOfRange(squence, 0, leftNum);
		// 构造右子树的序列
		int right[] = Arrays.copyOfRange(squence, leftNum, length - 1);
		boolean leftBool = true;
		boolean rightBool = true;
		// 当左子树的序列存在时
		if (left.length > 0) {
			leftBool = verifySquenceOfBST(left);
		}
		// 当右子树的序列存在时
		if (right.length > 0) {
			rightBool = verifySquenceOfBST(right);
		}
		return (leftBool && rightBool);

	}
}
