package org.algorithm.pointtooffer;

/**
 * 面试题15：链表中倒数第k个结点
 * 
 * @author dell
 * 
 */
public class Item15 {

	public static void main(String args[]) {
		// 构建链表
		ListNode head = new ListNode(1);
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(3);
		ListNode h3 = new ListNode(4);
		ListNode h4 = new ListNode(5);
		ListNode h5 = new ListNode(6);
		head.setNext(h1);
		h1.setNext(h2);
		h2.setNext(h3);
		h3.setNext(h4);
		h4.setNext(h5);
		h5.setNext(null);
		// 查找倒数第k个
		ListNode p = findKthToTail(head, 3);
		System.out.println(p.getValue());

	}

	public static ListNode findKthToTail(ListNode head, int k) {
		// 首先判断链表是否存在，k是否大于0
		if (head == null || k <= 0) {
			return null;
		}

		ListNode prePoint = head;// 第一个指针
		ListNode postPoint = head;// 第二个指针

		for (int i = 0; i < k - 1; i++) {
			if (prePoint.getNext() != null) {
				prePoint = prePoint.getNext();
			} else {
				return null;
			}
		}

		while (prePoint.getNext() != null) {
			prePoint = prePoint.getNext();
			postPoint = postPoint.getNext();
		}
		return postPoint;

	}

}
