package org.univ;

public class College extends University {
	private void ug(int years) {
		System.out.println("ug = 3 years");
	}

	private void pg(int years) {
		System.out.println("pg = 3 years");

	}

	@Override
	public void ug() {
		System.out.println("ug = physics");
	}

	@Override
	public void pg() {
		System.out.println("pg = physics");
	}

	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();
		c.ug(3);
		c.pg(3);
	}
}
