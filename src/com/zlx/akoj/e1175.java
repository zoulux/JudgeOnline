package com.zlx.akoj;
import java.util.Scanner;


public class e1175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while(n-->0){
			String str=cin.next();
			int count=0;
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)>='a'&&str.charAt(i)<='z')
					count++;
			System.out.println((char)('a'+count-1));
			
		}

	}

}
