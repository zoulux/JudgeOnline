package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;


public class e1201 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t=cin.nextInt();
		while(t-->0){
			int n=cin.nextInt();
			int count[]=new int[n];
			String str="";
			for(int i=0;i<n;i++)
				str+=cin.next();
			System.out.println(str);
			for(int i=0;i<n;i++)
			{	if((str.charAt(i)+"").equals(""))
				continue;
				count[i]=f(str.charAt(i)+"",str);
			str=str.replace(str.charAt(i)+"", "");
			}
			Arrays.sort(count);
			System.out.println(count[count.length-1]);
		}
	}

	private static int f(String s, String str) {
		int t=0;
		int count=0;
		while(str.indexOf(s, t)!=-1)
		{
			t=str.indexOf(s, t)+1;
			count++;
		}
		return count;
		
	}

}
