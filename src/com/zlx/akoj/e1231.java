package com.zlx.akoj;

import java.util.Scanner;

/**
 * �ⷨ �������Ϸ�и����ɵĽⷨ�� 
 * (1)��ÿ��ʯ�������ö����Ʊ�ʾ��b1,b2,b3...bn;
 * (2)��b1,b2,b3...bn�Ķ�������λ��ret�����Խ�λ),�����ֵ; 
 * (3)���ҽ�����������λ���а�������һ��1ʱ��Ϊʤ�֣�ֻ����0ʱ��Ϊ�ܾ֡�
 * */
public class e1231 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = 0;
			for (int i = 0; i < 3; i++) {
				t ^= cin.nextInt();
			}
			if (t != 0) {
				System.out.println("fat");
			} else {
				System.out.println("thin");
			}
		}
	}
}