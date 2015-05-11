package com.zlx.akoj;
import java.util.Scanner;

public class e1186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			if (m == 0 && n == 0)
				break;
			
				int a1 = m / 100;
				int a2 = (m / 10) % 10;
				int a3 = m % 10;
		
				int b1 = n / 100;
				int b2 = (n / 10) % 10;
				int b3 = n % 10;
			
				int count=0;
			if(a3+b3>=10)
				count++;
			if(b2+a2+(a3+b3)/10>=10)
				count++;
			if(a1+a2+(b2+a2+(a3+b3)/10)/10>=10)
				count++;
			System.out.println(count);

		}

	}

}
