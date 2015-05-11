package com.zlx.akoj;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static PrintWriter cout = new PrintWriter(new BufferedOutputStream(
			System.out));
	static int sum = 0;

	public static void main(String[] args)
	{
		for (; cin.hasNext() && solve();)
			;
		cout.println(sum);
		cin.close();
		cout.close();
	}

	private static boolean solve()
	{
		String string = cin.nextLine();
		if (string.indexOf("4") == -1)
		{
			if (string.replaceAll("6", "").replaceAll("8", "").length() < 7)
			{
				cout.println(string);
				sum++;
			}
		}

		return true;
	}

}