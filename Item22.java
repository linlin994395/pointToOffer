package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * ������22��ջ��ѹ�롢��������
 * 
 * @author dell
 * 
 */
public class Item22 {
	public static void main(String args[]) {
		// ��������
		// ��һ��
		int pushArray_1[] = { 1, 2, 3, 4, 5 };
		int popArray_1[] = { 4, 5, 3, 2, 1 };
		System.out.println("��һ�飺" + isPopOrder(pushArray_1, popArray_1));

		// �ڶ���
		int pushArray_2[] = { 1, 2, 3, 4, 5 };
		int popArray_2[] = { 4, 3, 5, 1, 2 };
		System.out.println("�ڶ��飺" + isPopOrder(pushArray_2, popArray_2));

		// �����飬��Ҫ���Ȳ���
		int pushArray_3[] = { 1, 2, 3, 4, 5 };
		int popArray_3[] = { 4, 5, 3 };
		System.out.println("�����飺" + isPopOrder(pushArray_3, popArray_3));
	}

	/**
	 * �ж�����popArray�Ƿ�ΪpushArray�ĳ�ջ����
	 * 
	 * @param pushArray
	 *            ��ջ����
	 * @param popArray
	 *            ��ջ����
	 * @return boolean
	 */
	public static boolean isPopOrder(int pushArray[], int popArray[]) {
		boolean flag = false;
		// �ܹ�ִ�е����������������в�Ϊ�գ������������еĳ�������ȵ�
		if (pushArray.length > 0 && pushArray.length == popArray.length) {
			// ����һ������ջ��ģ����ջ�ͳ�ջ
			Stack<Integer> stack = new Stack<Integer>();
			int i = 0;
			int j = 0;

			// ��֤��ջ����ȫ����ջ
			while (i < pushArray.length) {
				// ��ջ�ǿ�ʱ����ջ��Ԫ�����ջ�����е�Ԫ����ͬ�����ջ
				if (stack.size() > 0 && stack.peek() == popArray[j]) {
					stack.pop();
					j++;
				} else {// ������ͬ����ջΪ�գ�������ջ�����м�������
					stack.push(pushArray[i]);
					i++;
				}
			}
			// ��ʱջ�л���Ԫ����Ҫ���ջ���жԱ�
			while (stack.size() > 0) {
				// ������Ⱦͳ�ջ
				if (stack.peek() == popArray[j]) {
					stack.pop();
					j++;
				} else {//������Ⱦ�ֱ���˳�
					break;
				}
			}
			// �������ջ�ǿյģ�����popArray�е��������������ˣ����ǳ�ջ����
			if (stack.isEmpty() && j == popArray.length) {
				flag = true;
			}
		}
		return flag;
	}

}
