package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubleSortAlgorithm implements SortAlgorithm {
	
	@Override
	public int[] sort(int[]numbers) {
		return numbers;
	}

}
