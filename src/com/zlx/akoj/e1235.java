package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
public class e1235 {
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int T = cin.nextInt();
			while (T-- > 0) {
				int A = cin.nextInt();
				int B = cin.nextInt();
				if (A == B) {
					cout.println("=");
					continue;//������������м�����������
				}
				String AS = Integer.toBinaryString(A);// ��A��Ϊ������
				String BS = Integer.toBinaryString(B);// ��B��Ϊ������
				long countA = 0;// ͳ��A�С�1���ĸ���
				long countB = 0;// ͳ��B�С�1���ĸ���
				for (int i = 0; i < AS.length(); i++)
					if (AS.charAt(i) == '1')
						countA++;
				for (int i = 0; i < BS.length(); i++)
					if (BS.charAt(i) == '1')
						countB++;
				
				
				if (countA > countB)
					cout.println(">");
				else if (countA < countB)
					cout.println("<");
				else {
//					if (AS.length() > BS.length())//���������ַ����Ƚϴ�С��
//						cout.println(">");
//					else if (AS.length() < BS.length())
//						cout.println("<");
//					else {
//						for (int i = 0; i < AS.length(); i++) {
//							if (AS.charAt(i) > BS.charAt(i)) {
//								cout.println(">");
//								break;
//							} else (AS.charAt(i) < BS.charAt(i)) {
//								cout.println("<");
//								break;
//							}
//						}
//					}

					 if (A > B)//��ԭ���ݽ��бȽϴ�С��
					 cout.println(">");
					 else if(A<B)
					 cout.println("<");
					// else
					// cout.println("=");
				}
			}
		}
		cin.close();
		cout.close();
	}
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}