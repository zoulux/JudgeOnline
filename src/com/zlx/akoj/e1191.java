package com.zlx.akoj;

import java.util.Scanner;

public class e1191 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int a=cin.nextInt();
		int b=cin.nextInt();
		
		int count=0;
		for (int i = a; i <=b; i++) {
			count+=f(i);
		}
		System.out.println(count);
		
	}
}

private static int f(int i) {
	
	int times=0;
	while (i!=2) {
		i/=2;
		times++;
		if (i==0) 
			i+=2;
	}
	return times;
}

}
