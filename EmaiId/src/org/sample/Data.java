package org.sample;

public class Data {
	public static void main(String[] args) {
		String s = "velmurugank451@gmail.com";
		boolean b = s.contains(s);
		System.out.println("valid emailId");
		String s1 = "5-35-2a,venkatesh nivas,Aruppukottai";
		boolean b1 = s1.contains("pincode");
		System.out.println("Invalid Address");
		String s2 = "Nishakerala24@gmail.com";
		boolean b2 = s2.contains("@");
		System.out.println(b2);
		String s3 = "90954a6o78";
		boolean b3 = s3.contains(s3);
		System.out.println(b3);
		if(s3.contains(s3))
		{
			System.out.println("invalid number");
		}
		else{
			System.out.println("valid number");
		}
	}
}
