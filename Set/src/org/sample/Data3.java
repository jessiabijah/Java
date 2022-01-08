package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class Data3 {
	public static void main(String[] args) {
		Set<Integer>s=new LinkedHashSet();
		s.add(105);
		s.add(205);
	    s.add(305);
		s.add(405);
		s.add(505);
		s.add(605);
		s.add(705);
		s.add(805);
		System.out.println(s);
		for (Integer I : s) {
			System.out.println(I);
		}
	}
}
