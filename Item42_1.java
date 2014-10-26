package org.algorithm.pointtooffer;

/**
 * ��Ŀ��������ת�ַ���
 * 
 * @author dell
 * 
 */
public class Item42_1 {
	public static void main(String args[]) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(leftRotateString(s, k));
	}

	/**
	 * ����ת
	 * 
	 * @param sԭʼ�ַ���
	 * @param k��ת�ĸ���
	 * @return
	 */
	public static String leftRotateString(String s, int k) {
		// �ȼ��s��k�ĺϷ���
		if (s == null || k <= 0) {
			return s;
		}

		// ���ַ���ת�����ַ�����
		char c[] = s.toCharArray();
		// ��ת�����ַ���
		reverse(c, 0, c.length - 1);

		// �ҵ�k��λ��
		reverse(c, 0, c.length - 1 - k);
		reverse(c, c.length - k, c.length - 1);
		return new String(c);
	}

	/**
	 * ͨ�õĶ�ÿ���ַ����鷭ת
	 * 
	 * @param c
	 * @param start�ַ�����Ŀ�ʼ
	 * @param end�ַ�����Ľ���
	 */
	public static void reverse(char c[], int start, int end) {
		// ������Ҫ�������
		if (c == null || start > end) {
			return;
		}
		// ֻ��һ���ַ�
		if (start == end) {
			return;
		}

		while (start < end) {
			char tmp = c[start];
			c[start] = c[end];
			c[end] = tmp;
			start++;
			end--;
		}
	}

}
