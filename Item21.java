package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * 面试题21：包含min函数的栈
 * 
 * @author dell
 * 
 */
class StackWithMin {
	private Stack<Integer> stack;
	private Stack<Integer> stackHelp;// 一个辅助的栈

	public StackWithMin() {
		stack = new Stack<Integer>();
		stackHelp = new Stack<Integer>();
	}

	/**
	 * 直接插入stack中，在插入stackHelp时，如果为空则直接插入，或者要判断与顶部元素的大小，若小于则插入，若大于则继续插入顶部元素
	 * 
	 * @param t
	 *            待插入元素
	 */
	public void push(int t) {
		stack.push(t);
		// 插入辅助的栈
		if (stackHelp.size() == 0 || t < stackHelp.peek()) {
			stackHelp.push(t);
		} else {
			stackHelp.push(stackHelp.peek());
		}
	}

	/**
	 * 出栈，要求stack和stackHelp均不为空
	 * 
	 * @return
	 */
	public int pop() {
		assert (stack.size() > 0 && stackHelp.size() > 0);

		stackHelp.pop();
		return stack.pop();
	}

	/**
	 * 取得最小值，最小值一定是stackHelp的栈顶元素
	 * 
	 * @return
	 */
	public int min() {
		assert (stack.size() > 0 && stackHelp.size() > 0);

		return stackHelp.peek();
	}
}

public class Item21 {
	public static void main(String args[]) {
		StackWithMin s = new StackWithMin();
		s.push(3);
		s.push(4);
		s.push(2);
		System.out.println(s.min());
		s.push(1);
		System.out.println(s.min());
	}

}
