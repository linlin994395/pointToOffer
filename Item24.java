package org.algorithm.pointtooffer;

import java.util.Arrays;

/**
 * ������24�������������ĺ����������
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
		// �ж������Ƿ�����Ҫ��
		int length = squence.length;
		if (squence == null || length <= 0) {
			return false;
		}
		// ���е����һ�����Ƕ����������ĸ����
		int root = squence[length - 1];
		int i;
		for (i = 0; i < length; i++) {
			// ��ֻ�и�����ʱ��Ҫ�õ���ȥ�ж�
			if (squence[i] >= root) {
				break;
			}
		}

		// �ж��������Ƿ�����Ҫ��
		for (int j = i; j < length - 1; j++) {
			if (squence[j] < root) {
				return false;
			}
		}

		// ���������ĸ���
		int leftNum = i;
		// ����������������
		int left[] = Arrays.copyOfRange(squence, 0, leftNum);
		// ����������������
		int right[] = Arrays.copyOfRange(squence, leftNum, length - 1);
		boolean leftBool = true;
		boolean rightBool = true;
		// �������������д���ʱ
		if (left.length > 0) {
			leftBool = verifySquenceOfBST(left);
		}
		// �������������д���ʱ
		if (right.length > 0) {
			rightBool = verifySquenceOfBST(right);
		}
		return (leftBool && rightBool);

	}
}
