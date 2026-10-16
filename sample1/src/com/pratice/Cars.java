package com.pratice;

public class Cars 
{
   String name;
   int price;
   String brand;
   
   
   
  
   Cars(String _name,int _price,String _brand)
   {
	 this.name = _name;
	 this.price = _price;
	 this.brand = _brand;
	   
   }
   
   Cars()
   {
	   System.out.println("inside car");
   }
}
 class Carsfile {
	public static void main(String args[])
	
	{
		Cars c2 = new Cars();
		System.out.println(c2.name+" and "+c2.price+" and "+c2.brand);
		Cars c1= new Cars("splendor",15000,"herohonda");
		System.out.println(c1.name+"  "+c1.price+"  "+c1.brand);
		
	}

}
