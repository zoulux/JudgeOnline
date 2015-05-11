package com.zlx.akoj;
import java.util.Scanner;


public class e1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n=cin.nextInt();
			if(n==1)
				System.out.println("1 frog have 1 mouth, 2 eyes and 4 legs, plop dives into the water.");
			else{
			System.out.printf("%d frogs has %d mouths, %d eyes and %d legs, ",n,n,2*n,4*n);
			for(int i=0;i<n;i++)
			System.out.print("plop ");
			System.out.print("dives into the water.");
			System.out.println();}

		}
	}

}
