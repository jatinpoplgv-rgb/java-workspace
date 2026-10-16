
public class Account 
{
	 int amount;
	 String name;
	 
	 // if developer is not providing any constructor is a class then will add
	 // constructor (no args constructor)
	 
	 Account ()
	 {
		 System.out.println("inside Account()");
		
	 }
Account(int _amount, String _name)
{
 System.out.println("inside Account(int _amount, String _name)");
 this.amount =_amount;
 this.name =_name;
}
}
