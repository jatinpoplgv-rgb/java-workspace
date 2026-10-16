package ForLoops;

public class ProductDriver 
{

  public static void main(String args[])
  {
	  Product p1 = new Product("Laptop",50000,"electronic");
	  Product p2 = new Product("motorbike",100000,"vechile");
	  Product p3 = new Product("bat",5000,"sports");
	  Product p4 = new Product("mobile",40000,"electronic");
	  Product p5 = new Product("car",5000000,"vechile");
	  Product p6 = new Product("kiwi",500,"fruit");
	  Product p7 = new Product("freezer",80000,"electronic");
	  
	  
	  
	  Product Products  [] = new Product[7];
	  
	  
	  Products[0] = p1;
	  Products[1] = p2;
	  Products[2] = p3;
	  Products[3] = p4;
	  Products[4] = p5;
	  Products[5] = p6;
	  Products[6] = p7;
	  
	  
	  for (int i = 0; i < Products.length ; i++)
	  {
		  if (Products[i].price > 10000)
		  {
			  int discount = Products[i].price * 10 / 100;
              int finalPrice = Products[i].price - discount;

              System.out.println("Product Name : " + Products[i].productName);
              System.out.println("Original Price : " + Products[i].price);
              System.out.println("Discount : " + discount);
              System.out.println("Final Price : " + finalPrice);
			 
			  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
