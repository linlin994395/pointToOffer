package org.algorithm.pointtooffer;

/**
 * 题目二：和为s的连续序列
 * 
 * @author dell
 * 
 */
public class Item41_1 {

	public static void main(String args[]) {
		System.out.println("打印序列：");
		findSquenceWithSum(15);

	}

	/**
	 * 查找序列
	 * 
	 * @param s和
	 */
	public static void findSquenceWithSum(int s) {
		if (s < 3) {
			System.out.println("不存在");
			return;
		}
		int high = 2;// 至少有两个，那么最小也得为3
		int low = 1;
		int currentSum = low + high;// 记录当前的和

		int end = (1 + s) / 2;
		while (low < end) {
			// 若==s，则返回
			if (currentSum == s) {
				printSquence(low, high);
			}
			// 大于，要减小
			while (currentSum > s && low < end) {
				currentSum -= low;
				low++;
				if (currentSum == s) {
					printSquence(low, high);
				}
			}
			high++;
			currentSum += high;

		}
	}

	/**
	 * 打印函数
	 * 
	 * @param low下界
	 * @param high上界
	 */
	public static void printSquence(int low, int high) {
		// 判断是否符合要求
		if (high - low <= 0) {// 只有一个数或者high<low
			System.out.println("不存在");
			return;
		}
		for (int i = low; i <= high; i++) {
			System.out.print(i + "、");
		}
		System.out.println();// 换行
	}
}
