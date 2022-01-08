package org.sample;

public class Data {
	public static void main(String[] args) {
		String s = "Welcome to class java";
		String s1 = "Greens Adayar";
		String s3 = "Welcome to java class";
		String s4 = "Nishakerala24@gmail.com";
		String s5 ="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
	    String r = s.replaceAll("java", "sql");
		System.out.println(r);
		String r2 = s1.replaceAll("Adayar", "Omr");
		System.out.println(r2);
		String r3=s3.replace(" " ,"#" );
		System.out.println(r3);
		boolean b =s4.contains("gmail");
		System.out.println(b);
		String r4=s4.replaceAll("gmail", "yahoo");
		System.out.println(r4);
		boolean b1 = s5.contains("pincode-626101");
		System.out.println(b1);
		String r5=s5.replaceAll("pincode-626101"," ");
		System.out.println(r5);
		



	}

}