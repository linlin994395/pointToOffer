package org.algorithm.pointtooffer;

/**
 * ������10����������1�ĸ���
 * 
 * @author dell
 * 
 */
public class Item10 {
	public static void main(String args[]) {

		int n = 9;
		System.out.println("9�Ķ����Ʊ�ʾ��1�ĸ���Ϊ��" + numberOf1(n));

	}
	
	/**
	 * ��������Ĳ���
	 * @param n
	 * @return
	 */
	public static int numberOf1(int n) {
		int count = 0;

		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}

		return count;
	}

}
