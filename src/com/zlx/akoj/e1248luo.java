package com.zlx.akoj;

import java.util.Scanner;


public class e1248luo {
	public static void shu(int n){
		
		int t=n;
		int k=0;
		int s=0;
		int re=1;
		int []a=new int [10001];
		while(t>1){
			for (int i = 1;i <=n; i++) {
				if (re>=2) {
					if (a[i]==2) {
						continue;
					}
					else{
					a[i]=k+1;
					if (a[i]==2) {
						k=0;
						t--;
					}
					if (a[i]==1) {
						s=i;
						k++;
					}}
				}
				else{
				a[i]=k+1;
				if (a[i]==2) {
					k=0;
					t--;
				}
				if (a[i]==1) {
					s=i;
					k++;
				}
			}
				
		}
		re++;	
		}
		System.out.println(s);
	}
public static void main(String[] args) {
	Scanner cinScanner=new Scanner(System.in);
	while(cinScanner.hasNext()){
		int n=cinScanner.nextInt();
		if (n==0) {
			return;
		}
		shu(n);
	}
}
}
