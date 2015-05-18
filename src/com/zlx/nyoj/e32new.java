/*** Title: e32new
 * Description: 组合数
 * @author zoulux
 * @date 2015年5月17日 下午9:46:55*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class e32new {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static int n, r;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != st.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			r = (int) st.nval;
			DFS(0, "");
		}
	}

	private static void DFS(int i, String s) {
		if (i == r) {
			System.out.println(s);
			return;
		}
		if (i > r) {
		//	return;
		}

		for (int j = n; j >= 1; j--) {
			if (!s.contains("" + j)) {
				if (s.equals("")) {
					DFS(i + 1, s + j);
				} else {
					if ((s.charAt(s.length() - 1) - '0') > (j)) {
					
				//		if (!s.endsWith(""+j)) {
						DFS(i + 1, s + j);
					}
				}

			}
		}
	}
}
