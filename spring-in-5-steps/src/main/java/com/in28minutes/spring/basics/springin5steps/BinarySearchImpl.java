package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		
		this.sortAlgorithm = sortAlgorithm;
	}
	

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Bubble Sort Algorithm
		
		BubleSortAlgorithm bubleSortAlgorithm = new BubleSortAlgorithm();
		
		int[] sortedNumbers = bubleSortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//Search the array
		
		return 3;
	}

}
