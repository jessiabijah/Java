package org.sample;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		System.out.println(l);
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		l1.add(8000);
		System.out.println(l1);
		l1.removeAll(l);
		System.out.println(l1);
	}
}
