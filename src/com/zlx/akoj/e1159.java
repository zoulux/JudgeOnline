package com.zlx.akoj;
import java.util.Scanner;


public class e1159 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String mingwen=cin.next();
			String anwen="";
			for(int i=0;i<mingwen.length();i++)
			{
				switch (mingwen.charAt(i)) {
				case 'a':
				case 'b':
				case 'c': anwen+="2";break;
				case 'd':
				case 'e':
				case 'f': anwen+="3";break;
				case 'g':
				case 'h':
				case 'i': anwen+="4";break;
				case 'j':
				case 'k':
				case 'l': anwen+="5";break;
				case 'm':
				case 'n':
				case 'o': anwen+="6";break;
				case 'p':
				case 'q':
				case 'r': 
				case 's': anwen+="7";break;
				case 't':
				case 'u': 
				case 'v':anwen+="8";break;
				case 'w':
				case 'x':
				case 'y':
				case 'z': anwen+="9";break;
				default:
					break;
				}
			}
			System.out.println(anwen);
			
		}
	}

}
