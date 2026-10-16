package Day13;

 class FoodMain {

	String foodName;
	int price;
    String type;
    int quantity;
    
    
    FoodMain() 
	{
    	System.out.println("food information");
	}
	
	FoodMain(String _foodName,int _price,String _type,int _quantity) 
	{
		this.foodName = _foodName;
		this.price = _price;
		this.type = _type;
		this.quantity = _quantity;
	}

	FoodMain(String _foodName,int _quantity) 
	{
		this.foodName = _foodName;
		this.quantity = _quantity;
	}
 }
	public class Food
	{
	public static void main(String[] args) {
		
		
		FoodMain f1 = new FoodMain("Burger",230,"veg",2000);
		System.out.println(f1.foodName+" , "+f1.price+" , "+f1.type+" , "+f1.quantity);
		FoodMain f2 = new FoodMain("Burger",2000);
		System.out.println(f2.foodName+" , "+f2.quantity);
		System.out.println("food information");
	}
	}

