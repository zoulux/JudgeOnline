package com.zlx.akoj;
import java.util.Scanner;


public class e1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m=cin.nextInt();
		int n=cin.nextInt();
		int[] listm=new int[m];
		int[] listn=new int [n];
		for(int i=0;i<m;i++)
			listm[i]=cin.nextInt();
		for(int i=0;i<n;i++)
			listn[i]=cin.nextInt();
		int count=0;
		int L=Math.min(m, n);
		for(int i=0;i<L;i++)
			if(listm[i]==listn[i])
				count++;
		System.out.println(count);

	}

}
