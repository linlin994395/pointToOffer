package org.algorithm.pointtooffer;

/**
 * ������38�����������������г��ֵĴ���
 * 
 * @author dell
 * 
 */
public class Item38 {
	public static void main(String args[]) {
		// ����
		int array[] = { 1, 2, 3, 3, 3, 3, 4, 5 };
		int k = 3;// �����ҵ���
		System.out.println(k + "�ĸ���Ϊ��" + getNumOfK(array, k));
	}

	/**
	 * ͨ�������ʼλ�úͽ���λ�ã���������еĸ���
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public static int getNumOfK(int array[], int k) {
		int num = 0;
		if (array != null) {
			int index_start = getFirstK(array, k, 0, array.length - 1);// ��ʼλ��
			int index_end = getLastK(array, k, 0, array.length - 1);// ����λ��

			if (index_start > -1 && index_end > -1) {
				num = index_end - index_start + 1;
			}
		}
		return num;
	}

	/**
	 * ����k�������е����ȳ��ֵ�λ��
	 * 
	 * @param array��ʼ����
	 * @param k�����ҵ�ֵ
	 * @return
	 */
	public static int getFirstK(int array[], int k, int low, int high) {
		// �ж�low��high
		if (low > high) {
			return -1;
		}
		// �۰���ҵ�˼�룬���м�λ��
		int middle = (low + high) / 2;

		// �����Ƿ�Ϊk
		if (array[middle] == k) {// ���ҵ�ֵ��Ϊk��ʣ�µ����ж��Ƿ��ǵ�һ��k
			// �ǵ�һ��
			if ((middle > 0 && array[middle - 1] != k) || middle == 0) {
				return middle;
			}
			// ���ǵ�һ��
			else {
				high = middle - 1;
			}
		} else if (array[middle] > k) {// �����
			high = middle - 1;
		} else {// ���Ҳ�
			low = middle + 1;
		}

		return getFirstK(array, k, low, high);
	}

	/**
	 * ����getFirstK���������һ��ΪK
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public static int getLastK(int array[], int k, int low, int high) {
		// �ж�low��high
		if (low > high) {
			return -1;
		}
		int middle = (low + high) / 2;

		// �����Ƿ�Ϊk
		if (array[middle] == k) {// ���ҵ�ֵ��Ϊk��ʣ�µ����ж��Ƿ������һ��k
			// �����һ��
			if ((middle > 0 && array[middle + 1] != k)
					|| middle == array.length - 1) {
				return middle;
			}
			// �������һ��
			else {
				low = middle + 1;
			}
		} else if (array[middle] > k) {// �����
			high = middle - 1;
		} else {// ���Ҳ�
			low = middle + 1;
		}

		return getLastK(array, k, low, high);
	}

}
