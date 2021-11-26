package org.edu;

public class Education extends Arts {
	public void ug(int years) {
		System.out.println("ug=3years");

	}

	public void pg(int years) {
		System.out.println("pg=2years");

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
		Education e = new Education();
		e.bsc();
		e.bed();
		e.bba();
		e.ug(3);
		e.pg(3);
		e.ug();
		e.pg();

	}
}
