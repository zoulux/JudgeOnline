package com.zlx.nyoj;
 
 

import java.util.Scanner;
public class e112new {//高手运行的代码
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    while(scanner.hasNext())
    {
    	int x=scanner.nextInt();
    	int y=scanner.nextInt();
    	int doublex=x*x;
    	if(y==1)
    	{
    		System.out.println(x);continue;
    	}
    	long sum=1;
    	for(int i=0;i<y/2;i++)
    	{
    		sum*=doublex;
    	}
    	if(y%2==0)
    	{
    		System.out.println(sum);
    	}
    	else {
			System.out.println(sum*x);
		}
    	
    }
	}

}
                