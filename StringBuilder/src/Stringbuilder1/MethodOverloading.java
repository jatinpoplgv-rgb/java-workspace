package Stringbuilder1;

public class MethodOverloading 
{
	static class A {
	    void show() {
	        System.out.println("A");
	    }
	}

	static class B extends A {
	    void show(int x) {   // different parameter
	    	
	    	super.show();
	        System.out.println("B");
	    }
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.show();
		b1.show(5);
	}
}
