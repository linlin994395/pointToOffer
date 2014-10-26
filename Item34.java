package org.algorithm.pointtooffer;

/**
 * ������34������
 * 
 * @author dell
 * 
 */
public class Item34 {
	public static void main(String args[]) {
		int index = 7;
		System.out.println("��" + index + "������Ϊ��" + getUglyNum(7));
	}

	/**
	 * ����index�������
	 * 
	 * @param index�������±�
	 * @return����
	 */
	public static int getUglyNum(int index) {
		// ���index
		if (index <= 0) {
			return 0;
		}
		// Ϊ�˱��ڴ洢�����Խ������鱣���м���
		int tmp[] = new int[index];
		// �����һ��
		tmp[0] = 1;
		// ��¼��������λ��
		int multi2 = 0;
		int multi3 = 0;
		int multi5 = 0;

		int nextUglyNum = 1;
		while (nextUglyNum < index) {
			int min = findMin(tmp[multi2] * 2, tmp[multi3] * 3, tmp[multi5] * 5);
			tmp[nextUglyNum] = min;

			// ���¼���multi2,multi3,multi5
			while (tmp[multi2] * 2 <= min) {
				multi2++;
			}
			while (tmp[multi3] * 3 <= min) {
				multi3++;
			}
			while (tmp[multi5] * 5 <= min) {
				multi5++;
			}
			nextUglyNum++;
		}
		return tmp[index - 1];
	}

	/**
	 * ��������������Сֵ
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int findMin(int a, int b, int c) {
		int minTmp = (a < b ? a : b);
		return (minTmp < c ? minTmp : c);
	}
}
