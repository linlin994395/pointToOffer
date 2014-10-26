package org.algorithm.pointtooffer;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 面试题30：最小的k个数
 * 
 * @author dell
 * 
 */
public class Item30 {
	public static void main(String args[]) {
		// 测试的例子
		int array[] = { 4, 5, 1, 6, 2, 7, 3, 8 };
		final int k = 4;
		TreeSet<Integer> set = getLeastNumbers(array, k);
		// 输出
		Iterator<Integer> it = set.iterator();
		System.out.println("最小的" + k + "个数为：");
		while (it.hasNext()) {
			System.out.print(it.next() + "、");
		}

	}

	public static TreeSet<Integer> getLeastNumbers(int array[], int k) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		// 判断k和array的合法性
		if (array == null || k <= 0) {
			return null;
		}

		for (int i = 0; i < array.length; i++) {
			if (set.size() < k) {// 如果TreeSet中的元素小于K个，则直接插入
				set.add(array[i]);
			} else {// TreeSet中的元素大于K个
				if (set.last() > array[i]) {// 最大的元素大于array[i]
					set.pollLast();// 移除
					set.add(array[i]);// 加入新的
				}
			}
		}

		return set;

	}

}
