package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//Binary search algoirtjm depends on sort algorithm
	//sort algorithm is a dependency of Binary Search
	@Autowired
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
