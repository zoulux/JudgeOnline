package com.zlx.akoj;
public class e1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1100; i <= 9999; i = i + 1100)
			for (int j = 0; j <= 99; j = j + 11) {
				int t = i + j;
				if (f(t))
					System.out.println(t);
			}
	}

	private static boolean f(int n) {
		int kf =(int) Math.sqrt(n);
		if (kf * kf == n)
			return true;
		else
			return false;
	}

}
