package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;


public class e50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int[] apphig=new int[10];
			for(int i=0;i<10;i++)
				apphig[i]=cin.nextInt();
			int xmhig=cin.nextInt();
			Arrays.sort(apphig);
			int count=0;
			for(int i=0;i<10;i++)
				if(apphig[i]<=xmhig+30)
					count++;
			System.out.println(count);
				
			
			
			
			
			
			
			
			
			
		}

	}

}
