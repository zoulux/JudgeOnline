/*** Title: e44
 * Description: 子串和
 * @author zoulux
 * @date 2015年5月12日 下午6:43:41*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class e44new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int data[] = new int[n];
			for (int i =0 ; i < n; i++) {
				data[i] = cin.nextInt();
			}

			solve(data);
		}
	//	cin.close();
	}

	private static void solve(int[] data) {
		int max,s;
		max=s=data[0];
		//s即是子串和，max即是最大子串和
		for (int d : data) {
			if (s>0) { 
				s+=d;
			}else {
				s=d;
			}
			if(s>max)
				max=s;
		}
		System.out.println(max);
		
		
	}


}
