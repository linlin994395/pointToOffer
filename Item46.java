package org.algorithm.pointtooffer;

/**
 * √Ê ‘Ã‚46£∫«Û1+2+...+n
 * 
 * @author dell
 * 
 */
class Tmp {
	private int N;
	private int sum;

	public Tmp() {
		++N;
		sum += N;
	}

	public int getSum() {
		return this.sum;
	}
}

public class Item46 {
	public static void main(String args[]) {
		Tmp t = new Tmp();
		System.out.println(t.getSum());
	}
}
