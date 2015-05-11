package com.zlx.akoj;
import java.util.Scanner;
public class e1050 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=Integer.parseInt(cin.nextLine());
		while (n-->0) {
			String data=cin.nextLine();
		
			if (isHeFa(data)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

	private static boolean isHeFa(String data) {
		char first=data.charAt(0);
		if (Character.isJavaIdentifierStart(first)&&(!data.contains(" "))) {
			return true;
		}
		return false;
	}
}
