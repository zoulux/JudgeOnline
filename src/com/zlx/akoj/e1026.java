package com.zlx.akoj;
import java.util.Scanner;


public class e1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
			if((i%3==0)&&(i%5==0))
				count++;
System.out.println(count);
	}

}
