package com.zlx.nyoj;
import java.util.Scanner;


public class e85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		String[][] array=new String[320][] ;
		
		for(int i=1;i<320;i++)
			for(int j=1;j<320;j++)
				array[i][j]="i/j";
		int T=cin.nextInt();
		while(T-->0)
		for(int i=1;i<10;i++)
			for(int j=1;j<10;j++)
				System.out.println(array[i][j]);
	}

}
