/*** Title: e49
* Description: ���ĵ�С��
* @author zoulux
* @date 2015��5��13�� ����2:10:24*/

package com.zlx.nyoj;
import java.io.BufferedInputStream;
import java.util.Scanner;
public class e49 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
public static void main(String[] args) {

		int N=cin.nextInt();
		while (N-->0) {
			int n=cin.nextInt(); //��Ǯ��
			int m=cin.nextInt();//��Ʒ����
			int v[]=new int[m+1]; //��Ʒ�۸�
			int p[]=new int[m+1];//��Ҫ�̶�
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
