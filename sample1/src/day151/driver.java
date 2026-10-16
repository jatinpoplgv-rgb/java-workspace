package day151;

public class driver {

	public static void main(String[] args) {
		
		ElectronicProduct electronicproduct = new ElectronicProduct("iphone", 1233 ,"ipj890",8);
        System.out.println(electronicproduct.name);
		System.out.println(electronicproduct.price);
		System.out.println(electronicproduct.productId);
		System.out.println(electronicproduct.warranty);
	}

}
