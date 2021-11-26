package org.sample;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter emp id");
		int id=s.nextInt();
		System.out.println("enter emp name");
		String name=s.next();
		System.out.println("enter emp Email");
		String email=s.next();
		System.out.println("enter emp phonenum");
		long phonenum=s.nextLong();
		System.out.println("enter emp salary");
		double salary=s.nextDouble();
		System.out.println("enter emp gender");
		char gender=s.next().charAt(0);
		System.out.println("enter emp city");
		String city=s.next();
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("email:"+email);
		System.out.println("phonenum:"+phonenum);
		System.out.println("salary:"+salary);
		System.out.println("gender:"+gender);
		System.out.println("city:"+city);
		
		
	}

}
 