package org.algorithm.pointtooffer;

/**
 * ������29�������г��ִ�������һ�������
 * 
 * @author dell
 * 
 */
public class Item29 {
	public static void main(String args[]) {
		int testArray[] = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println("����һ�������Ϊ��" + moreThanHalfNum(testArray));
	}

	public static int moreThanHalfNum(int array[]) {
		// һ������Ľⷨ
		int length = array.length;// ����ĳ���
		int result = array[0];
		int times = 0;
		for (int i = 1; i < length; i++) {
			if (times == 0) {
				result = array[i];
				times = 1;
			} else if (array[i] == result) {
				times++;
			} else {
				times--;
			}
		}
		return result;
	}
}
