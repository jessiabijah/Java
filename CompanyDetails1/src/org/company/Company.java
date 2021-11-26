package org.company;
//single inheritance
import org.client.Client;

public class Company extends Client {
	public void companyName() {
System.out.println("company name=fhguu");
	}
public static void main(String[] args) {
	Company c=new Company();
	c.companyName();
	c.clientName();
}
}
 