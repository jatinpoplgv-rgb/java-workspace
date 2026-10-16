package Day15;

public class BankLoan
{
  public String bankInsurance(String name ,int age, int creditScore , double salary )
 
  {
	  String comment = null;
	  
	  double loanamount = 0 ;
	  double intrest = 0;
	  double totalamount;
	  
	if (age < 21) 
	{
		comment = "you cannot apply for loan";
		System.out.println("Sorry :"+ comment);
	}
	else if (age >= 21 && salary < 25000 ) 
	{
		
		comment = "salary is to low";
		System.out.println("Sorry :"+ comment);
	}
	else if (age >= 21 && creditScore > 600 && creditScore < 750 && salary > 25000 && salary < 25000 ) 
	{
		comment = "you can take normal loan ";
		 loanamount =  salary*10;
		 intrest = loanamount*10/100;
		 totalamount = loanamount + intrest;
		 System.out.println(comment);
		System.out.println("loan amount :"+loanamount);
		System.out.println("intrest :"+intrest);
		System.out.println("intrest :"+totalamount);
	}
	else if (age >= 21 && creditScore > 750  && salary > 50000 ) 
	{
		comment = "you can take premium loan ";
		 loanamount =  salary*15;
		 intrest = loanamount*8/100;
		 totalamount = loanamount + intrest;
		 System.out.println(comment);
		 System.out.println("Canditate name :"+name);
		System.out.println("loan amount :"+loanamount);
		System.out.println("intrest :"+intrest);
		System.out.println("total amount  :"+totalamount);
	}
	return comment;	
  }
}
