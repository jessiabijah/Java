package org.sample;

public class Data {
	public static void main(String[] args) {
		int a[] = { 105,205,305,405,505,605,705,805};
		System.out.println("normal loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			System.out.println("Enchanced loop");
			for (int i : a) {
				System.out.println(i);
			}
		}
	}


