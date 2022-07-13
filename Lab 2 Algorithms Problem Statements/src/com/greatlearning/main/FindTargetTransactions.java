    package com.greatlearning.main;

    import java.util.Scanner;

    public class FindTargetTransactions {
	private static final Scanner sc = new Scanner(System.in);
	private static int transactionsCount;
	
	public static void main(String[]args) {
		System .out.println("Enter The Number Of Transactions Per Day =");
		int size = sc.nextInt();
		int[] transactionsArrays = new int[size];
		System.out.println("Enter The Transactions Now");
		for(int index = 0;index < size;){
			int transaction = sc.nextInt();
			if (transaction > 0) {
			transactionsArrays[index]= transaction;
			index++;
		}
	}
		System.out.println("Enter The No Of Target =");
		int noOfTargets = sc.nextInt();
		ptintNumberofTransactions(transactionsArrays,noOfTargets);
		sc.close();
		}
	private static void ptintNumberofTransactions(int[]transactionsArray,int noOfTargets){
		while(noOfTargets > 0) {
		int transactionsCount = getNoOfTransactions(transactionsArray, noOfTargets);
		noOfTargets--;
		if(transactionsCount== -1){
			System.out.println("Daily target is not acheived by all the transactions =");
		} else {
		System.out.println(
		"The Number Of Transactions At Which Daily Target Is Acheived Is =");
	    }
	}
		
}
	
   private static int getNoOfTransactions(int[] transactionsArray, int noOfTargets) {
		System.out.println("Enter the daily target =");
		int target = sc. nextInt();
		int transactionsCount = 0;
		int sum = 0;
		do {
			sum = sum + transactionsArray[transactionsCount];
			transactionsCount++;
			} while(sum <= target && transactionsCount < transactionsArray.length);
		
		if(transactionsCount >= transactionsArray.length) {
			return -1;
		}
	return transactionsCount;
	}
}
