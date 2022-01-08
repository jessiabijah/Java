package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		
	List<Integer> l2 = new ArrayList<Integer>();
	l2.add(10);
	l2.add(20);
	l2.add(30);
	l2.add(90);
	l2.add(10);
	l2.add(10);
	l2.add(40);
	System.out.println(l2);
	l2.remove(l2.contains(10));
	System.out.println(l2);
}
}
