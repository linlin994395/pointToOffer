package org.algorithm.pointtooffer;

/**
 * ������47�����üӼ��˳����ӷ�
 * 
 * @author dell
 * 
 */
public class Item47 {

	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		System.out.println(add(a, b));
	}

	public static int add(int num1, int num2) {
		int sum = 0;
		int carry = 0;
		do {
			sum = num1 ^ num2;// ��һ�������
			carry = (num1 & num2) << 1;// �ڶ�������λ
			// �����������
			num1 = sum;
			num2 = carry;
		} while (num2 != 0);

		return num1;
	}
}
