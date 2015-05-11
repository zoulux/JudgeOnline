package com.zlx.akoj;
import java.util.Scanner;


public class e1190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
			int n=cin.nextInt();
			int[] list=new int[n];
			for(int i=0;i<n;i++)
			list[i]=cin.nextInt();
			int x=cin.nextInt();
			int flag=0;
			for(int i=0;i<n;i++)
				if(x==list[i]){
					System.out.println(i);
					flag = 1;
					break;
				}
			if(flag==0)
				System.out.println("-1");
		}
	}

}
