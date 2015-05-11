package com.zlx.nyoj;
import java.util.Scanner;

public class e74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int M = cin.nextInt();//123
		int N = cin.nextInt();
		while (M != 0 && N != 0) {
			int court=0;
			int[] array1=new int[3];
			int[] array2=new int[3];
			array1[0]=M%10;
			array1[2]=M/100;
			array1[1]=(M-array1[0]-array1[2]*100)/10;
			array2[0]=N%10;
			array2[2]=N/100;
			array2[1]=(N-array2[0]-array2[2]*100)/10;
			int a=array1[0]+array2[0];
			if(a>=10)
				court++;
			int b=a/10+array1[1]+array2[1];
			if(b>=10)
				court++;
			int c=b/10+array2[2]+array1[2];
			if(c>=10)
				court++;
			System.out.println(court);
		
				M = cin.nextInt();
					N = cin.nextInt();

		}

	}
}
