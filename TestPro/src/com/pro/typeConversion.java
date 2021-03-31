package com.pro;

public class typeConversion {
public static void main(String args[])
{
	System.out.println("Long to Integer:");
	long l=500;
	int i=(int)l;
	System.out.println(i);
	
	System.out.println("Double to Integer:");
	double d=3572.58;
	int i1=(int)d;
	System.out.println(i1);
	
	System.out.println("Integer to Double:");
	int n=540;
	double d1=Double.valueOf(n);
	System.out.println(d1);
	
	System.out.println("Boolean to String:");
	System.out.println("Using toString method:");
	boolean b1=true;
	boolean b2=false;
	String s1=Boolean.toString(b1);
	String s2=Boolean.toString(b2);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println("Using valueOf method:");
	String s3=String.valueOf(b1);
	String s4=String.valueOf(b2);	
	System.out.println(s3);
	System.out.println(s4);
}
}
