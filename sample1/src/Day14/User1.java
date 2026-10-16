package Day14;

class Superuser1 
{
 Superuser1(){
	 
	super();//calling super class no args constructor 
	// execute remaning steps if any
	//...
 }	
}

public class User1 {

	String userName;
	String userId;
	String mobile;
	
	User1(String _userName,String _userId, String _mobile)
	{ 
	    
		super();
	
		this.userId = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User1()
	{
		System.out.println("user ()...no args ");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		User u1 = new User("jatin","d23","78654135");
		System.out.println(u1.userName+" , "+u1.userId+" , "+u1.mobile);
		
		
	}

}
