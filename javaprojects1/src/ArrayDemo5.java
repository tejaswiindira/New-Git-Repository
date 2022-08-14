

public class ArrayDemo5 
{
   void funA(int arr[])
   {
	  //System.out.println(arr[0]); 
	  //System.out.println(arr[1]);
	  //System.out.println(arr[2]);
	  //System.out.println(arr[3]);
	  //System.out.println(arr[4]);
	  //int  rowCount=array.length;
	   int c=arr.length; 
	   for(int i=0;i<arr.length;i++)
		{
			   System.out.println(arr[i]);
		}

	  
   }
	public static void main(String[] args) 
	{
		int arr[]=new int[5];
	    
		ArrayDemo5 a1=new ArrayDemo5();
		a1.funA(arr);

		
	}

}

