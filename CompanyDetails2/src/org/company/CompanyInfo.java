package org.company;
//overloading

public class CompanyInfo {
	private void companyName() {
		System.out.println("comp name=gtrhy");

	}
	private void companyName(int id) {
		System.out.println("id:"+id);
		
	}
	private void companyName(String companyName,String companyadd) {
       System.out.println("companyname:"+companyName);
       System.out.println("companyadd:"+companyadd);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyName(45);
		c.companyName("gghh", "4,tambaram");

	
		
		
		
	}
	

	}
	


