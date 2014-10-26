package org.algorithm.pointtooffer;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * ������30����С��k����
 * 
 * @author dell
 * 
 */
public class Item30 {
	public static void main(String args[]) {
		// ���Ե�����
		int array[] = { 4, 5, 1, 6, 2, 7, 3, 8 };
		final int k = 4;
		TreeSet<Integer> set = getLeastNumbers(array, k);
		// ���
		Iterator<Integer> it = set.iterator();
		System.out.println("��С��" + k + "����Ϊ��");
		while (it.hasNext()) {
			System.out.print(it.next() + "��");
		}

	}

	public static TreeSet<Integer> getLeastNumbers(int array[], int k) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		// �ж�k��array�ĺϷ���
		if (array == null || k <= 0) {
			return null;
		}

		for (int i = 0; i < array.length; i++) {
			if (set.size() < k) {// ���TreeSet�е�Ԫ��С��K������ֱ�Ӳ���
				set.add(array[i]);
			} else {// TreeSet�е�Ԫ�ش���K��
				if (set.last() > array[i]) {// ����Ԫ�ش���array[i]
					set.pollLast();// �Ƴ�
					set.add(array[i]);// �����µ�
				}
			}
		}

		return set;

	}

}
