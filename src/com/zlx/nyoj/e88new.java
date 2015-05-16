/*** Title: e88new
 * Description: 
 * @author zoulux
 * @date 2015年5月15日 下午4:55:38*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e88new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	static final int MAX = 100006;

	public static void main(String[] args) {
		map.put(1, 1);
		solve();
		int N = cin.nextInt();
		while (N-- > 0) {
			int m = cin.nextInt();
			
			if (m>MAX-1) {
				if (m%100000 <6) {
					m=100000 +m%10;
				}else {
					m%=100000 ;
				}
			}
			System.out.println(map.get(m));
		}
		cin.close();

	}

	private static void solve() {

		for (int i = 2; i < MAX; i++) {
			map.put(i, (map.get(i - 1) * 2 + 1) % 1000000);
		}

	}
}
