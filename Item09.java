package org.algorithm.pointtooffer;

/**
 * 面试题9：斐波那契数列
 * 
 * @author dell
 * 
 */
public class Item09 {
	public static void main(String args[]) {
		int n = 3;
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			//由zero和one保存中间结果
			int zero = 0;
			int one = 1;
			int fN = 0;
			for (int i = 2; i <= n; i++) {
				fN = one + zero;
				zero = one;
				one = fN;
			}
			return fN;
		}
	}
}
