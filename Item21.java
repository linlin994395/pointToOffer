package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * ������21������min������ջ
 * 
 * @author dell
 * 
 */
class StackWithMin {
	private Stack<Integer> stack;
	private Stack<Integer> stackHelp;// һ��������ջ

	public StackWithMin() {
		stack = new Stack<Integer>();
		stackHelp = new Stack<Integer>();
	}

	/**
	 * ֱ�Ӳ���stack�У��ڲ���stackHelpʱ�����Ϊ����ֱ�Ӳ��룬����Ҫ�ж��붥��Ԫ�صĴ�С����С������룬��������������붥��Ԫ��
	 * 
	 * @param t
	 *            ������Ԫ��
	 */
	public void push(int t) {
		stack.push(t);
		// ���븨����ջ
		if (stackHelp.size() == 0 || t < stackHelp.peek()) {
			stackHelp.push(t);
		} else {
			stackHelp.push(stackHelp.peek());
		}
	}

	/**
	 * ��ջ��Ҫ��stack��stackHelp����Ϊ��
	 * 
	 * @return
	 */
	public int pop() {
		assert (stack.size() > 0 && stackHelp.size() > 0);

		stackHelp.pop();
		return stack.pop();
	}

	/**
	 * ȡ����Сֵ����Сֵһ����stackHelp��ջ��Ԫ��
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
