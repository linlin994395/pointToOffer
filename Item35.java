package org.algorithm.pointtooffer;

import java.util.HashMap;

/**
 * ������35����һ��ֻ����һ�ε��ַ�
 * 
 * @author dell
 * 
 */
public class Item35 {
	public static void main(String args[]) {
		// ����
		String s = "abaccdeff";
		char c[] = s.toCharArray();
		System.out.println("��һ��ֻ����һ�ε��ַ�Ϊ��" + first(c));
	}

	/**
	 * ���ҵ�һ��ֻ����һ�ε��ַ�
	 * 
	 * @param c�����ҵ��ַ�����
	 * @return
	 */
	public static char first(char c[]) {
		char tmp = 0;
		// ����ʹ��Hash��key�洢�����ַ���value�洢���ǳ��ֵĴ���
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			// hash�����Ѿ�����key
			if (map.containsKey(c[i])) {
				// �޸���value
				int value = map.get(c[i]);// ����key�õ�value
				map.remove(c[i]);
				map.put(c[i], value + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		// ������Ϻ���������
		for (int i = 0; i < c.length; i++) {
			if (map.get(c[i]) == 1) {
				tmp = c[i];
				break;// �˳�ѭ��
			}
		}
		return tmp;
	}
}
