/*** Title: e214new
 * Description: 
 * @author zoulux
 * @date 2015年5月13日 下午3:33:36*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class e214new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int dp[] = new int[100000];	
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int data[] = new int[N];
			for (int i = 0; i < N; i++) {
				data[i] = cin.nextInt();
			}

			dp[0] = Integer.MIN_VALUE;
			dp[1]=data[0];
			int count=1,j=0;
			for (int i = 1; i < N; i++) {
					j=binarySearch(data[i],count);
		//		j=Math.abs(Arrays.binarySearch(dp, 0, count, data[i]));  //java大法好，学java保平安
				
					dp[j]=data[i];
					if (j>count) {
						count=j;
					}
			}
			System.out.println(count);

		}
		cin.close();
	}

	private static int binarySearch(int x, int count) {
		int left=1;
		int right=count;
		int mid=(left+right)/2;
		
		while (left<=right) {
			if (x==dp[mid]) {
				return mid;
			}

			if (x>dp[mid]) {
				
				left=mid+1;
				
			}else {
				right=mid-1;
			}
			mid=(left+right)/2;
			
		}
		return left;
	}
}
