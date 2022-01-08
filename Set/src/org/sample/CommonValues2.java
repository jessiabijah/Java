package org.sample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonValues2 {
	public static void main(String[] args) {
		Set<Integer>s=new TreeSet();
	       s.add(10);
			s.add(20);
		    s.add(30);
			s.add(40);
			s.add(50);
			s.add(60);
			s.add(70);
			s.add(80);
			System.out.println(s);
			Set <Integer>s1=new TreeSet();
			s1.add(100);
			s1.add(200);
			s1.add(300);
			s1.add(400);
			s1.add(500);
			s1.add(600);
			s1.add(700);
			s1.add(8000);
			System.out.println(s1);
			s1.retainAll(s);
			System.out.println(s1);
	}
	}
