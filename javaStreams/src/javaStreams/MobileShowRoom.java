package javaStreams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Products{
	
	private String username;
	private String brand;
	private int price;
	private int ram;
	private int rom;
	
	public Products() {
		super();
	}

	public String getUserName() {
		return username;
	}
	
	public void setUserName(String username) {
		this.username=username;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram=ram;
	}
	
	public int getRom() {
		return rom;
	}
	
	public void setRom(int rom) {
		this.rom=rom;
	}
	
	public Products(String username,String brand,int price,int ram,int rom) {
		this.username=username;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
	}
	

	@Override
	public String toString() {
		return "username=" + username + ", brand=" + brand + ", price=" + price + ", ram=" + ram + ", rom="
				+ rom;
	}
	
	
}


public class MobileShowRoom {

	public static void main(String[] args) {

	List<Products> product=List.of(
			new Products("ajith","moto",9500,8,128),
			new Products("vishal","moto",19500,8,128),
			new Products("raj","moto",29500,8,128),
			new Products("vijay","mi",15500,6,128),
			new Products("hari","poco",16000,6,128),
			new Products("sandhosh","pixel",40000,6,128),
			new Products("vengatesh","pixel",35000,6,128),
			new Products("aravinth","mi",10000,4,64),
			new Products("ajai","mi",17000,6,128),
			new Products("amar","poco",13000,6,128),
			new Products("bharath","mi",15500,6,128),
			new Products("vignesh","mi",14000,6,128),
			new Products("abi","mi",16000,6,128)

			);
	//matches
	System.out.println(product.stream().noneMatch(p->p.getBrand().equals("apple")));
	System.out.println(product.stream().anyMatch(p->p.getBrand().equals("apple")));
	System.out.println(product.stream().allMatch(p->p.getBrand().equals("apple")));

	//groupBy
	
	Map<String,Long>groupingBybrand=product.stream()
	.collect(Collectors.groupingBy(b->b.getBrand(),Collectors.counting()));
	//System.out.println(groupingBybrand);

	//groupByTheHighestPriceOfMobiles
	
	Map<String, Optional<Products>> highestPriceOfMobile= product.stream()
	.collect(Collectors.groupingBy(Products::getBrand,
			Collectors.maxBy(Comparator.comparing(p->p.getPrice()))));
	
	System.out.println(highestPriceOfMobile);
	
	//groupingByOnlyUserName
	
	Map<String,List<String>> username =product.stream()
			.collect(Collectors.groupingBy(Products::getBrand,Collectors.mapping(Products::getUserName, Collectors.toList())));
	
	System.out.println(username);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
