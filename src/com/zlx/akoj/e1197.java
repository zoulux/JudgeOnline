package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;
public class e1197 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int[] card=new int[4];
			for(int i=0;i<4;i++)
				card[i]=cin.nextInt();
			Arrays.sort(card);
			if(card[0]+card[1]+card[2]<=13)
				System.out.println("good luck");
			else
				System.out.println("oh no");

		}
	}

}
