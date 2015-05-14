/*** Title: e49
* Description: 开心的小明
* @author zoulux
* @date 2015年5月13日 下午2:10:24*/

package com.zlx.nyoj;
import java.io.BufferedInputStream;
import java.util.Scanner;
public class e49 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
public static void main(String[] args) {

		int N=cin.nextInt();
		while (N-->0) {
			int n=cin.nextInt(); //总钱数
			int m=cin.nextInt();//物品个数
			int v[]=new int[m+1]; //物品价格
			int p[]=new int[m+1];//重要程度
			for (int i = 1; i <= m; i++) {
				v[i]=cin.nextInt();
				p[i]=cin.nextInt();
				
			}
			solve(n,m,v,p);
		}

	
	cin.close();
}
private static void solve(int n, int m, int[] v, int[] p) {
	int dp[]=new int[n+1];
	for (int i = 1; i <= m; i++) {
		for (int j = n; j >=v[i]; j--) {
			int a=dp[j];
			int b=dp[j-v[i]]+p[i]*v[i];
			dp[j]=max(a,b);
			
		}
	}
	System.out.println(dp[n]);
	
}
private static int max(int i, int j) {
	
	return i>j?i:j;
}
}
