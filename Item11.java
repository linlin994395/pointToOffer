package org.algorithm.pointtooffer;

/**
 * ������11����ֵ�������η�
 * 
 * @author dell
 * 
 */
public class Item11 {
	public static void main(String args[]) {
		int base = 2;
		int exponent_1 = 9;
		int exponent_2 = 10;
		System.out.println("��exponentΪ������" + power(base, exponent_1));
		System.out.println("��exponentΪż����" + power(base, exponent_2));
	}

	/**
	 * �����η�
	 * 
	 * @param base��
	 * @param exponentָ��
	 * @return
	 */
	public static double power(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}

		if (exponent == 1) {
			return base;
		}
		if (exponent >> 1 == 0) {// ż��
			int exponent_1 = exponent >> 1;
			double tmp = power(base, exponent_1);
			return tmp * tmp;
		} else {// ��ż��
			int exponent_2 = exponent - 1;// -1�����ż��
			double tmp = power(base, exponent_2);
			return tmp * base;// ������ȿ�ʼ������һ��base
		}
	}
}
