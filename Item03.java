package org.algorithm.pointtooffer;

/**
 * 面试题3：二维数组的查找
 * 
 * @author dell
 * 
 */
public class Item03 {
	public static void main(String args[]) {
		// 测试用的例子
		int A[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		System.out.println(find(A, 7));
	}
	
	/**
	 * 二维数组的查找
	 * @param array 已知的数组
	 * @param number 待查找的数
	 * @return
	 */
	public static boolean find(int array[][], int number) {
		boolean flag = false;
		int rows = array.length;// 行数
		int columns = array[0].length;// 列数
		int row = 0;
		int column = columns - 1;
		while (row < rows && column >= 0) {
			// 比较二维数组中的元素与number的关系
			if (array[row][column] == number) {
				flag = true;
				break;// 跳出循环
			} else if (array[row][column] > number) {
				// 列变小
				column--;
			} else {
				// 行变大
				row++;
			}
		}
		return flag;
	}
}
