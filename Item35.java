package org.algorithm.pointtooffer;

import java.util.HashMap;

/**
 * 面试题35：第一个只出现一次的字符
 * 
 * @author dell
 * 
 */
public class Item35 {
	public static void main(String args[]) {
		// 测试
		String s = "abaccdeff";
		char c[] = s.toCharArray();
		System.out.println("第一个只出现一次的字符为：" + first(c));
	}

	/**
	 * 查找第一次只出现一次的字符
	 * 
	 * @param c待查找的字符数组
	 * @return
	 */
	public static char first(char c[]) {
		char tmp = 0;
		// 可以使用Hash表，key存储的是字符，value存储的是出现的次数
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			// hash表中已经存在key
			if (map.containsKey(c[i])) {
				// 修改其value
				int value = map.get(c[i]);// 根据key得到value
				map.remove(c[i]);
				map.put(c[i], value + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		// 插入完毕后依次搜索
		for (int i = 0; i < c.length; i++) {
			if (map.get(c[i]) == 1) {
				tmp = c[i];
				break;// 退出循环
			}
		}
		return tmp;
	}
}
