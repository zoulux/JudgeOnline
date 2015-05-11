package com.zlx.akoj;
import java.util.Scanner;
public class e1194 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T=cin.nextInt();
		while(T-->0){
			int n=cin.nextInt();
			int A=cin.nextInt();
			int B=cin.nextInt();
			int[] stairs=new int[n];
			for(int i=1;i<n;i++)
				stairs[i]=cin.nextInt();
			int sum=0;
			if(A<=B)
			{	for(int i=A;i<B;i++)
				sum+=stairs[i];
			}
			else 
			{	for(int i=B;i<A;i++)
				sum+=stairs[i];
			}
			System.out.println(sum);
		}
	}

}
