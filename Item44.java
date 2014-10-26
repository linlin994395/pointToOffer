package org.algorithm.pointtooffer;

import java.util.Arrays;

/**
 * ������44���˿��Ƶ�˳��
 * 
 * @author dell
 * 
 */
public class Item44 {
	public static void main(String args[]) {
		// ģ��������ƣ���С��Ϊ0��AΪ1��JΪ11��QΪ12��KΪ13����ʵ���Ǹ����飬�ж������Ƿ���˳���

		// ����1�������
		int array_1[] = { 0, 0, 1, 4, 5 };
		System.out.println(isContinuous(array_1));
		// ����2�������
		int array_2[] = { 0, 1, 4, 5, 6 };
		System.out.println(isContinuous(array_2));
		// ����3������ͬԪ��
		int array_3[] = { 0, 1, 3, 3, 4, };
		System.out.println(isContinuous(array_3));
	}

	public static boolean isContinuous(int array[]) {
		// ��������Ĺ�ģ��С�������ֱ��ʹ�ÿ⺯�����
		// �����о仰����Ҫ��ͨ��������Ϊ��ͬ�����ʱ�临�Ӷ�ֻ�е�n�㹻���ʱ���������
		Arrays.sort(array);

		int numOfZero = 0;// ͳ��0�ĸ���
		int sumOfError = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 0) {
				numOfZero++;
			} else {// ��������
					// ������ͬ��Ԫ��
				if (array[i + 1] - array[i] == 0) {
					return false;
				} else {
					sumOfError += (array[i + 1] - array[i] - 1);
				}
			}
		}
		if (numOfZero >= sumOfError) {// 0�����ȱ
			return true;
		} else {
			return false;
		}
	}

}
