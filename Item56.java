package org.algorithm.pointtooffer;

/**
 * ������56�������л�����ڽ��
 * 
 * @author dell
 * 
 */
public class Item56 {
	public static void main(String args[]) {
		// ��������
		ListNode head = new ListNode(1);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(3);
		ListNode node_4 = new ListNode(4);
		ListNode node_5 = new ListNode(5);
		ListNode node_6 = new ListNode(6);
		head.setNext(node_2);
		node_2.setNext(node_3);
		node_3.setNext(node_4);
		node_4.setNext(node_5);
		node_5.setNext(node_6);
		node_6.setNext(node_3);

		// �ҵ�������ڽ��
		System.out.println("������ڽ��Ϊ��" + getEntry(head).getValue());
	}
	
	/**
	 * ������ڽ��ĸ���
	 * @param head
	 * @return
	 */
	public static int numOfCycle(ListNode head) {
		// �����Ƿ����
		if (head == null) {
			return -1;// -1��ʾ�����ڻ�
		}

		// ��������ָ��
		ListNode fastNode = head;
		ListNode slowNode = head;

		int num = 0; // ���н��ĸ���

		while (fastNode != null && slowNode != null) {
			if (fastNode.getNext() != null
					&& fastNode.getNext().getNext() != null) {
				fastNode = fastNode.getNext().getNext();
			} else {
				return -1;// -1��ʾ�����ڻ�
			}
			slowNode = slowNode.getNext();
			// ������ʾ���ڻ�
			if (fastNode == slowNode) {
				break;// ����ѭ��
			}
		}

		// ���㻷�н��ĸ���
		num++;
		slowNode = slowNode.getNext();
		while (slowNode != fastNode) {
			slowNode = slowNode.getNext();
			num++;
		}
		return num;
	}
	
	/**
	 * �õ���ڽ��
	 * @param head
	 * @return
	 */
	public static ListNode getEntry(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode fastNode = head;
		ListNode slowNode = head;
		int k = numOfCycle(head);
		// �޻�
		if (k == -1) {
			return null;
		}

		// ��ָ������k��������ǹؼ�
		for (int i = 0; i < k; i++) {
			fastNode = fastNode.getNext();
		}

		// ͬʱ��
		while (fastNode != slowNode) {
			fastNode = fastNode.getNext();
			slowNode = slowNode.getNext();
		}

		return fastNode;
	}
}
