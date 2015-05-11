package com.zlx.akoj;
import java.util.Scanner;

public class e1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		while (true) {
			String str = cin.nextLine();
			if(str.equals("END"))
				break;
			char[] sc = str.toCharArray();
			for (int i = 0; i < sc.length; i++) {
				if (sc[i] == 'C')
					sc[i] = 'L';
				else if (sc[i] == 'M')
					sc[i] = 'o';
				else if (sc[i] == 'S')
					sc[i] = 'v';
				else if (sc[i] == 'L')
					sc[i] = 'Y';
				else if (sc[i] == 'X')
					sc[i] = 'u';
				else if (sc[i] == 'A' || sc[i] == 'W' || sc[i] == 'F')
					sc[i] = 'I';
				else if (sc[i] == 'D' || sc[i] == 'P' || sc[i] == 'G')
					sc[i] = 'e';

			}
			for (int i = 0; i < sc.length; i++)
				System.out.print(sc[i]);
			System.out.println();


		}

	}

}
