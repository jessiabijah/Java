package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("saving = 5000");
	}
	public void fixed() {
		System.out.println("fixed =4000");
	}
	public void deposit(int amount) {
		System.out.println("deposit = 6000");
	}
	@Override
	public void deposit() {
		System.out.println("deposit = 9000");
	}	
		public static void main(String[] args) {
			BankInfo b = new BankInfo();
			b.saving();
			b.fixed();
			b.deposit(6000);
			b.deposit();
		}
	       
	        }


