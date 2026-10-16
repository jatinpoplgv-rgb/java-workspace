package Day14;

public class User {

	String userName;
	String userId;
	String mobile;
	
	User(String _userName,String _userId, String _mobile)
	{ 
		this(300);//calling same class (user) constructor
	
		this.userId = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(int age)
	{
		System.out.println("user ()...no args ");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		User u1 = new User("jatin","d23","78654135");
		System.out.println(u1.userName+" , "+u1.userId+" , "+u1.mobile);
		
		
	}

}
