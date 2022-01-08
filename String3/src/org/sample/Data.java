package org.sample;

public class Data {
    public static void main(String[] args) {
    	String s= "Welcome to class java";
		String s1="Hai i am nisha";
		String s2="Welcome to java class";
		String s3="Welcome to java class";
		String s4="Welcome to java class";
		String s5= "";
       boolean b = s.startsWith("Welcome");
       System.out.println(b);
		boolean b1 = s1.startsWith("Welcome");
		System.out.println(b1);
		boolean b2=s2.endsWith("class");
		System.out.println(b2);
		boolean b3=s3.endsWith("java");
		System.out.println(b3);
		boolean b4=s4.isEmpty();
		System.out.println(b4);
		boolean b5 =s.isEmpty();
		System.out.println(b5);
		
				
	}	
}