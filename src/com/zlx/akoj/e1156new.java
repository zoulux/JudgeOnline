package com.zlx.akoj;


public class e1156new {
	int up;
	int down;

	/**
	 * @param up
	 * @param down
	 */
	public e1156new(int up, int down) {
		this.up = up;
		this.down = down;
		simplify();
	}

	public e1156new(int up) {
		this(up, 1);
	}

	public e1156new() {
		this(0);
	}

	private void simplify() {
		if (up == 0)
			down = 1;
		else {
			int gcd = gcd(up, down);
			up /= gcd;
			down /= gcd;
		}

	}

	private int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public void disp() {
		if (up == 0)
			System.out.print(0);
		else if (down == 1)
			System.out.println(up);
		else
			System.out.print(String.format("%d/%d", up, down));
		System.out.println();
	}

	public static void main(String[] args) {
		e1156new sum = new e1156new();
		for (int i = 1; i <= 13; i++) {
			sum = sum.add(new e1156new(1, i));
		}
		sum.disp();
	}

	public e1156new div(e1156new that) {

		return this.mul(that.reverse());
	}

	private e1156new reverse() {

		return new e1156new(down, up);
	}

	private e1156new mul(e1156new that) {
		int up = this.up * that.up;
		int down = this.down * that.down;
		return new e1156new(up, down);
	}

	private e1156new sub(e1156new that) {
		int up = this.up * that.down - this.down * that.up;
		int down = this.down * that.down;
		return new e1156new(up, down);
	}

	private e1156new add(e1156new that) {
		int up = this.up * that.down + this.down * that.up;
		int down = this.down * that.down;
		return new e1156new(up, down);
	}
}
