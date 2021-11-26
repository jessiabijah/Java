package org.emp;

public class Employee {
	private void empId() {
		System.out.println("id2" );
	}

	private void empId(String name) {
		System.out.println("name:" + name);

	}

	private void empId(int age) {
		System.out.println("age:" + age);

	}

	private void empId(long phno) {
		System.out.println("phno:" + phno);

	}

	private void empId(float salary) {
		System.out.println("salary:" + salary);

	}

	private void empId(char gender) {
		System.out.println("gender:"+gender);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(); 
		e.empId(23);
		e.empId("jessi");
		e.empId(20); 
		e.empId(8300032276l);
		e.empId(50000f);
		e.empId('f');
	}
}


