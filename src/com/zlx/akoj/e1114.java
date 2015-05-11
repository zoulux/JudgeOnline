package com.zlx.akoj;
import java.util.Scanner;

public class e1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		if(a>=100&&a<999&&b>100&&b<=999)
		{	for (int i = a; i <= b; i++)
			if (issxh(i))
				System.out.println(i);}
		else if(a<100&&b>100&&b<=999)
		{	for (int i = 100; i <= b; i++)
			if (issxh(i))
				System.out.println(i);}
		else if(a>=100&&a<999&&b>999)
		{	for (int i = a; i <= 999; i++)
			if (issxh(i))
				System.out.println(i);}
		else if(a<100&&b>999)
		{	for (int i = 100; i <= 999; i++)
			if (issxh(i))
				System.out.println(i);}
	}

	private static boolean issxh(int n) {
		int a = n / 100;
		int b = (n / 10) % 10;
		int c = n % 10;
		if (a * a * a + b * b * b + c * c * c == n)
			return true;
		else
			return false;
	}
}
