package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1242 {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				String score = cin.next();
				String JD = "";
				if (f(score))
					JD = fs(score);
				else
					JD = kck(score);
				con.println(JD);
			}
		}

		cin.close();
		con.close();
	}

	private static String kck(String score) {
		if (score.equals("GS"))
			return "4.0";
		else if (score.equals("JSJ"))
			return "3.4";
		else if (score.equals("XD"))
			return "2.7";
		else if (score.equals("YY"))
			return "1.5";
		else
			return "0";

	}

	private static String fs(String score) {
		int num = Integer.valueOf(score);
		if (num >= 90 && num <= 100)
			return "4.0";
		else if (num >= 85 && num <= 89)
			return "3.6";
		else if (num >= 80 && num <= 84)
			return "3.2";
		else if (num >= 75 && num <= 79)
			return "2.8";
		else if (num >= 70 && num <= 74)
			return "2.3";
		else if (num >= 65 && num <= 69)
			return "1.8";
		else if (num >= 60 && num <= 64)
			return "1.3";
		else
			return "0";

	}

	private static boolean f(String score) {
		try {

			int num = Integer.valueOf(score);// 把字符串强制转换为数字
			return true;// 如果是数字，返回True
		} catch (Exception e) {
			return false;// 如果抛出异常，返回False
		}

	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);

}
