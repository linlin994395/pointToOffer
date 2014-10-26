package org.algorithm.pointtooffer;

/**
 * ������15�������е�����k�����
 * 
 * @author dell
 * 
 */
public class Item15 {

	public static void main(String args[]) {
		// ��������
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
		// ���ҵ�����k��
		ListNode p = findKthToTail(head, 3);
		System.out.println(p.getValue());

	}

	public static ListNode findKthToTail(ListNode head, int k) {
		// �����ж������Ƿ���ڣ�k�Ƿ����0
		if (head == null || k <= 0) {
			return null;
		}

		ListNode prePoint = head;// ��һ��ָ��
		ListNode postPoint = head;// �ڶ���ָ��

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
