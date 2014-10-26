package org.algorithm.pointtooffer;

/**
 * ������31�����������������
 * 
 * @author dell
 * 
 */
public class Item31 {
	public static void main(String args[]) {
		// ����
		int array[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		int result = findGreatSumOfSubArray(array);
		System.out.println("�����������Ϊ��" + result);
	}

	public static int findGreatSumOfSubArray(int array[]) {
		// ��currentSum��¼��ǰ�ĺ�
		int currentSum = 0;
		// ��finalGreatSum��¼��ʷ���
		int finalGreatSum = 0;

		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			// ���currentSum>0���¼
			if (currentSum > 0) {
				// ���currentSum>finalGreatSum���滻finalGreatSum
				if (currentSum > finalGreatSum) {
					finalGreatSum = currentSum;
				}
			} else {
				currentSum = 0;
			}
		}
		return finalGreatSum;
	}

}
