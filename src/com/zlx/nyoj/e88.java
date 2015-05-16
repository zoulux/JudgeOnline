/*** Title: e88
 * Description: 
 * @author zoulux
 * @date 2015年5月15日 下午4:22:07*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class e88 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int m = cin.nextInt();
			if (map.get(m) != null) {
				System.out.println(map.get(m));
			} else {
				solve(m);
			}
		}
		cin.close();
	}

	private static void solve(int m) {

	}

	private void hnt(int n, int a, int b, int c) {
		if (n > 0) {
			hnt(n - 1, a, c, b);
			move(a, b);
			hnt(n - 1, c, a, b);
		}

	}

	private void move(int a, int b) {
		

	}
}
