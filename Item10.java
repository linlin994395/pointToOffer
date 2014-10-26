package org.algorithm.pointtooffer;

/**
 * 面试题10：二进制中1的个数
 * 
 * @author dell
 * 
 */
public class Item10 {
	public static void main(String args[]) {

		int n = 9;
		System.out.println("9的二进制表示中1的个数为：" + numberOf1(n));

	}
	
	/**
	 * 利用了与的操作
	 * @param n
	 * @return
	 */
	public static int numberOf1(int n) {
		int count = 0;

		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}

		return count;
	}

}
