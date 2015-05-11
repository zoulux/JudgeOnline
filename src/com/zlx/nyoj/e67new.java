package com.zlx.nyoj;
 
import java.io.BufferedInputStream;
import java.io.IOException;
import java.text.DecimalFormat;


public class e67new{

	public static BufferedInputStream bis=new BufferedInputStream(System.in);


	public static int getInt() throws IOException{

		int i;

		while((i=bis.read())<48)
			;
		// if(i==-1)
		// return -1;

		int temp=0;

		while(i>47){
			temp=temp*10+i-48;
			i=bis.read();
		}

		return temp;
	}


	public static void main(String args[]) throws IOException{

		double x0,y0,x1,y1,x2,y2;
		DecimalFormat df=new DecimalFormat("0.0");

		while((x0=getInt())!=0|(y0=getInt())!=0|(x1=getInt())!=0|(y1=getInt())!=0|(x2=getInt())!=0|(y2=getInt())!=0)
			System.out.println(df.format(Math.abs((x2-x0)*(y1-y0)-(x1-x0)*(y2-y0))/2));
	}
}        