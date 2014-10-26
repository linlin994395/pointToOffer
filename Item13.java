package org.algorithm.pointtooffer;

/**
 * ������13����O(1)ʱ��ɾ������Ľڵ�
 * 
 * @author dell
 * 
 */
public class Item13 {
	public static void main(String args[]) {
		// ��������
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

		// ���ԭʼ����
		System.out.println("ԭʼ����");
		printList(head);
		System.out.println("----------------");

		// ɾ�����node_3
		deleteNode(head, node_3);
		System.out.println("ɾ��node_3������");
		printList(head);
		System.out.println("----------------");

		// ɾ�����head
		deleteNode(head, head);
		System.out.println("ɾ��head������");
		printList(head);
		System.out.println("----------------");
	}

	/**
	 * ��è��̫��ɾ�����
	 * 
	 * @param headͷָ��
	 * @param toBeDeletedҪɾ����ָ��
	 */
	public static void deleteNode(ListNode head, ListNode toBeDeleted) {
		if (head == null || toBeDeleted == null) {
			return;
		}

		// �ҵ�Ҫɾ���Ľڵ����һ���ڵ�
		if (toBeDeleted.getNext() != null) {
			ListNode p = toBeDeleted.getNext();// pΪtoBeDeleted����һ���ڵ�
			toBeDeleted.setValue(p.getValue());
			// ɾ��p�ڵ�
			toBeDeleted.setNext(p.getNext());
		} else if (head == toBeDeleted) {
			// ���ͷ������Ҫɾ���Ľڵ�
			head = null;
		} else {
			// ɾ��β�ڵ�
			ListNode currentNode = head;// ���ڱ�������
			while (currentNode.getNext() != toBeDeleted) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
		}
	}

	/**
	 * ��ӡ����
	 * 
	 * @param headͷָ��
	 */
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getValue() + "��");
			current = current.getNext();
		}
		System.out.println();
	}
}
