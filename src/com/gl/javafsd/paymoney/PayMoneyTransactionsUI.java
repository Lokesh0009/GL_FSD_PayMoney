package com.gl.javafsd.paymoney;

import java.util.Scanner;

public class PayMoneyTransactionsUI {
	
	private int[] transactions;
	private Scanner input;
	
	
	public PayMoneyTransactionsUI()
	{
		input = new Scanner(System.in);
	}
	
	public void init()
	{
		gatherInputsAndProcess();
	}
	
	private void gatherInputsAndProcess()
	{
		System.out.println("Enter the size of Transaction array :");
		int transactionArraySize = input.nextInt();
		transactions = new int[transactionArraySize];
		
		System.out.println("Enter the values fo Array :");
		for(int index=0; index < transactionArraySize; index++ )
		{
			transactions[index] = input.nextInt();
			input.nextLine();
		}
		
		System.out.println("Enter the total no of targets to be achieved :");
		int tansactionsTargetSize = input.nextInt();
		
		input.nextLine();
		
		for(int index = 1; index <= tansactionsTargetSize; index++)
		{
			System.out.println();
			System.out.println("Enter the value of Target :");
			int dailyTarget = input.nextInt();
			input.nextLine();
			
			TargetAchievmentCalculator calculator = new TargetAchievmentCalculator(transactions, dailyTarget);
			
			calculator.calculate();
			calculator.printOutcome();
			
		}
		
		
		
	}

}
