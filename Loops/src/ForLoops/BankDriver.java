package ForLoops;


public class BankDriver {

	public static void main(String[] args) 
	
	{
		BankAccount user1 = new BankAccount("jatin",5000,"8527894552");
		BankAccount user2 = new BankAccount("abhay",1000,"8527855552");
		BankAccount user3 = new BankAccount("dhum",1500,"8527895542");
		BankAccount user4 = new BankAccount("bhanu",3000,"822524552");
		BankAccount user5 = new BankAccount("shiva",9000,"84567894552");
		BankAccount user6 = new BankAccount("rosi",6000,"85151894552");
		BankAccount user7 = new BankAccount("priya",500,"855194552");
		BankAccount user8 = new BankAccount("annu",56000,"2127894552");
		BankAccount user9 = new BankAccount("janu",9000,"8552894552");
		
		
		BankAccount users[] = new BankAccount[9]; 
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		users[5] = user6;
		users[6] = user7;
		users[7] = user8;
		users[8] = user9;
		
		
			
		for (int i = 0; i < users.length; i++)
		{
		    if (users[i].accountBalance < 2000)
		    {
		        System.out.println(users[i].name + " has balance less than 2000");
		    }
		}
		
		
	}
	 

}
