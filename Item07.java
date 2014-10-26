package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * 面试题7：用两个栈实现队列
 * 
 * @author dell
 * 
 */

/**
 * 构造一个类
 * 
 * @author dell
 * 
 * @param <T>泛型
 */
class CQueue<T> {
	// 两个栈
	private Stack<T> stack1;
	private Stack<T> stack2;

	public CQueue() {
		this.stack1 = new Stack<T>();
		this.stack2 = new Stack<T>();
	}

	/**
	 * 模拟在队列末尾插入
	 * 
	 * @param node
	 */
	public void appendTail(T node) {
		stack1.push(node);
	}

	/**
	 * 模拟删除队列的头
	 * 
	 * @return
	 */
	public T deleteHead() {
		if (stack2.size() == 0) {
			if (stack1.size() == 0) {
				try {
					throw new Exception("队列为空");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// stack1 不为空，将stack1中的元素放入stack2中
			while (stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}

public class Item07 {

	// 测试
	public static void main(String args[]) {
		// 在队列中增加元素
		CQueue<Integer> cq = new CQueue<Integer>();
		for (int i = 0; i < 5; i++) {
			cq.appendTail(i);
		}
		// 依次取出
		for (int i = 0; i < 5; i++) {
			System.out.print(cq.deleteHead() + "、");
		}
		System.out.println();
		// 此时为空，再取一次，看会不会报错
		cq.deleteHead();
	}
}
