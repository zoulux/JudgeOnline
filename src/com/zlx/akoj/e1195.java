package com.zlx.akoj;
import java.util.Scanner;


public class e1195 {

	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
	class Date{
		int year;
		int mon;
		int day;
	}

	int T=cin.nextInt();
Date[] date=new Date[T];
for(int i=0;i<T;i++)
{date[i]=new Date();
	date[i].year=cin.nextInt();
	date[i].mon=cin.nextInt();
	date[i].day=cin.nextInt();
}
for(int i=0;i<T;i++)
{if((date[i].year<2014)||(date[i].year==2014&&date[i].mon<4)||(date[i].year==2014&&date[i].mon==4&&date[i].day<20))
	System.out.println("before");
else if((date[i].year==2014&&date[i].mon==4&&date[i].day==20))
	System.out.println("nice day");
else
	System.out.println("after");
}
}
	}
}
