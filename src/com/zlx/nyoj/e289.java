/*** Title: e289
 * Description: ƻ��
 * @author zoulux
 * @date 2015��5��12�� ����10:17:03*/

package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class e289 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); //n��ƻ��
			int size = cin.nextInt();	//������С
			if (n == size && n == 0) {
				break;
			}
			int[] w = new int[n+1];
			int[] v = new int[n+1];
			for (int i = 1; i <= n; i++) {
				w[i] = cin.nextInt();
				v[i] = cin.nextInt();
			}
			
			solve(w,v,n,size);

		}
	}

	private static void solve(int[] w, int[] v, int n, int size) {
		int f[]=new int[size+1];
		for (int i = 1; i <= n; i++) {
			for (int j = size; j >=w[i]; j--) {
				f[j]=Math.max(f[j], f[j-w[i]]+v[i]);
			}
		}
		
		
		
	System.out.println(f[size]);
	}
}
