package com.zlx.akoj;
import java.util.Scanner;
public class e1214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int T = cin.nextInt();
			while (T-- > 0) {// 0.9875875875
				String p = cin.next();
				String q = cin.next();
				int fz = Integer.parseInt(q);
				double fm = Math.pow(10, p.length())
						- Math.pow(10, p.length() - q.length());
				int afz = Integer.parseInt("0" + p.replaceFirst(q, ""));
				double afm = Math.pow(10, p.length() - q.length());
				int FZ = (int) (afz * fm + afm * fz);
				int FM = (int) (afm * fm);
				int gys = gcd(FZ, FM);
				System.out.println(FZ / gys + "/" + FM / gys);
			}
		}
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
