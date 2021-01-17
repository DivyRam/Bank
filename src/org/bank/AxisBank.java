package org.bank;

public class AxisBank extends BankInfo{
@Override
public void deposit() {
	System.out.println("Deposit is 7%");
}
public static void main(String[] args) {
	AxisBank b= new AxisBank();
	b.saving();
	b.fixed();
	b.deposit();
}
}
