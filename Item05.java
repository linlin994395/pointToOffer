package org.algorithm.pointtooffer;

import java.util.Stack;

/**
 * ������5����β��ͷ��ӡ����
 * 
 * @author dell
 * 
 */
public class Item05 {
	/**
	 * ����
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// ��������
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
		System.out.println("��һ�ַ�ʽ���ݹ�ʵ�֣�");
		printListReverse_1(head);
		//����
		System.out.println();
		System.out.println("�ڶ��ַ�ʽ���ǵݹ�ʵ�֣�");
		printListReverse_2(head);
	}

	/**
	 * �õݹ�ʵ��
	 * 
	 * @param head
	 */
	public static void printListReverse_1(ListNode head) {
		if (head != null) {
			if (head.getNext() != null) {
				printListReverse_1(head.getNext());
			}
			System.out.print(head.getValue() + "��");
		}
	}

	/**
	 * ��ջʵ��
	 * 
	 * @param head
	 */
	public static void printListReverse_2(ListNode head) {
		Stack<Integer> s = new Stack<Integer>();
		ListNode p = head;
		// ��ջ
		while (p != null) {
			s.push(p.getValue());
			p = p.getNext();
		}

		// ��ջ
		while (!s.isEmpty()) {
			System.out.print(s.pop() + "��");
		}
		System.out.println();
	}
}
