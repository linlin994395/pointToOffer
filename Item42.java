package org.algorithm.pointtooffer;

/**
 * 面试题42：翻转单词顺序VS左旋转字符串
 * 
 * @author dell
 * 
 */
public class Item42 {
	public static void main(String args[]) {
		String s = "I am a student.";

		System.out.println(reverseSentence(s));
	}

	/**
	 * 翻转整个字符串
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseSentence(String s) {
		// 将字符串转换成字符数组
		char c[] = s.toCharArray();
		// 先将整个字符数组翻转
		reverse(c, 0, c.length - 1);

		// 再翻转每一个单词
		int lengthOfTerm = 0;// 单词的长度
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				int end = i - 1;// 末尾的位置
				int start = end - lengthOfTerm + 1;
				reverse(c, start, end);// 翻转单词
				lengthOfTerm = 0;// 重新置0，做下一次的统计
			} else {
				lengthOfTerm++;// 增加单词的个数
			}
		}

		return new String(c);
	}

	/**
	 * 通用的对每个字符数组翻转
	 * 
	 * @param c
	 * @param start字符数组的开始
	 * @param end字符数组的结束
	 */
	public static void reverse(char c[], int start, int end) {
		// 不满足要求的输入
		if (c == null || start > end) {
			return;
		}
		// 只有一个字符
		if (start == end) {
			return;
		}

		while (start < end) {
			char tmp = c[start];
			c[start] = c[end];
			c[end] = tmp;
			start++;
			end--;
		}
	}

}
