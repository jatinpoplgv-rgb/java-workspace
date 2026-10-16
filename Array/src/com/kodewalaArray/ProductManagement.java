package com.kodewalaArray;



public class ProductManagement {
	String productname;
	String category;
	int price;
	int quantity;
	String productId;
	
	

	public ProductManagement(String productname, String category, int price, int quantity, String productId) {
		
		this.productname = productname;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
	}

     void display()
{
	
    	 System.out.println(productname + " "+category+" "+price+" "+quantity+" "+productId);
	
	
	
}

	
	
	

	public static void main(String[] args) 
	{
		ProductManagement p1 = new ProductManagement("laptop","electronic",80000,2,"78rdcfd");
		ProductManagement p2 = new ProductManagement("maggie","food",80,200,"75rfcfd");
		ProductManagement p3 = new ProductManagement("mobile","electronic",52000,10,"96rdcfd");
		ProductManagement p4 = new ProductManagement("compact","tobacco",130,20000,"98rdcfd");
		ProductManagement p5 = new ProductManagement("car","vechile",800000,1,"9eddcfd");

		
		ProductManagement products [] = {p1,p2,p3,p4,p5};
		
		
	        
	            
	        
		  for (int  i = 0;i < products.length;i++) 
	     	{
			if (products[i].price > 50000) 
			{
				products[i].display();
			}
	     	}
			 int highestPrice = 0;

		        for (int i= 0; i< products.length; i++)
		        {
		            if (products[i].price > highestPrice)
		            {
		                highestPrice = products[i].price;
		            }
		        }

		        System.out.println("Highest price = " + highestPrice);
		       
		        int highestTotalValue = 0;
		        ProductManagement highestProduct = null;

		        for (int i = 0; i < products.length; i++)
		        {
		            int totalValue = products[i].price * products[i].quantity;

		            if (totalValue > highestTotalValue)
		            {
		                highestTotalValue = totalValue;
		                highestProduct = products[i];
		            }
		        }

		        System.out.println("Product with highest total value:");

		        highestProduct.display();
			
		}
		
		
		
		
		
	}
	


