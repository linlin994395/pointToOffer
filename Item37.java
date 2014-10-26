package org.algorithm.pointtooffer;

/**
 * ������37����������ĵ�һ���������
 * 
 * @author dell
 * 
 */
public class Item37 {
	public static void main(String args[]) {
		// ��������
		ListNode head1 = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		ListNode head2 = new ListNode(4);
		ListNode node_5 = new ListNode(5);
		ListNode node_6 = new ListNode(6);
		ListNode node_7 = new ListNode(7);
		head1.setNext(node_2);
		node_2.setNext(node_3);
		node_3.setNext(node_6);
		node_6.setNext(node_7);
		node_7.setNext(null);
		head2.setNext(node_5);
		node_5.setNext(node_6);

		ListNode result = findFirst(head1, head2);
		System.out.println("��һ��������㣺" + result.getValue());
	}
	
	/**
	 * ���ҵ�һ���������
	 * @param head1����1��ͷָ��
	 * @param head2����2��ͷָ��
	 * @return
	 */
	public static ListNode findFirst(ListNode head1, ListNode head2) {
		ListNode p1 = head1;
		ListNode p2 = head2;
		int list_1_len = 0;
		int list_2_len = 0;
		// �ֱ������������ĳ���
		while (p1 != null) {
			list_1_len++;
			p1 = p1.getNext();
		}

		while (p2 != null) {
			list_2_len++;
			p2 = p2.getNext();
		}

		// ���Ȳ�
		int nLength = list_1_len - list_2_len;

		ListNode pLong = head1;
		ListNode pShort = head2;
		if (list_1_len < list_2_len) {
			pLong = head2;
			pShort = head1;
			nLength = list_2_len - list_1_len;
		}

		// ��������nLength��
		for (int i = 0; i < nLength; i++) {
			pLong = pLong.getNext();
		}

		// ��ʱ������ȣ�һ����ǰ�ߣ����ж����ǵ�ֵ�Ƿ����
		while (pLong != null && pShort != null && pLong != pShort) {
			pLong = pLong.getNext();
			pShort = pShort.getNext();
		}

		return pLong;

	}

}
