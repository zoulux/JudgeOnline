package com.zlx.nyoj;
import java.util.Scanner;


public class e23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while(n-->0){
			int N = cin.nextInt();
			int M = cin.nextInt();
			if(N%M==0)
				System.out.println("Lose");
			else
			System.out.println("Win");
			
			
		}
		
	}

}
