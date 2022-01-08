package org.sample;

public class LowerUpperCaseCount {
	

	public static void main(String[] args) {
		String st= "WelComeToJava";
		int lower=0; int upper=0;
		
		for (int i = 0; i < st.length(); i++)
		{
			 char ch=st.charAt(i);
		
			if(ch>='A' && ch<='Z') 
				upper++;
			else if (ch>='a'&& ch<='z')
				lower++;
		}
				
			System.out.println("uppercase:"+upper);
			System.out.println("lowercase:"+lower);
		}
			
		}

	


