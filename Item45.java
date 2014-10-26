package org.algorithm.pointtooffer;

/**
 * ������45��ԲȦ�����ʣ�µ�����
 * 
 * @author dell
 * 
 */
public class Item45 {
	public static void main(String args[]) {
		System.out.println(lastRemaining(5, 3));
	}

	/**
	 * �Ƚ�����İ취���Ƶ���һ���Ƶ���ʽ
	 * 
	 * @param n
	 *            ��n������
	 * @param m
	 *            ��ɾ����m������
	 * @return
	 */
	public static int lastRemaining(int n, int m) {
		if (n < 1 || m < 1) {
			return -1;
		}

		int last = 0;
		for (int i = 2; i <= n; i++) {
			last = (last + m) % i;
		}
		return last;
	}

}
