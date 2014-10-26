package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * ������7��������ջʵ�ֶ���
 * 
 * @author dell
 * 
 */

/**
 * ����һ����
 * 
 * @author dell
 * 
 * @param <T>����
 */
class CQueue<T> {
	// ����ջ
	private Stack<T> stack1;
	private Stack<T> stack2;

	public CQueue() {
		this.stack1 = new Stack<T>();
		this.stack2 = new Stack<T>();
	}

	/**
	 * ģ���ڶ���ĩβ����
	 * 
	 * @param node
	 */
	public void appendTail(T node) {
		stack1.push(node);
	}

	/**
	 * ģ��ɾ�����е�ͷ
	 * 
	 * @return
	 */
	public T deleteHead() {
		if (stack2.size() == 0) {
			if (stack1.size() == 0) {
				try {
					throw new Exception("����Ϊ��");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// stack1 ��Ϊ�գ���stack1�е�Ԫ�ط���stack2��
			while (stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}

public class Item07 {

	// ����
	public static void main(String args[]) {
		// �ڶ���������Ԫ��
		CQueue<Integer> cq = new CQueue<Integer>();
		for (int i = 0; i < 5; i++) {
			cq.appendTail(i);
		}
		// ����ȡ��
		for (int i = 0; i < 5; i++) {
			System.out.print(cq.deleteHead() + "��");
		}
		System.out.println();
		// ��ʱΪ�գ���ȡһ�Σ����᲻�ᱨ��
		cq.deleteHead();
	}
}
