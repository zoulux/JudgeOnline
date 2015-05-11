package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;


public class e1128 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int[] array=new int[10];
		for(int i=0;i<10;i++)
			array[i]=cin.nextInt();
		Arrays.sort(array);
		for(int t:array)
			System.out.print(t+" ");
	}

}
