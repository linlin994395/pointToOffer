package org.algorithm.pointtooffer;

/**
 * ������16����ת����
 * 
 * @author dell
 * 
 */
public class Item16 {
	/**
	 * ���Ժ���
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
		// ��ӡ
		ListNode reservedHead = reverseList(head);
		ListNode tmp = reservedHead;
		while (tmp != null) {
			System.out.print(tmp.getValue() + "��");
			tmp = tmp.getNext();
		}
	}

	/**
	 * �ǵݹ�ʵ��
	 * 
	 * @param headͷָ��
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
