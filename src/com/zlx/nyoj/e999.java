/*** Title: e999
 * Description: 师傅又被妖怪抓走了
 * @author zoulux
 * @date 2015年5月14日 下午9:41:39*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

import com.zlx.mytools.Array;

public class e999 {
	static String[][] data = new String[101][101];
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));

	public static void main(String[] args) {
		while (cin.hasNext()) {
			reSet();
			String[] da = cin.nextLine().split(" ");
			int n = Integer.parseInt(da[0]);
			int m = Integer.parseInt(da[1]);
			int T = Integer.parseInt(da[2]);
			String string[] = new String[n+1];
			for (int i = 1; i <= n; i++) {
				string[i] = cin.nextLine();
			}
			for (int i = 1; i <=n; i++) {
				char c[] = string[i].toCharArray();
			
				for (int j = 1; j <=m; j++) {
					data[i][j] = c[j-1] + "";
				}
			}

			Array.print(data,n+1,m+1);
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= m; j++) {
//					System.out.print(data[i][j] + " ");
//				}
//				System.out.println();
//			}
		}
		cin.close();
	}

	private static void reSet() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				data[i][j] = ".";
			}
		}

	}
}
