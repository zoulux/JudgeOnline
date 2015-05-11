package com.zlx.akoj;
import java.util.Scanner;


public class e1239 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cinScanner=new Scanner(System.in);
		while(true){
			int a=cinScanner.nextInt();
			int b=cinScanner.nextInt();
			int c=cinScanner.nextInt();
			int d=cinScanner.nextInt();
			if (a==0&&b==0&&c==0&&d==0) {
				break;
			}
			
			if (a==b&&b==c&&c==d) {
				System.out.println(1);
			}
			if (a>b) {
				System.out.println(2);
			}
			if (b>c) {
				
				System.out.println(3);
			}
			if (c>d) {
				System.out.println(4);
			}
		}
		
		
		
		
		
	}

}
