/*** Title: e119
 * Description: 士兵杀敌（三）
 * @author zoulux
 * @date 2015年5月12日 下午7:54:25*/
package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class e119new {

	public static void main(String[] args) {
		class P {
			int a, b, c;
		}

		Vector<P> vector = new Vector<P>();
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int Q = cin.nextInt();
			int V[] = new int[N];
			for (int i = 0; i < N; i++) {
				V[i] = cin.nextInt();
			}

			while (Q-- > 0) {
				int a = cin.nextInt();
				int b = cin.nextInt();

				int flag=1;
				for (P p : vector) {
					if ((p.a == a && p.b == b) || p.a == b && p.b == a) {
						System.out.println(p.c);
						flag=0;
						break;
					}
				}
				if (flag==1) {
					P p = new P();
					p.a = a;
					p.b = b;
					int c=f(a, b, V);
					p.c = c;
					vector.add(p);
					System.out.println(c);
				}
				

			}
		}
	}

	private static int f(int i, int j, int[] v) {
		int VV[] = new int[j - i+1];
		for (int k = 0; k < j - i+1; k++) {
			VV[k] = v[i + k-1];
		}
		Arrays.sort(VV);
	//	System.out.println(Arrays.toString(VV));
		return VV[j - i ] - VV[0];
	}

}
