package com.kodewalaArray;

public class Books {

	String title;
	String category;
	int price;
	int pages;
	
	
	
	public Books(String title, String category, int price, int pages) {
		
		this.title = title;
		this.category = category;
		this.price = price;
		this.pages = pages;
	}

	


	public static void main(String[] args) 
	{
		Books b1 = new Books("harrypotter","magic",2580,250);
		Books b2 = new Books("ramayan","spritual",5000,2050);
		Books b3 = new Books("doreamon","cartoon",100,260);
		Books b4 = new Books("science","study",250,100);
		
		Books books[] = {b1,b2,b3,b4};
		
		for (int i = 0;i < books.length;i++) 
		{
			if(books[i].price > 300) 
			{
				System.out.println(books[i].title+"  "+books[i].category+"  "+books[i].price+" "+books[i].pages);
			}
		}
		Books totalpages = books[0] ;
		for (int i = 0;i < books.length;i++)
		{
			if (books[i].pages != totalpages.pages ) 
			{
				totalpages = books[i];
			}
		}
		System.out.println("Book which contains most pages :"+totalpages.title+"  "+totalpages.pages);
		int totalprice = 0;;
		for (int i = 0;i < books.length;i++) 
		{
			
				totalprice = totalprice + books[i].price;
			
		}
		System.out.println("Total price of book is :"+totalprice);
		
		Books first = books[0];
		Books second = null;

		for (int i = 1; i < books.length; i++)
		{
		    if (books[i].price > first.price)
		    {
		        second = first;             
		        first = books[i];           
		    }
		    else if (second == null || books[i].price > second.price)
		    {
		        second = books[i];
		    }
		}
		System.out.println("Second most priced book : " + second.title + " , " + second.price);  
		for (int i = 1; i < books.length; i++) 
		{
			if (books[i].price < first.price) 
			{
				second = first ;
				first = books[i];
			}
			else if (second == null || books[i].price < second.price) 
			{
				second = books[i];
			}
		}
		System.out.println("Second less priced book : " + second.title + " , " + second.price);  
		
		int count  = 0;
		for (int i = 1; i <= books.length; i++) 
		{
			count++;
		}
		System.out.println("Total no books :"+count);
		
		int averageprice = 0;
		averageprice = totalprice/count;
		System.out.println("average book price : "+averageprice);
	}

}
