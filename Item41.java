package org.algorithm.pointtooffer;

/**
 * ������41����Ϊs����������VS��Ϊs��������������
 * 
 * @author dell
 * 
 */
public class Item41 {
	public static void main(String args[]) {
		int array[] = { 1, 2, 4, 7, 11, 15 };
		int s = 15;
		int result[] = new int[2];// �洢������
		boolean flag = findNumWithSum(array, result, s);

		if (flag == true) {// ���������Ľ⣬���
			System.out.println("һ���Ϊ��" + result[0] + "��" + result[1]);
		} else {
			System.out.println("������");
		}

	}

	/**
	 * ��Ϊs����������
	 * 
	 * @param arrayԭʼ����
	 * @param result�������
	 * @param s��
	 * @return
	 */
	public static boolean findNumWithSum(int array[], int result[], int s) {
		int length = array.length;
		boolean flag = false;
		// ������飬Ҫ��֤�ܴ洢������
		if (length <= 0 || result.length != 2) {
			return flag;
		}

		// ����ָ��
		int low = 0;
		int high = length - 1;

		while (low < high) {
			// ������
			if (array[low] + array[high] == s) {
				// ��¼��
				result[0] = array[low];
				result[1] = array[high];
				flag = true;// ��ʾ�ҵ���
				break;
			}
			// ���>
			else if (array[low] + array[high] > s) {
				high--;// ��С
			}
			// ���С��
			else {
				low++;// ����
			}
		}
		return flag;
	}

}
