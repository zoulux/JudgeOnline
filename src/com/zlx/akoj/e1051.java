package com.zlx.akoj;
import java.util.Scanner;

public class e1051 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String sentence = cin.nextLine();
			String[] word = sentence.split(" ");
		
	
			 for (int i = 0; i < word.length; i++) {
			 char fir = word[i].charAt(0);
			 String Fir = fir + "";
			 if (fir >= 'a' && fir <= 'z')
			word[i]= word[i].replaceFirst(Fir, Fir.toUpperCase());//����д���ã���ʱ�벻���õķ���
			 }
			for (String t : word)
				System.out.print(t + " ");
		System.out.println();

		}
	}

}
