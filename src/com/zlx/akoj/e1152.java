package com.zlx.akoj;
import java.util.Scanner;


public class e1152 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
		int n=cin.nextInt();
		int b=cin.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
			if(i%b==0)
				count++;
		System.out.println(count);

	}}

}
