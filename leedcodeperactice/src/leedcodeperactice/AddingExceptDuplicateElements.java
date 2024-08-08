package leedcodeperactice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddingExceptDuplicateElements {

	public static void main(String[] args) {


		List<Integer> numbers=List.of(1,2,3,3,5);
		
		System.out.println(numbers.stream()
		.collect(Collectors
				.groupingBy(Function.identity()
						,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(a->a.getValue()==1).map(e->e.getKey()).mapToInt(Integer::intValue).sum());
		
		
		
	}

}
