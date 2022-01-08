package org.sample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAll1 {
	public static void main(String[] args) {
		Set<Integer>s=new LinkedHashSet();
		    s.add(10);
			s.add(20);
		    s.add(30);
			s.add(90);
			s.add(10);
			s.add(10);
			s.add(40);
			s.add(50);
			System.out.println(s);
			Set <Integer>s1=new LinkedHashSet();
			    s1.add(10);
				s1.add(20);
			    s1.add(60);
				s1.add(50);
				s1.add(40);
				s1.add(70);
				s1.add(80);
				s1.add(90);
			System.out.println(s1);
			s1.removeAll(s);
			System.out.println(s1);
	}


}
