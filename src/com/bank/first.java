package com.bank;

import java.util.Scanner;



public class first {
//	System.out.println("Customer Id : "+cusid);
//	System.out.println("Hloo  "+cusName);
	
	public static void main(String[] args){
//		System.out.println("Customer Id : "+cusid);
//		System.out.println("Hloo  "+cusName);
		System.out.println("Wellcome to KR Bank");
		System.out.println("==========================================");
		System.out.println("Menu");
		System.out.println("==========================================");
		System.out.println("1.New Account");
		System.out.println("2.Deposit");
		System.out.println("3.withdraw");
		System.out.println("4.Get Previous Transaction");
		System.out.println("5.Exit");
		Second k=new Second();
		//NewAccount NA=new NewAccount();
		int n;
		Scanner scan= new Scanner(System.in);
		

	do {
		System.out.println("==========================================");
		System.out.println("Enter the Option");
		System.out.println("==========================================");
		  n=scan.nextInt();

		
	switch (n) {
	
		case 2 :
			k.deposit();{
			}break;
		case 3 :
			k.withdraw();{
			}break;
		case 4 :
			k.GPT();{
			}break;
		case 1:{
			NewAccount NA = new NewAccount();
			NA.a();
			}break;
		case 5:{
			System.out.println("Have a Nice Day");
			};
	}
	}while(n != 5);
}
}
