package org.algorithm.pointtooffer;

import java.util.Arrays;

/**
 * 面试题14：调整数组顺序使奇数位于偶数前面
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
	 * 调整数组的顺序
	 * @param array 数组
	 */
	public static void rejustArray(int array[]) {
		// 两个位置，头和尾
		int low = 0;
		int high = array.length - 1;

		// 两个位置直到相遇
		while (low < high) {
			// 如果low位置上的为偶数，high位置上的为奇数，交换
			if (array[low] % 2 == 0 && array[high] % 2 == 1) {
				int tmp = array[low];
				array[low] = array[high];
				array[high] = tmp;
				low++;
				high--;
			} else if (array[low] % 2 == 1) {// 如果low位置上的为奇数，low后移
				low++;
			} else {// high位置上的为偶数，high前移
				high--;
			}
		}

	}

}
