
interface Mobile{
	
//	public void gaming() {
//		System.out.println("playing game");
//	}
//	
//	public void calling() {
//		System.out.println("calling");
//	}
	
	public abstract void billPaying();
	
//	Mobile(){
//		System.out.println("constructor calling");
//	}
}

//class smartphone extends Mobile {
//
//	
//	public void billPaying() {
//
//System.out.println("billed");
//		
//	}
//	
//	
//	
//}

public class Main {

	public static void main(String[] args) {

		Mobile s=()->{

				System.out.println("billlled");
				
				
			};
			
			s.billPaying();
		}
		

	}


