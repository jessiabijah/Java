package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("stud name=jessi");

	}
	public void studentDept() {
		System.out.println("stud dept=CSE");

	}
	public void studentId() {
		System.out.println("stud Id=22");

	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
		
	}
	

}
