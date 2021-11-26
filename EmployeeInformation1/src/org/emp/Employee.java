package org.emp;

public class Employee {
private void empName() {
System.out.println("emp name=jessi");
}
private void companyName() {
System.out.println("company name=greens technology");
}
private void clientName() {
System.out.println("client name=sharmi");
}
private void projectName() {
System.out.println("project name=hostel management");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empName();
	Company c=new Company();
	c.companyName();
	Client c1=new Client();
	c1.clientName();
	Project p=new Project();
	p.projectName();
}	
}

