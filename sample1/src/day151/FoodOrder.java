package day151;

public class FoodOrder
{
   String name;
   int price;
   String productId;
   
   public FoodOrder(String _name, int _price, String _productId) {
	this.name = _name;
	this.price = _price;
	this.productId = _productId;
   }
   
}
    class Pizza extends FoodOrder
   {
	   String size;
	   
	   public Pizza(String _name, int _price, String _productId,String _size) 
	   {
		   super(_name,_price,_productId);
		   this.size = _size;
		   
	   }
	   
   }
  
    class FoodDriver
   {
	   public static void main(String args[]) 
	   {
		   Pizza f1 = new Pizza("vegCapsicumPizza",799,"ere333","large");
		   System.out.println(f1.name);
		   System.out.println(f1.price);
		   System.out.println(f1.productId);
		   System.out.println(f1.size);
	   }
	   
	   
   }
 
    
   
   

