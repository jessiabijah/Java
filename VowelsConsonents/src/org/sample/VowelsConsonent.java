package org.sample;

public class VowelsConsonent {
	public static void main(String[] args) {
		String st = "Welcome";
		int vowels = 0;
		int consonents = 0;
		st=st.toLowerCase();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

				vowels++;

			else if (ch >= 'a' && ch <= 'z')
				consonents++;
		}
			System.out.println("vowels:" + vowels);
			System.out.println("cosonents:" + consonents);

		}
	}
