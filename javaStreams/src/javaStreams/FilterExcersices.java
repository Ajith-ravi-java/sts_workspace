package javaStreams;

import java.util.List;

public class FilterExcersices {

	public static void main(String[] args) {
		
	System.out.println("integer max value is : "+Integer.MAX_VALUE);	
	System.out.println("integer min value is : "+Integer.MIN_VALUE);	
	//-2147483648 to 2147483647
	//-2147483648 to 2147483647 

	List<Integer> printOdd=List.of(2,3,4,1,5,67,8,9);
	List<String> cources= List.of("spring","springboot","hibernate","mysql","springdatajpa");
	
	printOddNumber(printOdd);
	System.out.println();
	System.out.println("******************************************************************");

	printAllCources(cources);
	System.out.println();
	System.out.println("******************************************************************");
	
	getOnlyContainSpring(cources);
	System.out.println();
	System.out.println("******************************************************************");
	
	checkAboveFourLength(cources);
	System.out.println();
	System.out.println("******************************************************************");
	
	qubeOddNumber(printOdd);
	System.out.println();
	System.out.println("******************************************************************");
	
	numberOfEachCharacters(cources);
	System.out.println();
	System.out.println("******************************************************************");
	
	reduceNumbers(printOdd);
	System.out.println();
	System.out.println("******************************************************************");
	
	FindMaxValue(printOdd);
	
	}
	
	public static void printOddNumber(List<Integer> numbers) {		
		numbers.stream().filter(n->n%2!=0).forEach(System.out::println);	
	}

	public static void printAllCources(List<String> cources) {		
		cources.stream().forEach(System.out::println);
	}
	
	public static void getOnlyContainSpring(List<String> getSpring) {
		getSpring.stream().filter(spring->spring.contains("spring")).forEach(System.out::println);
	}
	
	public static void checkAboveFourLength(List<String> checkingLength) {
		checkingLength.stream().filter(check->check.length()>=4).forEach(System.out::println);
	}
	
	public static void qubeOddNumber(List<Integer> numbers) {		
		numbers.stream().filter(n->n%2!=0).map(n->n*n).forEach(System.out::println);	
	}
	
	public static void numberOfEachCharacters(List<String> findEachCharacters) {
	  findEachCharacters.stream().map(find->find.length()).forEach(System.out::println);
	}
	
	public static void reduceNumbers(List<Integer> add) {
	    int i=add.stream().reduce(0, (a,b)->+a+b);
	    System.out.println(i);
	}
	
	public static void FindMaxValue(List<Integer> max) {
		int i=max.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
		System.out.println(i);
	}
	
}
