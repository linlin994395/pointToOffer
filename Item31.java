package org.algorithm.pointtooffer;

/**
 * 面试题31：连续字数组的最大和
 * 
 * @author dell
 * 
 */
public class Item31 {
	public static void main(String args[]) {
		// 测试
		int array[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		int result = findGreatSumOfSubArray(array);
		System.out.println("子数组的最大和为：" + result);
	}

	public static int findGreatSumOfSubArray(int array[]) {
		// 用currentSum记录当前的和
		int currentSum = 0;
		// 用finalGreatSum记录历史最佳
		int finalGreatSum = 0;

		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			// 如果currentSum>0则记录
			if (currentSum > 0) {
				// 如果currentSum>finalGreatSum则替换finalGreatSum
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
