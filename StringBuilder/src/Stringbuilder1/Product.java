package Stringbuilder1;

 public class Product {

	public static void main(String[] args)
	{
		ElectronicProduct e1 = new ElectronicProduct ();
		e1.display();
	}
	
}
 class products
 {
	 void display() 
		{
			System.out.println("product");
		}
 }
class ElectronicProduct extends products
{
	void display() 
	{
		System.out.println("Electronics");
	}
}
