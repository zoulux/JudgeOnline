package com.zlx.akoj;
import java.util.Scanner;

public class e1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
		int cas = cin.nextInt();
		while (cas-- > 0) {
			int AB = cin.nextInt();
			int AC = cin.nextInt();
			int BC = cin.nextInt();
			int SUM = AB + AC + BC;
			if (SUM % 2 == 0) {
				int A = SUM / 2 - BC;
				int B = SUM / 2 - AC;
				int C = SUM / 2 - AB;
				if(A>=1&&B>=1&&C>=1)
				System.out.println(A + " " + B + " " + C);
				else
					System.out.println("Impossible");	
			} else
				System.out.println("Impossible");
		}

	
	}}
}
