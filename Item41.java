package org.algorithm.pointtooffer;

/**
 * 面试题41：和为s的两个数字VS和为s的连续正数序列
 * 
 * @author dell
 * 
 */
public class Item41 {
	public static void main(String args[]) {
		int array[] = { 1, 2, 4, 7, 11, 15 };
		int s = 15;
		int result[] = new int[2];// 存储两个解
		boolean flag = findNumWithSum(array, result, s);

		if (flag == true) {// 存在这样的解，输出
			System.out.println("一组解为：" + result[0] + "、" + result[1]);
		} else {
			System.out.println("不存在");
		}

	}

	/**
	 * 和为s的两个数组
	 * 
	 * @param array原始数组
	 * @param result结果数组
	 * @param s和
	 * @return
	 */
	public static boolean findNumWithSum(int array[], int result[], int s) {
		int length = array.length;
		boolean flag = false;
		// 条件检查，要保证能存储两个数
		if (length <= 0 || result.length != 2) {
			return flag;
		}

		// 两个指针
		int low = 0;
		int high = length - 1;

		while (low < high) {
			// 如果相等
			if (array[low] + array[high] == s) {
				// 记录下
				result[0] = array[low];
				result[1] = array[high];
				flag = true;// 表示找到了
				break;
			}
			// 如果>
			else if (array[low] + array[high] > s) {
				high--;// 减小
			}
			// 如果小于
			else {
				low++;// 增加
			}
		}
		return flag;
	}

}
