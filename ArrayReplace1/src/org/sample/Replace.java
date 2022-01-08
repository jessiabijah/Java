package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Replace {
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
		l.add(30);
		System.out.println(l);
		l.set(0,100);
		l.set(4,100);
		l.set(5,100);
		System.out.println(l);
}
}
