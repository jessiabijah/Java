package org.sample;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" student id");
	int id=s.nextInt();
	System.out.println("student name");
	String name=s.next();	
	System.out.println("student gmail");
	String gmail=s.next();
	System.out.println("student phno");
	long phno=s.nextLong();
	System.out.println("student dept");
	String dept=s.next();
	System.out.println("student gender");
	char gender=s.next().charAt(0);
	System.out.println("student city");
	String city=s.next();

	
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("gmail:"+gmail);
System.out.println("phno:"+phno);
System.out.println("dept:"+dept);
System.out.println("gender:"+gender);
System.out.println("city:"+city);

}
}
