package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Length {
	public static void main(String[] args) {
		List <Integer> l =new ArrayList<>();
		int a[] = {10,20,30,90,10,10,40,50};
		
		int l1=a.length;
		System.out.println(l1);
		int b [] = {100,200,300,400,500,600,700};
		int l2=b.length;
		System.out.println(l2);
		int c [] = {105,205,305,405,505,605,705,805};
		int l3 =c.length;
		System.out.println(l3);
		List <Integer> l4 =new ArrayList<>();
		l4.add(100);
		l4.add(200);
		l4.add(300);
		l4.add(400);
		l4.add(500);
		l4.add(600);
		l4.add(700);
		 int size = l4.size();
		 System.out.println(size);
		
}

}
