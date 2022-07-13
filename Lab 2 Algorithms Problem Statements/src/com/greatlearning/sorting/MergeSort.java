package com.greatlearning.sorting;

public class MergeSort {
	public static void main(String[]args) {
		int[]array = new int[] {20, 45, 98,2,55, 1, 23, 33, 45, 65};
				System.out.println("Original Array");
		for (int index = 0; index < array.length; index++){
			System.out.print(array[index]);
			System.out.print(",");
			}
		System.out.println("");
		mergeSort(array, 0 , array.length - 1);
		System.out.println("Sorted Array");
		for (int index = 0; index < array.length;  index++) {
			System.out.print(array[index]);
			System.out.print(",");
		}
	}
		
	/**
 * this will merge the subsets into a sorted array.
 * 
 * @happy array
 * @happy mid
 * @happy right
 */
		public static void merge(int[]array,int left, int mid, int right) {
		int sizeOfLeftPortion;
		int sizeOfRightPortion;
		sizeOfLeftPortion = mid - left + 1;
		sizeOfRightPortion = right - mid;
		
		int leftArray[] = new int[sizeOfLeftPortion];
		int rightArray[] = new int[sizeOfRightPortion];
		
		/**
		 * copy the left and right portions into these two arrays
		 */  
		
		for (int index = 0; index < sizeOfLeftPortion; index++) {
			 leftArray[index] = array[left + index];
		 } 
		 for (int index = 0; index < sizeOfRightPortion; index++) {
			 rightArray[index] = array[mid + 1 + index];
			 }
		 
		 
		 
		 
		 
		 int i = 0, j = 0;
		 int k = left;
		 
		 
		 
		 
		 
		 
		 
		 
		 while (i < sizeOfLeftPortion && j < sizeOfRightPortion) {
			 if (leftArray[i] <= rightArray[j]) {
				 array[k] = leftArray[i];
				 i++;
			 } else {
				 array[k] = rightArray[j];
				 j++;
			 }
			 k++;
		 }
		 
		 while (i < sizeOfLeftPortion) {
			 array[k] = leftArray[i];
			 k++;
			 i++;
		 }
		 
		 while (j < sizeOfRightPortion) {
			 array[k] = rightArray[j];
			 k++;
			 j++;
		}
		 
		}
		
		
		
		
		
		
		
		
		public static void mergeSort(int[] array, int left, int right) {
			
			
			
			if (left < right) {
				int mid = (left + right)/ 2;
				
				
				
				
				
				mergeSort (array, left, mid);
				mergeSort (array, mid + 1, right);
				merge (array, left, mid, right);
				}
		}
}		


