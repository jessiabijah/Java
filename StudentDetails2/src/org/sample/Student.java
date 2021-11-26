
package org.sample;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter student id");
		int id = s.nextInt();
		System.out.println("enter student name");
		String name = s.next();
		System.out.println("enter student mark1");
		int m1 = s.nextInt();
		System.out.println("enter student mark2");
		int m2 = s.nextInt();
		System.out.println("enter student mark3");
		int m3 = s.nextInt();
		System.out.println("enter student mark4");
		int m4 = s.nextInt();
		System.out.println("enter student mark5");
		int m5 = s.nextInt();
		int total =  m1 + m2 + m3 + m4 + m5;
		System.out.println("m1+m2+m3+m4+m5");
		int avg = total / 5;
		System.out.println("avg marks");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("mark1:" + m1);
		System.out.println("mark2:" + m2);
		System.out.println("mark3:" + m3);
		System.out.println("mark4:" + m4);
		System.out.println("mark5:" + m5);
		System.out.println("m:"+total);
		System.out.println("avg m:"+avg);
		
	
}
}