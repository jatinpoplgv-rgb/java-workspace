package Stringbuilder1;

public class QueryGenerator 
{
public  StringBuilder generateQuery (int salary , String empID) 

{
   StringBuilder query = new StringBuilder("Select * from employee "); // create sb object
   
   if (salary >0 && empID != null)
   {
	   query.append(" where salary = " + salary +  empID + ";"); // modifying existing object 
   }
   else if (empID != null) 
   {
	   query.append("where empID = " + empID + ";"); // modifying existing object
   }
   else if (salary >0 )
   {
	   query.append(" where salary = " + salary +   ";"); // modifying existing object 
   }
   else 
   {
	   System.out.println(";");
   }
   return query;
}
}
