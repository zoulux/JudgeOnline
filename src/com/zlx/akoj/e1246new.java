package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class e1246new {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			if(N==0)
				break;
			while (N-- > 0) {
				while(cin.hasNextLine()){
				String strcopy = "";
				String str=cin.next();
				for (int i = 0; i < str.length(); i++)
					if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
							|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
						strcopy += str.charAt(i);
					else
						strcopy += " ";
//				System.out.println(strcopy);
				String[] strarr = strcopy.split("\\s+");
				con.println(Arrays.toString(strarr));

				}}

		}

		cin.close();
		con.close();

	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);
}
