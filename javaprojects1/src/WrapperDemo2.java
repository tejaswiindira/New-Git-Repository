
public class WrapperDemo2
{

	public static void main(String[] args)
	{
         String flightCharges="5000";
         int charges=Integer.parseInt(flightCharges);
         int ccBalance=4000;
         if(ccBalance>charges)
         {
        	 System.out.println("book tickets");
        
         }
         else
         {
        	 System.out.println("insufficient Balance");
         }
         
	}

}
