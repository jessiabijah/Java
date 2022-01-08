package org.sample;

public class CountString {
	public static void main(String[] args) {
		
			String s =  "Welcome To Java class @123";
			int capscount = 0; 	int smallcount = 0;
			int numcount = 0; int specialchar = 0;
		
			for (int i = 0; i < s.length(); i++) {
				char ch =s.charAt(i);
				if (ch >= 'A' && ch <= 'Z')
					capscount++;

				else if (ch >= 'a' && ch <= 'z')
					smallcount++;

				else if (ch >= '0' && ch <= '9')
					numcount++;

				else
					specialchar++;

			}
			System.out.println("capscount:" + capscount);
			System.out.println("smallcount:" + smallcount);
			System.out.println("numcount:" + numcount);
			System.out.println("specialchar:" + specialchar);
		}
	}
