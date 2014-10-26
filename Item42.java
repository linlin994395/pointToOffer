package org.algorithm.pointtooffer;

/**
 * ������42����ת����˳��VS����ת�ַ���
 * 
 * @author dell
 * 
 */
public class Item42 {
	public static void main(String args[]) {
		String s = "I am a student.";

		System.out.println(reverseSentence(s));
	}

	/**
	 * ��ת�����ַ���
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseSentence(String s) {
		// ���ַ���ת�����ַ�����
		char c[] = s.toCharArray();
		// �Ƚ������ַ����鷭ת
		reverse(c, 0, c.length - 1);

		// �ٷ�תÿһ������
		int lengthOfTerm = 0;// ���ʵĳ���
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				int end = i - 1;// ĩβ��λ��
				int start = end - lengthOfTerm + 1;
				reverse(c, start, end);// ��ת����
				lengthOfTerm = 0;// ������0������һ�ε�ͳ��
			} else {
				lengthOfTerm++;// ���ӵ��ʵĸ���
			}
		}

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
