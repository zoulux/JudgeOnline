package com.zlx.akoj;
import java.util.Scanner;

public class e1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (true) {
			int[] A = new int[3];
			int flag=0;
			for (int i = 0; i < 3; i++)
				A[i] = cin.nextInt();
			if (A[0] == -1 && A[1] == -1 && A[2] == -1)
				break;
			for (int i = 0; i < 3; i++)

			{
				if (A[i] <= 168)
					{System.out.println("CRASH" + " " + A[i]);
					flag=1;
					break;}
			
					
			}
			if(flag==0)
				System.out.println("NO CRASH");

		}
	}

}
