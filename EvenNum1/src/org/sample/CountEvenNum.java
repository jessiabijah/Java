package org.sample;

public class CountEvenNum {
	public static void main(String[] args) {
		int count=1;
	
		for(int i=1; i<=100; i++) {
			if(i%2==0)
			{
				count =count++;
				
		}
	}System.out.println("count of even num from 1 to 100:"+count);
		
	}
}
