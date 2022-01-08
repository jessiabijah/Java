package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(10);
		l3.add(20);
		l3.add(30);
		l3.add(90);
		l3.add(10);
		l3.add(10);
		l3.add(40);
		System.out.println(l3);
		l3.remove(5);
		System.out.println(l3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(90);
		l2.add(10);
		l2.add(10);
		l2.add(40);
		System.out.println(l2);
		l2.remove(10);
		System.out.println(l2);
	
	}
	
}

		
		


