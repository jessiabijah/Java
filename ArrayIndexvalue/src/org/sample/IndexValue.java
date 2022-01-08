package org.sample;

import java.util.ArrayList;
import java.util.List;

public class IndexValue {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		int a = l.indexOf(10);
		System.out.println(a);
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		int b=l1.lastIndexOf(10);
		System.out.println(b);
		int c=l1.indexOf(50);
		System.out.println(c);
		
	}
}
