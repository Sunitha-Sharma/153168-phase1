package com.cg.mypaymentapp.pl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;
import com.cg.mypaymentapp.service.WalletServiceImpl;

public class Client {
	
	public static void main(String[] args) {
		
		WalletService service;
		{
			service=new WalletServiceImpl();
		}
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Wallet");
			System.out.println("1. createAccount \n 2. showBalance \n 3. fundTransfer \n 4. depositAmount \n 5. withdrawAmount ");
			
			System.out.println(" \n Enter the choice \n");
			int ch= sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter your Name :");
				String name=sc.next();
				System.out.println("Enter your Phone Number :");
				String mobileno=sc.next();
				System.out.println("Enter the Amount");
				BigDecimal amount= sc.nextBigDecimal();
				Customer customer= service.createAccount(name, mobileno, amount);
				System.out.println(customer);
				break;
				
			case 2:
				System.out.println("Enter your phone number");
				String mobileno1=sc.next();
				customer=service.showBalance(mobileno1);
				System.out.println(customer);
				break;
				
			case 3:
				System.out.println("Enter source Mobile Number");
				String sourceMobileNo=sc.next();
				System.out.println("Enter target Mobile Number");
				String targetMobileNo=sc.next();
				System.out.println("Enter the amount to be transfered");
				BigDecimal amount1=sc.nextBigDecimal();
				Customer transAmt=service.fundTransfer(sourceMobileNo,targetMobileNo,amount1);
				System.out.println(transAmt);
				break;
				
			case 4:
				System.out.println("Enter the mobile no:");
				String mobileNo=sc.next();
				System.out.println("Enter the amount to be deposited");
				BigDecimal amt1=sc.nextBigDecimal();
				Customer dep=service.depositAmount(mobileNo, amt1);
				System.out.println(dep);
				break;
				
			case 5:
				System.out.println("Enter the mobile number");
				String mobNo1=sc.next();
				System.out.println("ENter the amount to be with drawn");
				BigDecimal amt2=sc.nextBigDecimal();
				Customer with=service.withdrawAmount(mobNo1, amt2);
				System.out.println(with);
				break;
			}			
			System.out.println("Do you want to continue?(y/n)");
		}while(sc.next("y")!=null);
		
	}

}
