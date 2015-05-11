package com.zlx.akoj;
import java.util.Scanner;


public class e1028new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		char[] sc = str.toCharArray();
		for (int i = 0; i < sc.length; i++)
			if ((sc[i] > 'z' || sc[i] < 'a') && (sc[i] > 'Z' || sc[i] < 'A'))
				sc[i] = ' ';
		String str1="";
		for (int i = 0; i < sc.length; i++)
			str1=str1+sc[i];
	
		String[] sp=str1.split("\\s+");
		for(int i=0;i<sp.length;i++)
			System.out.println(sp[i]);

	}

}
