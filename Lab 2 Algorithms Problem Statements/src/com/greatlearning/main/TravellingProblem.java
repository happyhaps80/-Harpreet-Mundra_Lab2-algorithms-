package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.sorting.MergeSort;

public class TravellingProblem {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		System.out.println("Enter the number of currency denominations =");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations =");
		int []denominationsArray = new int[noOfDenominations];
		for(int index = 0; index < noOfDenominations;) {
			int denomination = sc.nextInt();
			if (denomination != 0) {
				denominationsArray[index]=denomination;
				index++;
			}
		}
		MergeSort mergeSort = new MergeSort();
		MergeSort.mergeSort(denominationsArray, 0, denominationsArray.length -1);
		for (int i = 0; i < denominationsArray.length; i++) {
		System.out.print(denominationsArray[i]);
		System.out.print(",");
		}
		System.out.println("Enter the target Amount =");
		int target = sc.nextInt();
		NotesCounter notesCounter = new NotesCounter();
	    int[]notesCounterArray = notesCounter.notesCount(denominationsArray,target);
	    /**
	     * notesCounterArray is having values 2, 1, 1 denominationsArray is having values
	     * like 2000,500,100,20,10 2000:1 500:1 100:1 target = 2600
	     */
	    for (int index = 0; index < denominationsArray.length; index++) {
	    	if (notesCounterArray[index]!= 0) {
	    	System.out.println(denominationsArray[index] + ":" + notesCounterArray[index]);
	    }
	} 
 }
}
