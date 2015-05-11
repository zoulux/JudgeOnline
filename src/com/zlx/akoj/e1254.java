package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;


public class e1254 {

	public static void main(String[] args) {
while(cin.hasNext()){
	String str=cin.nextLine();
	String[] res=str.split("\\s+");
	for(int i=res.length-1;i>=0;i--){
		cout.print(res[i]);
		if(i==0)
			continue;
		cout.print(" ");
		}
	cout.println();
	
}
		cin.close();
		cout.close();
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

}
