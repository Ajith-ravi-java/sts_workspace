
public class FactorialExample {
	
	public static void main(String[] args) {
		
	    System.out.println(factorialOf(5));
	}
	
	public static int  factorialOf(int num) {
		int multiple=1;
		
		for(int i=1;i<=num;i++) {
			multiple*=i;
		}
		return multiple;
	}
	

}
