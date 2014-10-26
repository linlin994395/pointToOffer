package org.algorithm.pointtooffer;

/**
 * ������3����ά����Ĳ���
 * 
 * @author dell
 * 
 */
public class Item03 {
	public static void main(String args[]) {
		// �����õ�����
		int A[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		System.out.println(find(A, 7));
	}
	
	/**
	 * ��ά����Ĳ���
	 * @param array ��֪������
	 * @param number �����ҵ���
	 * @return
	 */
	public static boolean find(int array[][], int number) {
		boolean flag = false;
		int rows = array.length;// ����
		int columns = array[0].length;// ����
		int row = 0;
		int column = columns - 1;
		while (row < rows && column >= 0) {
			// �Ƚ϶�ά�����е�Ԫ����number�Ĺ�ϵ
			if (array[row][column] == number) {
				flag = true;
				break;// ����ѭ��
			} else if (array[row][column] > number) {
				// �б�С
				column--;
			} else {
				// �б��
				row++;
			}
		}
		return flag;
	}
}
