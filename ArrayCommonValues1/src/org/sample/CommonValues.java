package org.sample;

import java.util.ArrayList;
import java.util.List;

public class CommonValues {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(60);
		l1.add(50);
		l1.add(40);
		l.add(70);
		l.add(80);
		l.add(90);
		System.out.println(l1);
		l1.retainAll(l);
		System.out.println(l1);
	}
}