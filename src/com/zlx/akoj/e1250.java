package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;


public class e1250 {

	public static void main(String[] args) {
		while(cin.hasNext()){
			int n=cin.nextInt();
			while(n-->0){
				String IP=cin.next();
				String number="((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
				String regex="("+number+"\\.){3}"+number;//注：教材这样写的
				boolean match=IP.matches(regex);
				if(match)
					cout.println("Yes!");
				else
					cout.println("No!");
				
				
			}
			
		
		}
		cin.close();cout.close();
	}
static Scanner cin=new Scanner(System.in);
static PrintWriter cout=new PrintWriter(System.out);
}
