package com.zlx.nyoj;

import java.util.Scanner;

/*** Title: e171
 * Description: 聪明的kk
 * @author zoulux
 * @date 2015年5月11日 下午11:53:21*/

public class e171 {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while (cin.hasNext()) {
			int N=cin.nextInt();
			int M=cin.nextInt();
			int[][] data=new int[N+1][M+1];
			for (int i = 1; i <N+1; i++) {
				for (int j = 1; j <M+1; j++) {
					data[i][j]=cin.nextInt();
				}
			}
			for (int i = 1; i < N+1; i++) {
				for (int j = 1; j < M+1; j++) {
					data[i][j]=data[i][j]+Math.max(data[i-1][j], data[i][j-1]);
				}
			}
			/**
			 * 将每条路线都走一遍
			 * 
			 */
			for (int i = 0; i <N+1; i++) {
				for (int j = 0; j < M+1; j++) {
					System.out.print(data[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(data[N][M]);
			
	}
}
}
