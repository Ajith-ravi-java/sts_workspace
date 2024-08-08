package javaStreams;

import java.util.Arrays;

public class staticExample {

	public static void main(String[]args) {

		String name ="hi i am ajith";
		StringBuilder reversword=new StringBuilder(name.replace(" ", ""));
		reversword.reverse();
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==' ') {
				reversword.insert(i, ' ');
			}
			
		}
		
		System.out.println(reversword);
		
						
				
	}
	}
	
	

