package org.bike;

public class ktm implements Bike {
	private void cost(double amount  ) {
		System.out.println("cost =1.89 lakhs");

	}
	private void speed(int speed ) {
		System.out.println("speed = 390");

	}
	@Override
	public void cost() {
		System.out.println("cost= 1.80 lakhs");
	}
	@Override
	public void speed() {
		System.out.println("speed =170 kmph ");
		
	}
	public static void main(String[] args) {
		ktm k = new ktm();
		k.cost(1.89);
		k.speed(390);
		k.cost();
		k.speed();
		
		
	}
	

	}

	
	


