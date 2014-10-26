package org.algorithm.pointtooffer;

/**
 * ������17���ϲ��������������
 * 
 * @author dell
 * 
 */
public class Item17 {
	public static void main(String args[]) {
		// ��������1
		ListNode head1 = new ListNode(1);
		ListNode node1_2 = new ListNode(3);
		ListNode node1_3 = new ListNode(5);
		ListNode node1_4 = new ListNode(7);
		head1.setNext(node1_2);
		node1_2.setNext(node1_3);
		node1_3.setNext(node1_4);
		node1_4.setNext(null);
		// ��������2
		ListNode head2 = new ListNode(2);
		ListNode node2_2 = new ListNode(4);
		ListNode node2_3 = new ListNode(6);
		ListNode node2_4 = new ListNode(8);
		head2.setNext(node2_2);
		node2_2.setNext(node2_3);
		node2_3.setNext(node2_4);
		node2_4.setNext(null);

		System.out.println("����1��");
		printList(head1);
		System.out.println("-------------");

		System.out.println("����2��");
		printList(head2);
		System.out.println("-------------");

		System.out.println("�ϲ��������");
		ListNode head = mergeList(head1, head2);
		printList(head);
		System.out.println("-------------");
	}
	
	/**
	 * �ϲ���������
	 * @param head1����1
	 * @param head2����2
	 * @return
	 */
	public static ListNode mergeList(ListNode head1, ListNode head2) {
		ListNode head = null;// �ϲ����ͷָ��

		// �����һ��Ϊ�գ���Ϊ��һ������
		if (head1 == null) {
			head = head2;
		}
		if (head2 == null) {
			head = head1;
		}

		// ��������Ϊ��
		if (head1 != null && head2 != null) {
			// node_1��node_2�����ڱ���
			ListNode node_1 = head1;
			ListNode node_2 = head2;
			if (node_1.getValue() < node_2.getValue()) {
				head = node_1;
				head.setNext(mergeList(node_1.getNext(), node_2));
			} else {
				head = node_2;
				head.setNext(mergeList(node_1, node_2.getNext()));
			}
		}
		return head;
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
