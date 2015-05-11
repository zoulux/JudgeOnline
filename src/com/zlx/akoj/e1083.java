package com.zlx.akoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class Person implements Comparable<Person> {
	String name;
	double mEnglish;
	double mPolitics;
	double mMath;
	double mMajor;
	double mFuTest;

	double chuShiScore;
	double mTotalScore;
	@Override
	public int compareTo(Person p) {
		if (this.mTotalScore!=p.mTotalScore) {
			
			return (int) (p.mTotalScore-this.mTotalScore);
		}
		else {
			return this.name.compareTo(p.name);
		}
		
	}
}

public class e1083 {
	static double english;
	static double politics;
	static double math;
	static double major;
	static double total;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		english = cin.nextInt();
		politics = cin.nextInt();
		math = cin.nextInt();
		major = cin.nextInt();
		total = cin.nextInt();
		Vector<Person> vector = new Vector<Person>();
		while (cin.hasNext()) {
			Person p = new Person();
			p.name = cin.next();
			p.mEnglish = cin.nextDouble();
			p.mPolitics = cin.nextDouble();
			p.mMath = cin.nextDouble();
			p.mMajor = cin.nextDouble();
			p.mFuTest = cin.nextDouble();
			p.chuShiScore = p.mEnglish + p.mMajor + p.mMath + p.mPolitics;

			p.mTotalScore = 0.6 * p.chuShiScore + 0.4 * p.mFuTest;

			if (ispass(p)) {
				vector.add(p);
			}

		}
		
		
		Collections.sort(vector);
		int i = 1;
		for (Person person : vector) {
			System.out.println(person.name + " " +String.format("%d",(int) person.chuShiScore)  + " "
					+ String.format("%d",(int) person.mFuTest)  + " " + String.format("%.1f", person.mTotalScore)  + " " + i++);
		}
	}

	private static boolean ispass(Person p) {

		if (p.mEnglish < english) {
			return false;
		}
		if (p.mPolitics < politics) {
			return false;
		}
		if (p.mMath < math) {
			return false;
		}
		if (p.mMajor < major) {
			return false;
		}

		if (p.chuShiScore < total) {
			return false;
		}

		return true;
	}

}
