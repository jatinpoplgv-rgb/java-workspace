package Day13;

  class Invoicemain extends Object{
	
	static int gst = 18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoicemain(int _amount,String _itemName,String _billingAddress,String _customerId,String _customerName)
	{
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerName;
		
		
	}
}

public class Invoice
 {

	public static void main(String[] args){
		Invoicemain inv1 = new Invoicemain(15000,"realme","narayan bihar","j123","bhanu");
		
		Invoicemain inv2 = new Invoicemain(19000,"realme","narayan bihar","j1093","abhay");
		
		
		System.out.println("first invoice :"+inv1.amount+" , "+inv1.itemName+" , "+inv1.billingAddress);
		
		System.out.println("second  invoice :"+inv2.amount+" , "+inv2.itemName+" , "+inv2.billingAddress);
	}
	

}
