package javaStreams;

public class sortingInArray {

	public static void main(String[] args) {

		int num[]= {2,8,5,9,1,3,6};
		
		for(int i=0;i<num.length;i++) {
			for(int j =i+1;j<num.length;j++) {
				
				if(num[j]>num[i]) {
					
					System.out.println(num[i]);
					
				}
				
			}

			//System.out.println(num[i]);
			
		}

	}

}
