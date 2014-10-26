package org.algorithm.pointtooffer;

/**
 * ��Ŀ������Ϊs����������
 * 
 * @author dell
 * 
 */
public class Item41_1 {

	public static void main(String args[]) {
		System.out.println("��ӡ���У�");
		findSquenceWithSum(15);

	}

	/**
	 * ��������
	 * 
	 * @param s��
	 */
	public static void findSquenceWithSum(int s) {
		if (s < 3) {
			System.out.println("������");
			return;
		}
		int high = 2;// ��������������ô��СҲ��Ϊ3
		int low = 1;
		int currentSum = low + high;// ��¼��ǰ�ĺ�

		int end = (1 + s) / 2;
		while (low < end) {
			// ��==s���򷵻�
			if (currentSum == s) {
				printSquence(low, high);
			}
			// ���ڣ�Ҫ��С
			while (currentSum > s && low < end) {
				currentSum -= low;
				low++;
				if (currentSum == s) {
					printSquence(low, high);
				}
			}
			high++;
			currentSum += high;

		}
	}

	/**
	 * ��ӡ����
	 * 
	 * @param low�½�
	 * @param high�Ͻ�
	 */
	public static void printSquence(int low, int high) {
		// �ж��Ƿ����Ҫ��
		if (high - low <= 0) {// ֻ��һ��������high<low
			System.out.println("������");
			return;
		}
		for (int i = low; i <= high; i++) {
			System.out.print(i + "��");
		}
		System.out.println();// ����
	}
}
