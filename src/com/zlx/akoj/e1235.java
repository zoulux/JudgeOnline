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
					continue;//如果相等无需进行继续往下运行
				}
				String AS = Integer.toBinaryString(A);// 将A变为二进制
				String BS = Integer.toBinaryString(B);// 将B变为二进制
				long countA = 0;// 统计A中“1”的个数
				long countB = 0;// 统计B中“1”的个数
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
//					if (AS.length() > BS.length())//按二进制字符串比较大小的
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

					 if (A > B)//按原数据进行比较大小的
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