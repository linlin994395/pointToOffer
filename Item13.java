package org.algorithm.pointtooffer;

/**
 * 面试题13：在O(1)时间删除链表的节点
 * 
 * @author dell
 * 
 */
public class Item13 {
	public static void main(String args[]) {
		// 构建链表
		ListNode head = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		ListNode node_4 = new ListNode(4);
		ListNode node_5 = new ListNode(5);
		ListNode node_6 = new ListNode(6);
		ListNode node_7 = new ListNode(7);
		head.setNext(node_2);
		node_2.setNext(node_3);
		node_3.setNext(node_4);
		node_4.setNext(node_5);
		node_5.setNext(node_6);
		node_6.setNext(node_7);
		node_7.setNext(null);

		// 输出原始链表
		System.out.println("原始链表：");
		printList(head);
		System.out.println("----------------");

		// 删除结点node_3
		deleteNode(head, node_3);
		System.out.println("删除node_3后链表：");
		printList(head);
		System.out.println("----------------");

		// 删除结点head
		deleteNode(head, head);
		System.out.println("删除head后链表：");
		printList(head);
		System.out.println("----------------");
	}

	/**
	 * 狸猫换太子删除结点
	 * 
	 * @param head头指针
	 * @param toBeDeleted要删除的指针
	 */
	public static void deleteNode(ListNode head, ListNode toBeDeleted) {
		if (head == null || toBeDeleted == null) {
			return;
		}

		// 找到要删除的节点的下一个节点
		if (toBeDeleted.getNext() != null) {
			ListNode p = toBeDeleted.getNext();// p为toBeDeleted的下一个节点
			toBeDeleted.setValue(p.getValue());
			// 删除p节点
			toBeDeleted.setNext(p.getNext());
		} else if (head == toBeDeleted) {
			// 如果头结点就是要删除的节点
			head = null;
		} else {
			// 删除尾节点
			ListNode currentNode = head;// 用于遍历链表
			while (currentNode.getNext() != toBeDeleted) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
		}
	}

	/**
	 * 打印链表
	 * 
	 * @param head头指针
	 */
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getValue() + "、");
			current = current.getNext();
		}
		System.out.println();
	}
}
