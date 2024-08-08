package javaStreams;

import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample1 {

	public static void main(String[] args) {

//		List<Integer> numbers=new ArrayList<Integer>();
//		numbers.add(2);
//		numbers.add(4);
//		numbers.add(5);
//		numbers.add(8);
//		numbers.add(6);
//
//		List<Integer> result=numbers.stream().map(n->n+5).collect(Collectors.toList());

		//System.out.println(result);
		
		
		
		//System.out.println(map);
		
		
//		Integer nums[] = {1,2,3,4,6,3,2,5,4};
//		
//		List<Integer> numbers= Arrays.stream(nums).collect(Collectors.toList());
//		
//		System.out.println("first : "+numbers);
//		
//		Set<Integer> check =new HashSet<Integer>();
//		
//		check.addAll(numbers);
//		
//		System.out.println("second : "+check);
//
//		
//		List<Integer> li=check.stream().filter(n->!numbers.contains(n)).collect(Collectors.toList());
//		System.out.println("third : "+li);
		
//		List<Integer> listnumbers=Arrays.asList(2,3,4,56,32,23,3,2,4);
//		
//		listnumbers.parallelStream()
//				.filter(i->Collections.frequency(listnumbers, i)>1)
//				.collect(Collectors.toSet())
//				.forEach(System.out::println);
		
//		int givenNumber= 265625151;
//		
//		LinkedList<Integer> splitnum=new LinkedList<Integer>();
//		
//		while(givenNumber>0) {
//			
//			splitnum.push (givenNumber%10);
//		givenNumber=givenNumber/10;
//			
//		}
//		
//		System.out.println(splitnum);
//
//		List<Integer> nu=splitnum.stream().filter(n->n>5).map(n->n).collect(Collectors.toList());
//		System.out.println(nu);
		
		
		LinkedList<Integer> n=new LinkedList<Integer>();
		
		n.add(34);
		n.add(356);
		n.add(34);
		n.add(897);
		n.add(14);
		n.add(12);
		
		Integer r=n.stream().reduce(0,(a,b)->a+b);
	//	System.out.println(r);
		
		
		int numberis=33243554;
		
		LinkedList<Integer> numlist=new LinkedList<Integer>();
		
		while(numberis>0) {
			
			numlist.push(numberis%10);
			numberis=numberis/10;
			
		}
		
		System.out.println(numlist);	
		
		Map<Integer,Long > m=numlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m);
	}

}
