package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int [] numbers, int numberToSearchFor) {
		//sorting an array
		//search the array
		//return the result 
		
		//lets assume 
		            // this search is using "Bubble sort algorithm"
		
		//it is tightly coupled with bubble sort algorithm
		//because its using bubble sort algorithm
		//this is not good
		  
		//if I want to use "Quick Sort Algorithm", 
		     //i need to change entire logic of this program
		
		
		//so i created BubbleSortAlgorithm separately
	

		
		
		
	//	BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		
		
		int [ ] sortedNumbers =sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3; //to make compiler happy	
	}

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	} 
	
	
}
