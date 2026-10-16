package Day15;

public class MensDriver {

	public static void main(String[] args)
	{
		MenProducts m = new MenProducts("xyxy",30-50,"jfjf",789691301);
       
		System.out.println("this category for only men");
		
	   System.out.println("Product name "+m.name);
       System.out.println("Age"+m.age);
       System.out.println("product id"+m.productId);
       System.out.println("phone number"+m.phoneNumber);
	}

}