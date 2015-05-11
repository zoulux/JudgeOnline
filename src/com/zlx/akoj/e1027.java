package com.zlx.akoj;
import java.util.Scanner;


public class e1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String n=cin.nextLine();
		
		int[] a=new int[n.length()];
		for(int i=0;i<n.length();i++)
			a[i]=Integer.parseInt(String.valueOf(n.charAt(i)));
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		if((Integer.parseInt(n))%sum==0)
			System.out.println("Lucky Word");
		else
			System.out.println("No Answer");
		

	}

}
