package org.algorithm.pointtooffer;

/**
 * ������57��ɾ���������ظ��Ľ��
 * 
 * @author dell
 * 
 */
public class Item57 {
	public static void main(String args[]) {
		// ��������
		ListNode head = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		ListNode node_4 = new ListNode(3);
		ListNode node_5 = new ListNode(4);
		ListNode node_6 = new ListNode(4);
		ListNode node_7 = new ListNode(5);
		head.setNext(node_2);
		node_2.setNext(node_3);
		node_3.setNext(node_4);
		node_4.setNext(node_5);
		node_5.setNext(node_6);
		node_6.setNext(node_7);
		node_7.setNext(null);

		// ɾ���ظ����
		ListNode head_new = deleteDuplication(head);

		// ��ӡ�µ�����
		printList(head_new);

	}

	public static ListNode deleteDuplication(ListNode head) {
		// �������ڻ���ֻ��һ�����
		if (head == null || head.getNext() == null) {
			return head;
		}

		ListNode preNode = head;
		ListNode currentNode = head.getNext();// ������Ǳ�������

		while (currentNode != null) {
			// ��ͷָ��ָ��Ľ��ֵ���
			if (currentNode.getValue() == head.getValue()) {
				while (currentNode.getValue() == head.getValue()) {
					currentNode = currentNode.getNext();
				}
				head = currentNode;
			} else {
				ListNode post = preNode.getNext();
				currentNode = currentNode.getNext();
				if (post.getValue() == currentNode.getValue()) {
					while (currentNode.getValue() == post.getValue()) {
						currentNode = currentNode.getNext();
					}
					preNode.setNext(currentNode);
				}
				
			}
		}
		return head;
	}

	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getValue() + "��");
			current = current.getNext();
		}
	}
}
