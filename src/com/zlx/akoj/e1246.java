package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class e1246 {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N =Integer.parseInt(cin.nextLine()) ;
			if(N==0)
				break;
			while (N-- > 0) {
				String str = cin.nextLine();
				String strcopy = "";
				for (int i = 0; i < str.length(); i++)
					if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
							|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
						strcopy += str.charAt(i);
					else
						strcopy += " ";
				String[] strarr = strcopy.trim().split("\\s+");
for(int i=0;i<strarr.length;i++)
	strarr[i]=strarr[i].substring(0, 1).toUpperCase()+strarr[i].substring(1);
for(int i=0;i<strarr.length;i++)
	{System.out.print(strarr[i]);
	if(i==strarr.length-1)
		System.out.print(".");
	else
		System.out.print(" ");
	}
System.out.println();
			}

		}

		cin.close();
		con.close();

	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);
}
