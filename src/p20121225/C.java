package p20121225;

import java.util.Scanner;

public class C {

	/**
	 * @param args
	 */
	
	static int[] F=new int[10000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while (true) {
		int N=cin.nextInt();
		if (N==0) {
			break;
		}
		System.out.println(Fib(N));
		
		
		}
	}
	public static int Fib(int i) {
	if (F[i]==0) {
		if (i==1||i==2) {
			F[i]=1;
			return F[i];
		}
		else {
			F[i]=(Fib(i-1)%10000+Fib(i-2)%10000)%10000;
			return F[i];
		}
	}else {
		return F[i];
	}
	}
}
