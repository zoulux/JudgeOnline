package com.zlx.akoj;
import java.util.Scanner;
public class e1203 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			String str=cin.next();
			if(str.equals(0+""))
				break;
			int sum=0;
			for(int i=0;i<str.length();i++)
				sum+=(str.charAt(i)-'0');
		System.out.println(sum);
			
			
		}

	}

}
