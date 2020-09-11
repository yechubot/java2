package exam04_bank;

import java.util.Scanner;

public class BankAccountExam {
	
	static int account = 1000000;//deposit balance
	static int loanBalance = 5000000;//loan balance
	
	public static void main(String[] args) {
		int sel1, sel2;
		bankAccount ba1 = new Transaction();
		bankAccount ba2 = new Loan();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.transaction 2.loan");
		sel1 = sc.nextInt();
		System.out.println("1.deposit 2.withdraw");
		sel2 = sc.nextInt();
		
		if(sel1==1) {
			
			if(sel2==1) {
				ba1.deposit(account);
			}else {
				ba1.withdraw(account);
			}
		} else {
			
			if(sel2==1) {
				ba2.deposit(loanBalance);
			}else {
				ba2.withdraw(loanBalance);
			}
		}
		
		}

	}

