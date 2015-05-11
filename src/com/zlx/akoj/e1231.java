package com.zlx.akoj;

import java.util.Scanner;

/**
 * 解法 多堆拈游戏有个精巧的解法： 
 * (1)将每堆石子数量用二进制表示：b1,b2,b3...bn;
 * (2)求b1,b2,b3...bn的二进制数位和ret（忽略进位),即异或值; 
 * (3)当且仅当二进制数位和中包含至少一个1时，为胜局；只包含0时，为败局。
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