package org.sample;

public class DuplicateValues {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };

		int b[] = new int[a.length];

		int newarraycounter = 0;

		for (int i : a) {

			System.out.println(i + "in loop");
			boolean needtoadd = true;

			for (int i1 : b) {
				if (i == i1) {
					needtoadd = false;
					break;
				}
			}

			System.out.println("Need to Add " + needtoadd);

			if (needtoadd) {
				b[newarraycounter] = i;
				newarraycounter++;
				System.out.println(i + "added");
			} else {
				System.out.println(i + "no need to add duplicate");
			}
			System.out.println();
		}
		for (int i = 0; i < newarraycounter; i++) {
			System.out.print(b[i]);
			System.out.print(",");

		}

	}
}
