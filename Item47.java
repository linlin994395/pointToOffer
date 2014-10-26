package org.algorithm.pointtooffer;

/**
 * 面试题47：不用加减乘除做加法
 * 
 * @author dell
 * 
 */
public class Item47 {

	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		System.out.println(add(a, b));
	}

	public static int add(int num1, int num2) {
		int sum = 0;
		int carry = 0;
		do {
			sum = num1 ^ num2;// 第一步，异或
			carry = (num1 & num2) << 1;// 第二步，进位
			// 第三步，相加
			num1 = sum;
			num2 = carry;
		} while (num2 != 0);

		return num1;
	}
}
