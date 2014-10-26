package org.algorithm.pointtooffer;

/**
 * 面试题16：反转链表
 * 
 * @author dell
 * 
 */
public class Item16 {
	/**
	 * 测试函数
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
		// 打印
		ListNode reservedHead = reverseList(head);
		ListNode tmp = reservedHead;
		while (tmp != null) {
			System.out.print(tmp.getValue() + "、");
			tmp = tmp.getNext();
		}
	}

	/**
	 * 非递归实现
	 * 
	 * @param head头指针
	 * @return
	 */
	public static ListNode reverseList(ListNode head) {
		ListNode reservedHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.getNext();

			if (pNext == null) {
				reservedHead = pNode;
			}

			pNode.setNext(pPrev);
			pPrev = pNode;
			pNode = pNext;
		}
		return reservedHead;
	}
}
