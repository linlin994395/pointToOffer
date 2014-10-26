package org.algorithm.pointtooffer;

/**
 * 面试题29：数组中出现次数超过一半的数字
 * 
 * @author dell
 * 
 */
public class Item29 {
	public static void main(String args[]) {
		int testArray[] = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println("超过一半的数字为：" + moreThanHalfNum(testArray));
	}

	public static int moreThanHalfNum(int array[]) {
		// 一种巧妙的解法
		int length = array.length;// 数组的长度
		int result = array[0];
		int times = 0;
		for (int i = 1; i < length; i++) {
			if (times == 0) {
				result = array[i];
				times = 1;
			} else if (array[i] == result) {
				times++;
			} else {
				times--;
			}
		}
		return result;
	}
}
