
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		
		System.out.println(acc.amount +" and "+acc.name);
		
		Account acc1 = new Account(2000, "kodewala");
		
		System.out.println(acc1.amount +" and "+acc1.name);
		
	}

}
