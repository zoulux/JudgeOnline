package com.zlx.nyoj;
import java.util.Scanner;

public class e100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N-->0){
			String M=cin.next();
			int A=Integer.parseInt(M);
			String B=Integer.toBinaryString(A);
		
			char[] array = B.toCharArray(); 
			
		
			int court=0;
			for(int i=0;i<array.length;i++)
				if(array[i]=='1')
					court++;
			System.out.println(court);
				
			
			
		}

	}

}
