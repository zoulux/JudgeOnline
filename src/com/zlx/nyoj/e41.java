package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;


public class e41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int[] array={a,b,c};
		Arrays.sort(array);
		System.out.println();
		for(int i:array){
			System.out.print(i+" ");
		}

			
			

	}

}
