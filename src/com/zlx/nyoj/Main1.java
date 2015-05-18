package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main1 {
	static int[][] arr = new int[102][102];

	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));

	public static void main(String[] args) throws Exception {
		int nCase, row, col, max;
		st.nextToken();
		nCase = (int) st.nval;
		while (nCase-- != 0) {
			st.nextToken();
			row = (int) st.nval;
			st.nextToken();
			col = (int) st.nval;

			// 输入,并处理，连续和的小技巧
			for (int r = 1; r <= row; r++) {
				for (int c = 1; c <= col; c++) {
					st.nextToken();
					arr[r][c] = (int) st.nval;
					arr[r][c] += arr[r - 1][c];
				}
			}
			// 计算
			// 枚举子矩阵
			max = arr[1][1];
			for (int r = 1; r <= row; r++) {
				for (int _r = r; _r <= row; _r++) {
					int sum = 0;// 每一列的和
					for (int c = 1; c <= col; c++) {
						if (sum < 0) {
							sum = arr[_r][c] - arr[r - 1][c];
						} else {
							sum += arr[_r][c] - arr[r - 1][c];
							max = Math.max(max, sum);
						}
					}
				}
			}
			System.out.println(max);
		}

	}

}
