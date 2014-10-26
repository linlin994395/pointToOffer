package org.algorithm.pointtooffer;

/**
 * 面试题8：旋转数组的最小数字
 * 
 * @author dell
 * 
 */
public class Item08 {
	public static void main(String args[]) {
		int A[] = { 3, 4, 5, 1, 2 };// 数组A是数组{1,2,3,4,5}的旋转数组
		System.out.println(findMin(A));
	}

	public static int findMin(int array[]) {
		int low = 0;
		int high = array.length - 1;
		int middle = low;

		while (array[low] >= array[high]) {
			// 数组中就只有两个数，最小的为后者
			if (high - low == 1) {
				middle = high;
				break;
			}
			// 查找中间位置
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
