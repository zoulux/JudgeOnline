package com.zlx.akoj;

import java.util.Scanner;

public class e1191new {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while (cinScanner.hasNext()) {
			int a = cinScanner.nextInt();
			int b = cinScanner.nextInt();
			int s = 0;
			Shu shu = new Shu();
			for (int j = a; j <= b; j++) {
				s += shu.res(j);
			}
			System.out.println(s);
		}
	}
}

class Shu {
	int res(int i) {

		int t = i;
		int times = 0;
		while (t != 2) {
			t /= 2;
			times++;
			System.out.println("i:" + t);
			// if (t == 1) {
			// t /= 2;
			// times++;
			// }
			if (t == 0) {
				t += 2;
				times++;
			}
		}
		return times;
	}
}
