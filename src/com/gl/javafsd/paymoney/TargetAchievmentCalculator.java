package com.gl.javafsd.paymoney;

public class TargetAchievmentCalculator {
	
	private int[] transcations;
	private int dailyTarget;
	private boolean dailyTargetAchieved;
	private int transactionCounter;
	
	TargetAchievmentCalculator(int[] transcations, int dailyTarget)
	{
		this.transcations = transcations;
		this.dailyTarget =  dailyTarget;
		this.dailyTargetAchieved = false;
		this.transactionCounter =  0;
		
	}
	
	public void calculate()
	{
		int tempCounter = 0;
		
		for(int index = 0;  index < transcations.length; index++)
		{
			int targetValue = transcations[index];
			tempCounter = tempCounter + targetValue;
			transactionCounter ++;
			if(tempCounter >= dailyTarget)
			{
				dailyTargetAchieved = true;
				break;
			}
			
		}
		
	}
	
	public void printOutcome()
	{
		if(dailyTargetAchieved)
		{
			System.out.println("Target achieved after " +transactionCounter+ " transaction");
		}
		
		else
		{
			System.out.println("Given Target is not achieved");
		}
	}

}
