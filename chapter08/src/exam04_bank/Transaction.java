package exam04_bank;

import java.util.Scanner;

public class Transaction implements bankAccount {
	Scanner sc = new Scanner(System.in);
	int money;
	
	@Override
	public void deposit(int account) {
		System.out.println("deposit amount?");
		money = sc.nextInt();
		account += money;
		System.out.println("your balance is"+account);
		
	}

	@Override
	public void withdraw(int account) {
		System.out.println("withdrawl amount?");
		money = sc.nextInt();
		account -= money;
		System.out.println("your balance is"+account);
		
		
	}

}
