package org.algorithm.pointtooffer;

import java.util.Arrays;

/**
 * ������14����������˳��ʹ����λ��ż��ǰ��
 * 
 * @author dell
 * 
 */
public class Item14 {
	public static void main(String args[]) {
		int A[] = { 1, 2, 3, 4, 5 };
		rejustArray(A);
		System.out.println(Arrays.toString(A));
	}
	
	/**
	 * ���������˳��
	 * @param array ����
	 */
	public static void rejustArray(int array[]) {
		// ����λ�ã�ͷ��β
		int low = 0;
		int high = array.length - 1;

		// ����λ��ֱ������
		while (low < high) {
			// ���lowλ���ϵ�Ϊż����highλ���ϵ�Ϊ����������
			if (array[low] % 2 == 0 && array[high] % 2 == 1) {
				int tmp = array[low];
				array[low] = array[high];
				array[high] = tmp;
				low++;
				high--;
			} else if (array[low] % 2 == 1) {// ���lowλ���ϵ�Ϊ������low����
				low++;
			} else {// highλ���ϵ�Ϊż����highǰ��
				high--;
			}
		}

	}

}
