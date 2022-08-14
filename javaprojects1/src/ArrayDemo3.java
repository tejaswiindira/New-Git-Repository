
public class ArrayDemo3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[][]=new int[3][4];
		int rowCount=arr.length;
		int colCount=arr[0].length;
		int count=0;
		for(int i=0;i<=arr.length;i++)
		{
			count++;
			System.out.println("row length");
			System.out.println(count);
			for(int j=0;j<=arr[0].length;j++)
			{
				count++;
				System.out.println("col length");
				System.out.println(count);
				System.out.println(arr[i][j]);
			}
			
		}
	
		

	}

}
