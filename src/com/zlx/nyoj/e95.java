package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;


public class e95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		while(n-->0){
			int m=cin.nextInt();
			int[] array=new int[m];
			for(int i=0;i<m;i++)
				array[i]=cin.nextInt();
			Arrays.sort(array);
			for(int j=0;j<m;j++)
				if(array[j]==array[j+1]);
					
			
			
		}

	}

}
