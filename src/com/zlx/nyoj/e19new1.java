package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class e19new1 {

	private static int t, n, m;

	public static void main(String[] args) throws IOException {

		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));

		st.nextToken();
		t = (int) st.nval;
		while (t-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			dfs("", 0);
		}
	}

	private static void dfs(String str, int a) {

		if (str.length() == m) {
			System.out.println(str);
			return;
		}

		if (str.length() > m)
			return;

		for (int i = 1; i <= n; i++) {
			if (!str.contains(i + "")) {
				dfs(str + i, i);
			}
		}
	}
}
