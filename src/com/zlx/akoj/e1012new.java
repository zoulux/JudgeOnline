package com.zlx.akoj;
import java.util.Scanner;

public class e1012new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next();
			String s1 = "";
			for (int i = 0; i < s.length(); i++)
				switch (s.charAt(i)) {
				case '0':
					s1 = s1 + "0000";
					break;
				case '1':
					s1 = s1 + "0001";
					break;
				case '2':
					s1 = s1 + "0010";
					break;
				case '3':
					s1 = s1 + "0011";
					break;
				case '4':
					s1 = s1 + "0100";
					break;
				case '5':
					s1 = s1 + "0101";
					break;
				case '6':
					s1 = s1 + "0110";
					break;
				case '7':
					s1 = s1 + "0111";
					break;
				case '8':
					s1 = s1 + "1000";
					break;
				case '9':
					s1 = s1 + "1001";
					break;
				case 'A':
					s1 = s1 + "1010";
					break;
				case 'B':
					s1 = s1 + "1011";
					break;
				case 'C':
					s1 = s1 + "1100";
					break;
				case 'D':
					s1 = s1 + "1101";
					break;
				case 'E':
					s1 = s1 + "1110";
					break;
				case 'F':
					s1 = s1 + "1111";
					break;
				default:
					break;
				}
			System.out.println(s1);

		}

	}

}
