package org.data;

import java.util.Scanner;

public class Trial {
	public static void main(String[] args) {
		int a[]= {6,8,9,23};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					temp=a[j];
				}
				
		}
		}
		
			System.out.println("second largest:"+a[0]);
		}
	}
