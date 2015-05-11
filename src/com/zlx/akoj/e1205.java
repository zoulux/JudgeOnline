package com.zlx.akoj;
import java.util.Scanner;
public class e1205 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String passwordm=cin.next();
			String passworda="";
			for(int i=0;i<passwordm.length();i++)
			{
				switch (passwordm.charAt(i)) {
				case 'a':
				case 'b':
				case 'c': passworda+="2";break;
				case 'd':
				case 'e':
				case 'f':passworda+="3";break;
				case 'g':
				case 'h':
				case 'i':passworda+="4";break;
				case 'j':
				case 'k':
				case 'l':passworda+="5";break;
				case 'm':
				case 'n':
				case 'o':passworda+="6";break;
				case 'p':
				case 'q':
				case 'r':
				case 's':passworda+="7";break;
				case 't':
				case 'u':
				case 'v':passworda+="8";break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':passworda+="9";break;
				
				case 'A':passworda+="b";break;
				case 'B':passworda+="c";break;
				case 'C':passworda+="d";break;
				case 'D':passworda+="e";break;
				case 'E':passworda+="f";break;
				case 'F':passworda+="g";break;
				case 'G':passworda+="h";break;
				case 'H':passworda+="i";break;
				case 'I':passworda+="j";break;
				case 'J':passworda+="k";break;
				case 'K':passworda+="l";break;
				case 'L':passworda+="m";break;
				case 'M':passworda+="n";break;
				case 'N':passworda+="o";break;
				case 'O':passworda+="p";break;
				case 'P':passworda+="q";break;
				case 'Q':passworda+="r";break;
				case 'R':passworda+="s";break;
				case 'S':passworda+="t";break;
				case 'T':passworda+="u";break;
				case 'U':passworda+="v";break;
				case 'V':passworda+="w";break;
				case 'W':passworda+="x";break;
				case 'X':passworda+="y";break;
				case 'Y':passworda+="z";break;
				case 'Z':passworda+="a";break;
				default:
					passworda+=passwordm.charAt(i);	break;
				}
			}
			System.out.println(passworda);
		}

	}

}
