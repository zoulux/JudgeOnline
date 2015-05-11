package com.zlx.akoj;
import java.util.Scanner;

public class e1151 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int sum=0;
			if (n == 0)
				break;
			int[] flag = new int[3];
		//判断十进制
			{
				int a = n / 1000;
				int b = (n / 100) % 10;
				int c = (n / 10) % 10;
				int d = n % 10;
				sum=a+b+c+d;
			}
			//判断十六进制
			{
				String str=Integer.toString(n, 16);
				int sum1=0;
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='a')
						sum1+=10;
					else if(str.charAt(i)=='b')
						sum1+=11;
					else if(str.charAt(i)=='c')
						sum1+=12;
					else if(str.charAt(i)=='d')
						sum1+=13;
					else if(str.charAt(i)=='e')
						sum1+=14;
					else if(str.charAt(i)=='f')
						sum1+=15;
					else
						sum1+=(str.charAt(i)-'0');
				}
				if(sum1!=sum)
				{	System.out.println(String.format("%d is not a Sky Number.", n));
				continue;}
			}
			//判断十二进制
			{

				String str=Integer.toString(n, 12);
				int sum2=0;
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='a')
						sum2+=10;
					else if(str.charAt(i)=='b')
						sum2+=11;
					else
						sum2+=(str.charAt(i)-'0');
				}
				if(sum2!=sum)
				{	System.out.println(String.format("%d is not a Sky Number.", n));
				continue;}
			}
			System.out.println(String.format("%d is a Sky Number.", n));

		}

	}

}
