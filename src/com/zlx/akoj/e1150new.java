package com.zlx.akoj;
import java.util.Scanner;


public class e1150new {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		long  T,n,p,i,b,t,a,sum;  // ������long long
	T=cin.nextLong();
	    while(T-->0)
	    {
	    	n=cin.nextLong();
	    	p=cin.nextLong();
	        if(n==0)     // md���ӵ�����Ŀ����n�Ǵ���0��
	        {            //    ��û��������������ǲ�ͨ��!!!
	           System.out.println("0");
	            continue;
	        }
	        sum=1;
	        for(i=2;i<=n;i++)
	        {
	            a=i;
	            b=p;
	            t=1;
	            while(b!=0)
	            {
	                if((b&1)!=0)
	                    t=(t*a)%n;
	                a=(a*a)%n;
	                b=b/2;
	            }
	            sum=(sum+t)%n;
	        }
	     System.out.println(sum);
	    }

	}

}
