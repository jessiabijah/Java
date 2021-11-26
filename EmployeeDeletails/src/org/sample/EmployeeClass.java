package org.sample;

public class Employee {
private void empId() {
	System.out.println("emp id=2");

}
private void empName() {
	System.out.println("emp name=jessi");
	
}
private void empDob() {
	System.out.println("emp dob=10.0.2000");

}
private void empPhone() {
System.out.println("emp ph=1234567892");
}
private void empEmail() {
System.out.println("emp email=xys@gmail.com");

}
private void empAddress() {
System.out.println("4 main road xyz nagar");
}
public static void main(String[] args) {
	Employee emp =new Employee();
	emp.empId();
	emp.empName();
	emp.empDob();
	emp.empPhone();
	emp.empEmail();
	emp.empAddress(); 
}
}


