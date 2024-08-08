package javaStreams;

import java.util.Comparator;

public class CompratorExample {

	public static void main(String []args) {
		
		
		
		Comparator<Integer> com =( o1,  o2)-> o1.compareTo(o2);
		System.out.println("COMPARETO IS : "+com.compare(4, 76));

		};
		
		
	}
	

