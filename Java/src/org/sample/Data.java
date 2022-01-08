package org.sample;

public class Data {
	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };

		int b[] = new int[a.length];

		int countervalue = 0;

		for (int i = 0; i < a.length - 1; i++) {

			boolean needtoadd = true;

			for (int j = 0; j < b.length - 1; j++) {

				if (a[i] == b[j]) {
					needtoadd = false;
					break;
				}

			}

			if (needtoadd) {
				b[countervalue] = a[i];
				countervalue++;
			}
		}
		for (int k = 0; k < countervalue; k++) {
			System.out.println(b[k]);
		}
	}

}
