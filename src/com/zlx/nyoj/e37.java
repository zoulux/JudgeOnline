/*** Title: e37
 * Description: 
 * @author zoulux
 * @date 2015年5月15日 下午10:08:45*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class e37 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int[][] dp=new int[1010][1010];
	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], 0);
			}
	
			
			String data = cin.next();
			String dataRe = new StringBuffer(data).reverse().toString();
			
			solve(data,dataRe);
		}
		cin.close();
	}

	private static void solve(String data, String dataRe) {
		int size=data.length();
		data=" "+data;
		dataRe=" "+dataRe;
		
		int max=0;
		for (int i = 1; i <=size; i++) {
			for (int j = 1; j <=size; j++) {
				char ic=data.charAt(i);
				char jc=dataRe.charAt(j);
				if (ic==jc) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
					
				}
				
				if (dp[i][j]>max) {
					max=dp[i][j];
				}
			}
		}
		
		System.out.println(size-max);
	}
}
