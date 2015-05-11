package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1025 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		String[] list = new String[n];
		for (int i = 0; i < n; i++)
			list[i] = cin.next();

		easy(list);// 去掉其中的"-"

		String[] diglist = new String[n];
		for (int i = 0; i < list.length; i++)
			// 将大写字母转化成数字
			diglist[i] = f(list[i]);

		Arrays.sort(diglist);// 先将其排序

		String L = "";// 将所有数据连接成一个字符串
		for (int i = 0; i < list.length; i++) {
			L += diglist[i];
		}

		int[] count = new int[n];// 在字符串中查找是否包含数组中元素
		for (int i = 0; i < diglist.length; i++) {
			String t = diglist[i];
			while (L.contains(t)) {
				count[i]++;
				L = L.replaceFirst(t, " ");

			}
		}

		int flag = 0;// 定义标志

		f1(diglist);//在数字之间加入"-"

		for (int i = 0; i < n; i++)
			// 遍历
			if (count[i] > 1) {// count>1即为重复出现
				flag = 1;
				System.out.println(diglist[i] + " " + count[i]);
			}
		if (flag == 0)// 如果没有数据输出，输出"No duplicates."
			System.out.println("No duplicates.");
	}

	private static void f1(String[] str) {
		for (int i = 0; i < str.length; i++) {
			char sc[] = str[i].toCharArray();
			str[i] =""+ sc[0] + sc[1] + sc[2] + "-" + sc[3] + sc[4] + sc[5]
					+ sc[6];
		}

	}

	private static void easy(String[] list) {
		for (int i = 0; i < list.length; i++)
			list[i] = list[i].replace("-", "");
	}

	private static String f(String str) {
		char[] sc = str.toCharArray();
		for (int i = 0; i < sc.length; i++)
			switch (sc[i]) {
			case 'A':
			case 'B':
			case 'C':
				sc[i] = '2';
				break;
			case 'D':
			case 'E':
			case 'F':
				sc[i] = '3';
				break;
			case 'G':
			case 'H':
			case 'I':
				sc[i] = '4';
				break;
			case 'J':
			case 'K':
			case 'L':
				sc[i] = '5';
				break;
			case 'M':
			case 'N':
			case 'O':
				sc[i] = '6';
				break;
			case 'P':
			case 'R':
			case 'S':
				sc[i] = '7';
				break;
			case 'T':
			case 'U':
			case 'V':
				sc[i] = '8';
				break;
			case 'W':
			case 'X':
			case 'Y':
				sc[i] = '9';
				break;
			default:
				break;
			}
		String str1 = "";
		for (int i = 0; i < sc.length; i++)
			str1 += sc[i];
		return str1;

	}
}