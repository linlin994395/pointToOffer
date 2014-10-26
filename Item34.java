package org.algorithm.pointtooffer;

/**
 * 面试题34：丑数
 * 
 * @author dell
 * 
 */
public class Item34 {
	public static void main(String args[]) {
		int index = 7;
		System.out.println("第" + index + "个丑数为：" + getUglyNum(7));
	}

	/**
	 * 根据index计算丑数
	 * 
	 * @param index丑数的下标
	 * @return丑数
	 */
	public static int getUglyNum(int index) {
		// 检查index
		if (index <= 0) {
			return 0;
		}
		// 为了便于存储，可以建立数组保存中间结果
		int tmp[] = new int[index];
		// 保存第一个
		tmp[0] = 1;
		// 记录三组数的位置
		int multi2 = 0;
		int multi3 = 0;
		int multi5 = 0;

		int nextUglyNum = 1;
		while (nextUglyNum < index) {
			int min = findMin(tmp[multi2] * 2, tmp[multi3] * 3, tmp[multi5] * 5);
			tmp[nextUglyNum] = min;

			// 重新计算multi2,multi3,multi5
			while (tmp[multi2] * 2 <= min) {
				multi2++;
			}
			while (tmp[multi3] * 3 <= min) {
				multi3++;
			}
			while (tmp[multi5] * 5 <= min) {
				multi5++;
			}
			nextUglyNum++;
		}
		return tmp[index - 1];
	}

	/**
	 * 计算三个数的最小值
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int findMin(int a, int b, int c) {
		int minTmp = (a < b ? a : b);
		return (minTmp < c ? minTmp : c);
	}
}
