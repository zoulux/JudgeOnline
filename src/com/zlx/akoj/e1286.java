package com.zlx.akoj;
import java.util.Scanner;


public class e1286 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cinScanner=new Scanner(System.in);
		
		while(cinScanner.hasNext()){
			String string=cinScanner.nextLine();
			string=string.replace('a', 'A');
			string=string.replace('i', 'I');
			string=	string.replace('u', 'U');
			string=	string.replace('e', 'E');
			string=	string.replace('o', 'O');
			System.out.println(string);
			
		}

	}

}
