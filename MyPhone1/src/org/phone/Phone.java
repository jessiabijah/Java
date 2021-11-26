 package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("Android");
				
	}
	private void phoneInfo(int version) {
		System.out.println("version:"+version);
		

	}
	private void phoneInfo(int ramsizegb  ,int storagegb  ) {
		System.out.println("ramsize gb:"+ramsizegb  );
		System.out.println("storage gb:"+storagegb);
	}
	private void phoneInfo(String devicename,long phno) {
		System.out.println("devicename:"+devicename);
		System.out.println("phno:"+phno);

	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo();
		p.phoneInfo(10);
		p.phoneInfo(2, 32);
		p.phoneInfo("realme c11", 8300032276l);
	}
	
	

}
