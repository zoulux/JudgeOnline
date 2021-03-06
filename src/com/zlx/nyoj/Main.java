package com.zlx.nyoj;
 
import java.io.BufferedInputStream;

public class Main{
	static int[][] arr = new int[102][102];
	static BufferedInputStream bis = new BufferedInputStream(System.in);

	public static void main(String[] args) throws Exception {
		int nCase, row, col, max;
		nCase = getInt();
		while (nCase-- != 0) {
			row = getInt();
			col = getInt();
			// 输入,并处理，连续和的小技巧
			for (int r = 1; r <= row; r++) {
				for (int c = 1; c <= col; c++) {
					arr[r][c] = getInt();
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
		bis.close();
	}

	static int getInt() throws Exception {
		int i, temp = 0, mark = 1;
		while ((i = bis.read()) < 45)
			;
		if (i == 45) {
			mark = -1;
			i = bis.read();
		}
		while (i > 47) {
			temp = temp * 10 + i - 48;
			i = bis.read();
		}
		return temp * mark;
	}
}
        