package org.algorithm.pointtooffer;

/**
 * ������4���滻�ո�
 * 
 * @author dell
 * 
 */
public class Item04 {
	public static void main(String args[]) {
		String s = "We are happy.";
		char c_old[] = s.toCharArray();
		// Ϊ����������Ǽ������һ���µĿռ䣬�ռ�Ĵ�С���Դ����滻����ַ�
		char c_new[] = new char[100];
		for (int i = 0; i < c_old.length; i++) {
			c_new[i] = c_old[i];
		}

		// ����µ�����
		System.out.println(replaceBlank(c_new, c_old.length));
	}
	
	/**
	 * �����µ��ַ���
	 * @param c���ո���ַ�����
	 * @param length��ָ��һ���ַ������һ���ַ��ĳ��ȣ������ַ�����ĳ���
	 * @return
	 */
	public static String replaceBlank(char c[], int length) {
		// ���ҿո����Ŀ
		int blank = 0;
		for (int i = 0; i < length; i++) {
			if (c[i] == ' ') {
				blank++;
			}
		}

		// ���¼����µ�����Ĵ�С
		int length_new = length + blank * 2;

		// ��β��ͷ����
		int j = length - 1;
		int k = length_new - 1;
		while (j >= 0 && k >= 0) {
			if (c[j] != ' ') {
				c[k--] = c[j];
			} else {
				c[k--] = '0';
				c[k--] = '2';
				c[k--] = '%';
			}
			j--;
		}
		return new String(c);
	}
}
