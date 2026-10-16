package Day15;

public class MenProducts extends FlipkartProducts
{
   String category;
	
  public MenProducts(String _name,int _age,String _productId,int _phoneNumber)

{
	  
super ( _name, _age, _productId, _phoneNumber);

}	
 
  public void displayCategory(){
	  
	  System.out.println("this category for only men");
  }
}
