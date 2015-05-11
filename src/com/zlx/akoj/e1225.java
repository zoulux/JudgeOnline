package com.zlx.akoj;
import java.util.Scanner;


public class e1225 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str=cin.next();
			if(str.equals("Rocks"))
				System.out.println("Papers");
			else if(str.equals("Scissors"))
				System.out.println("Rocks");
			else
				System.out.println("Scissors");

			
		}

	}

}
