package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * 面试题5：从尾到头打印链表
 * 
 * @author dell
 * 
 */
public class Item05 {
	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// 构建链表
		ListNode head = new ListNode(0);
		ListNode node_one = new ListNode(1);
		ListNode node_two = new ListNode(2);
		ListNode node_three = new ListNode(3);
		ListNode node_four = new ListNode(4);
		head.setNext(node_one);
		node_one.setNext(node_two);
		node_two.setNext(node_three);
		node_three.setNext(node_four);
		node_four.setNext(null);
		System.out.println("第一种方式，递归实现：");
		printListReverse_1(head);
		//换行
		System.out.println();
		System.out.println("第二种方式，非递归实现：");
		printListReverse_2(head);
	}

	/**
	 * 用递归实现
	 * 
	 * @param head
	 */
	public static void printListReverse_1(ListNode head) {
		if (head != null) {
			if (head.getNext() != null) {
				printListReverse_1(head.getNext());
			}
			System.out.print(head.getValue() + "、");
		}
	}

	/**
	 * 用栈实现
	 * 
	 * @param head
	 */
	public static void printListReverse_2(ListNode head) {
		Stack<Integer> s = new Stack<Integer>();
		ListNode p = head;
		// 进栈
		while (p != null) {
			s.push(p.getValue());
			p = p.getNext();
		}

		// 出栈
		while (!s.isEmpty()) {
			System.out.print(s.pop() + "、");
		}
		System.out.println();
	}
}
