package org.phone;

public class InternalStorage {
private void processorName() {
System.out.println("processor name=andriod");
}
private void ramSize() {
System.out.println("ram size=2gb");
}
public static void main(String[] args) {
	InternalStorage i=new InternalStorage();
	i.processorName();
	i.ramSize();
	ExternalStorage e=new ExternalStorage();
	e.size();
	
}
}
