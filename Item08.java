package org.algorithm.pointtooffer;

/**
 * ������8����ת�������С����
 * 
 * @author dell
 * 
 */
public class Item08 {
	public static void main(String args[]) {
		int A[] = { 3, 4, 5, 1, 2 };// ����A������{1,2,3,4,5}����ת����
		System.out.println(findMin(A));
	}

	public static int findMin(int array[]) {
		int low = 0;
		int high = array.length - 1;
		int middle = low;

		while (array[low] >= array[high]) {
			// �����о�ֻ������������С��Ϊ����
			if (high - low == 1) {
				middle = high;
				break;
			}
			// �����м�λ��
			middle = (high + low) / 2;
			if (array[middle] >= array[low]) {
				low = middle;
			} else if (array[middle] <= array[high]) {
				high = middle;
			}
		}
		return array[middle];
	}
}
