package exam04_bank;

import java.util.Scanner;

public class Loan implements bankAccount{
	Scanner sc = new Scanner(System.in);
	int money;
	
	@Override
	public void deposit(int account) {
		System.out.println("amount for repayment:");
		money = sc.nextInt();
		account -= money;
		System.out.println("balance:"+account);
		
	}

	@Override
	public void withdraw(int account) {
		System.out.println("amount for loan:");
		money = sc.nextInt();
		account += money;
		System.out.println("balance:"+account);
		
	}

}
