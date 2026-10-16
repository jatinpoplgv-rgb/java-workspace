package Day13;

 class MobileInformation 
{
     
	String brand;
	int price;
	String colour;
	int ram;
	
	MobileInformation()
	{
		System.out.println("Mobile information");
	}
	
	MobileInformation(String _brand,int _price,String _colour,int _ram)
	{
	this.brand = _brand;
	this.price = _price;
	this.colour = _colour;
	this.ram = _ram;
	
	}
	
	MobileInformation(String _brand,String _colour)
	{
	this.brand = _brand;
	this.colour = _colour;
	}
	
}
 
 public class Mobile
{

	public static void main(String args[])
	{
		MobileInformation m = new MobileInformation("iphone",100000,"red",4);
		System.out.println(m.brand+" , "+m.price+" , "+m.colour+" , "+m.ram);
		MobileInformation m2 = new MobileInformation("iphone","red");
		System.out.println(m2.brand+" , "+m2.price);
		
		System.out.println("Mobile information");
		
		
	}
	
	
}
