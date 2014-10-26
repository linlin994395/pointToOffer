package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * 面试题22：栈的压入、弹出序列
 * 
 * @author dell
 * 
 */
public class Item22 {
	public static void main(String args[]) {
		// 测试用例
		// 第一组
		int pushArray_1[] = { 1, 2, 3, 4, 5 };
		int popArray_1[] = { 4, 5, 3, 2, 1 };
		System.out.println("第一组：" + isPopOrder(pushArray_1, popArray_1));

		// 第二组
		int pushArray_2[] = { 1, 2, 3, 4, 5 };
		int popArray_2[] = { 4, 3, 5, 1, 2 };
		System.out.println("第二组：" + isPopOrder(pushArray_2, popArray_2));

		// 第三组，主要长度不等
		int pushArray_3[] = { 1, 2, 3, 4, 5 };
		int popArray_3[] = { 4, 5, 3 };
		System.out.println("第三组：" + isPopOrder(pushArray_3, popArray_3));
	}

	/**
	 * 判断序列popArray是否为pushArray的出栈序列
	 * 
	 * @param pushArray
	 *            入栈序列
	 * @param popArray
	 *            出栈序列
	 * @return boolean
	 */
	public static boolean isPopOrder(int pushArray[], int popArray[]) {
		boolean flag = false;
		// 能够执行的条件是这样的序列不为空，而且两个序列的长度是相等的
		if (pushArray.length > 0 && pushArray.length == popArray.length) {
			// 构造一个辅助栈，模拟入栈和出栈
			Stack<Integer> stack = new Stack<Integer>();
			int i = 0;
			int j = 0;

			// 保证入栈序列全进入栈
			while (i < pushArray.length) {
				// 当栈非空时，若栈顶元素与出栈序列中的元素相同，则出栈
				if (stack.size() > 0 && stack.peek() == popArray[j]) {
					stack.pop();
					j++;
				} else {// 若不相同或者栈为空，则在入栈序列中继续增加
					stack.push(pushArray[i]);
					i++;
				}
			}
			// 此时栈中还有元素需要与出栈序列对比
			while (stack.size() > 0) {
				// 若果相等就出栈
				if (stack.peek() == popArray[j]) {
					stack.pop();
					j++;
				} else {//若不相等就直接退出
					break;
				}
			}
			// 最终如果栈是空的，而且popArray中的所有数都遍历了，则是出栈序列
			if (stack.isEmpty() && j == popArray.length) {
				flag = true;
			}
		}
		return flag;
	}

}
