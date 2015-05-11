package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;//WrongAnswer

public class e71new {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int s = cin.nextInt();
		while (s-- > 0) {
			int w = cin.nextInt();
			int n = cin.nextInt();
			int[] weight = new int[n];
			for (int i = 0; i < n; i++)
				weight[i] = cin.nextInt();
			int count = 0;
			Arrays.sort(weight);
		for(int i=0;i<weight.length;i++)
			for(int j=i+1;j<weight.length;j++)
				if(weight[j]>=w-weight[i]);
				
			
			}
			System.out.println();
		}

	
}
