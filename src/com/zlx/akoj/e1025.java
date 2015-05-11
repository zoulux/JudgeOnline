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

		easy(list);// ȥ�����е�"-"

		String[] diglist = new String[n];
		for (int i = 0; i < list.length; i++)
			// ����д��ĸת��������
			diglist[i] = f(list[i]);

		Arrays.sort(diglist);// �Ƚ�������

		String L = "";// �������������ӳ�һ���ַ���
		for (int i = 0; i < list.length; i++) {
			L += diglist[i];
		}

		int[] count = new int[n];// ���ַ����в����Ƿ����������Ԫ��
		for (int i = 0; i < diglist.length; i++) {
			String t = diglist[i];
			while (L.contains(t)) {
				count[i]++;
				L = L.replaceFirst(t, " ");

			}
		}

		int flag = 0;// �����־

		f1(diglist);//������֮�����"-"

		for (int i = 0; i < n; i++)
			// ����
			if (count[i] > 1) {// count>1��Ϊ�ظ�����
				flag = 1;
				System.out.println(diglist[i] + " " + count[i]);
			}
		if (flag == 0)// ���û��������������"No duplicates."
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