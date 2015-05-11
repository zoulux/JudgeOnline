package com.zlx.akoj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class e1086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			BigInteger str = cin.nextBigInteger();
		
			String re = str.toString(2);
			List<Character> reArr = new ArrayList<Character>();
			for (Character character : re.toCharArray()) {
				reArr.add(character);
			}

			Collections.reverse(reArr);
			StringBuffer reString = new StringBuffer();
			for (Character character : reArr) {
				reString.append(character);
			}
			
	System.out.println(	new BigInteger(reString.toString(), 2).toString());	

		}

	}

}
