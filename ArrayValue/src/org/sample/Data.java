package org.sample;

import java.util.ArrayList;
import java.util.List;
public class Data {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		Integer a = l.get(2);
		System.out.println("2nd position value:" + a);
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		Integer b = l1.get(4);
		System.out.println("4th position value:" + b);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(105);
		l2.add(205);
		l2.add(305);
		l2.add(405);
		l2.add(505);
		l2.add(605);
		l2.add(705);
		l2.add(805);
		Integer c = l2.get(8);
		System.out.println("8th postion value:" + c);
	}
}
