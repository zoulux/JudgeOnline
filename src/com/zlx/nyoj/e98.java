package com.zlx.nyoj;
import java.util.Scanner;


public class e98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			int M=sc.nextInt();
			if(M>=90&&M<=100)
				System.out.println("A");
			else if(M>=80&&M<90)
				System.out.println("B");
			else if(M>=70&&M<80)
				System.out.println("C");
			else if(M>=60&&M<70)
				System.out.println("D");
			else 
				System.out.println("E");
			
			}
			
			
		}

	}


