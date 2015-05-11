package com.zlx.akoj;
import java.util.Scanner;


public class e1069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int N=cin.nextInt();
			int[] A=new int[N];
			for(int i=0;i<N;i++)
				A[i]=cin.nextInt();
			int sum=0;
			for(int i=0;i<N;i++)
			sum+=A[i];
			System.out.println(sum);
			
			
		}

	}

}
