package com.kodnest.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtmOperation is= new AtmOperationImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Atm Num and do not forgot");
		int Atmnumber=scan.nextInt();

		int Atmpin = 123;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Atmnumber");
		int Atmnum =in.nextInt();
		System.out.println("Enter the pin");
		int Atmpn = in.nextInt();

		if((Atmnumber == Atmnum)&& (Atmpin==Atmpn)) {
			while(true) {
				System.out.println("1.view Avaliable Balnace\n2.withdraw Amount\n 3.Deposit Amount\n 4.View the miniStament\n 5.Exit");
				System.out.println("Enter Choice: ");
				int ch=in.nextInt();
				if(ch==1) {
					is.viewBalance();


				}else if(ch==2) {
					System.out.println("enter the amount withdrawal");
					int WithdrawAmount=in.nextInt();
					is.withdrawAmount(WithdrawAmount);

				}else if(ch==3) {
					System.out.println("Enter the amout Deoposit: ");
					int  depositAmounts= in.nextInt();
					is.depositAmount(depositAmounts);

				}else if(ch==4) {
					is.ministatement();

				}else if (ch==5) {
					System.out.println("Collect your Atm card\n Thankyour ");
					System.exit(0);


				}else {
					System.out.println("Incorrect Atm pin ");

				}
			}

		}
	}
}
