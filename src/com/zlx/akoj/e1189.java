package com.zlx.akoj;
import java.util.Scanner;


public class e1189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
			String s=cin.nextLine();
			String c=cin.nextLine();
			System.out.println(s.replace(c, ""));
		}
	}

}
