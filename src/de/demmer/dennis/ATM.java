//Hallo Welt

package de.demmer.dennis;

//Das ist eine neue Version

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ATM {
	int accountBalance = 100;

	Bankkonto[] accounts;

	public ATM() {
		accounts = new Bankkonto[10];

		System.out.println("ATM wird gestartet...");
		Bankkonto b1 = new Bankkonto(100, "Dennis", 12345);
		Bankkonto b2 = new Bankkonto(250, "Max Mustermann", 56789);

		// 0 	1 		2		3 		4 	5 	6 			7
		// b1 | null | null | null | b2 | null | null | null |
		accounts[0] = b1;
		accounts[4] = b2;

	}

	/**
	 * Main command loop of the ATM Asks the user to enter a number, and passes this
	 * number to the function cashout(...) which actually does the calculation and
	 * produces money. If the user enters anything else than an integer number, the
	 * loop breaks and the program exists
	 */
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		Scanner sc = new Scanner(System.in);
//		sc.next();

		while (true) {
			try {
				System.out.print("Enter your account number: ");
				int iban = Integer.parseInt(br.readLine());

				System.out.print("Enter the amount to withdraw: ");
				int amount = Integer.parseInt(br.readLine());
				cashout(amount, iban);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public void cashout(int amount, int iban) {

		Bankkonto b = getBankkontoByIban(iban);
		
		if(b == null) {
			System.out.println("Account with iban "+   iban + " not found");
			return;
		}
		
		if(b.guthaben < amount) {
			System.out.println("Sorry, you don't have enough money in the bank.");
			return;
		}

		
		if (amount < accountBalance) {
			accountBalance = accountBalance - amount;
			b.guthaben = b.guthaben - amount;
			System.out.println("Ok, here is your money, enjoy!");
		} else {
			System.out.println("Sorry, not enough money in the bank.");
		}

	}

	
	
	private Bankkonto getBankkontoByIban(int iban) {
		
		for (Bankkonto bankkonto : accounts) {
			if(bankkonto != null) {
				if(bankkonto.iban == iban) {
					return bankkonto;
				}
			}
		}
		
		return null;
	};

}
