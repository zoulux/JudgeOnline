package com.zlx.akoj;
import java.util.Scanner;


public class e1129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		String email=cin.next();
		int p=email.indexOf("@");
		String name=email.substring(0, p);
		System.out.println(name);
		
		
			
	}

}
