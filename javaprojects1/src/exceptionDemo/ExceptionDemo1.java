package exceptionDemo;

public class ExceptionDemo1 
{
	//static A a1;
	public static void main(String[] args)
	{
       System.out.println("start");
       try
       {
    	   System.out.println(10/0);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println(e);
    	   System.out.println("Arithmetic exception is invoking");
       }
       System.out.println("Done");
       
	}

}
