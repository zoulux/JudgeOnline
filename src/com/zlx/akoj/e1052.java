package com.zlx.akoj;
import java.util.Scanner;


public class e1052 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           Scanner cin=new Scanner(System.in);
          int t=Integer.parseInt(cin.nextLine());
          while(t-->0){
        	  String str=cin.nextLine();
        	  int count=0;
        	  for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        			  count++;
				
			}System.out.println(count);
          }
          
	}

}
