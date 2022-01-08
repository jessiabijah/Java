package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Replace {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(900);
		l.add(100);
		l.add(100);
		l.add(400);
		l.add(500);
		System.out.println(l);
		l.set(2, 350);
		System.out.println(l);
		
		//9.2
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		l1.add(10);
		System.out.println(l1);
		l1.set(7, 90);
		System.out.println(l1);
}
}
