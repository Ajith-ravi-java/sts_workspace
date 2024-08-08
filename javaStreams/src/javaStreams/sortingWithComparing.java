package javaStreams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Mobile{
	
	private int id;
	private String brand;
	private int price;
	
	
	
	public Mobile(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}

public class sortingWithComparing {

	public static void main(String[] args) {

		List<Mobile> mobilelist= List.of(
				new Mobile(1,"mi",56999),
				new Mobile(2,"sony",34522),
				new Mobile(3,"realme",9866),
				new Mobile(4,"oppo",6542),
				new Mobile(5,"mi",89962)

				);

	Predicate<Mobile> mobilepricechecking= p->p.getPrice()>67555;
	Predicate<Mobile> mobilepricechecking2= p->p.getPrice()==67555;


	boolean b=mobilelist.stream().noneMatch(mobilepricechecking2);
	System.out.println(b);
	
	Map<String, List<Mobile>> m =mobilelist.stream().collect(Collectors.groupingBy(Mobile::getBrand));
System.out.println(m);
	
	
	}

}
