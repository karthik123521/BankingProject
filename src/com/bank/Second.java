package com.bank;

import java.util.Scanner;

public class Second {
	int amount;
	int withdraw2;
	int balance=10000;
	int demo;
	int get_pre_data;
	
	public void deposit() {
		System.out.println("Enter The Amount to Deposit : ");
		Scanner scan= new Scanner(System.in);
		amount=scan.nextInt();
		if (amount < 1000) {
			System.out.println(" Amount can't be Deposited, Amount must be more than 1000 INR.");
		}
		if (amount>=1000 && amount<=100000) {
			balance=balance+amount;
			demo=amount;
			System.out.println(amount+" Deposited Successfully");
			System.out.println("Your current Balance = "+ balance);
		}
		if (amount>100000) {
			System.out.println("Limit exceed");
		}
	}

	public void GPT() {
	get_pre_data=demo;
		System.out.println("Previous Transaction : "+get_pre_data);	
	}
	public void withdraw() {
		System.out.println("Enter The Amount to Withdrawn : ");
		Scanner scan= new Scanner(System.in);
		withdraw2=scan.nextInt();
		if (withdraw2 < 500) {
			System.out.println("Min withdrawn must be morethan 500");
		}
		if (withdraw2<=balance) {
			balance=balance-withdraw2;
			demo=withdraw2;
			System.out.println(withdraw2+" Successfully Withdrawn ");
			System.out.println("Your current Balance = "+ balance);
		}
		if (withdraw2>balance) {
			System.out.println("Low Balance");
		}
	}
	}