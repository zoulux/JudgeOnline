package com.zlx.akoj;
import java.util.Scanner;
import java.util.Vector;

public class e1207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		int T = cin.nextInt();
		while (T-- > 0) {

			int A = cin.nextInt();
			int B = cin.nextInt();
			if(A==B){
				System.out.println("NO");continue;}
			int sumA = f(A);
			int sumB = f(B);
			if(sumA==B&&sumB==A)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

	private static int f(int n) {
		Vector<Integer> vec = new Vector<Integer>();
		int sum=0;
		for (int i = 1; i <n; i++)
			if (n % i == 0)
				vec.add(i);
		
		for(int i=0;i<vec.size();i++)
			sum+=vec.get(i);
		return sum;
	
	}

}
