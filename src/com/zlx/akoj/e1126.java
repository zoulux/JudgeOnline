package com.zlx.akoj;
import java.util.Scanner;


public class e1126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int A=cin.nextInt();
		int B=cin.nextInt();
		
		int a1=A/10;//ʮλ��
		int b1=B/10;
		
		int a2=A%10;//��λ��
		int b2=B%10;
		
		int s1=(a1+b1)%10;//ʮλ��
		int s2=(a2+b2)%10;//��λ��
		
		int s=s1*10+s2;
		System.out.println(s);

	}

}
