/*** Title: e55
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午2:52:29*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class e55 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static List<Integer> vector = new ArrayList<Integer>();

	public static void main(String[] args) {
		int N = cin.nextInt();

		while (N-- > 0) {
			vector.clear();
			int n = cin.nextInt();
			for (int i = 1; i <= n; i++) {
				vector.add(cin.nextInt());
			}
			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {

		int i = n;

		while (vector.size() != 1) {
			Collections.sort(vector);
			int a = vector.get(0);
			int b = vector.get(1);
			vector.remove(0);
			vector.remove(0);
			vector.add(a + b);

		}
		System.out.println(vector.get(0));

	}

}
