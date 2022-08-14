
public class StaticDemo5
{
	
		int a=funA();
		static int j=funB();
		int funA()
		{
			System.out.println("fun A of staticdemo5");
			return 10;
		}
		static int funB()
		{
			System.out.println("fun B of staticdemo5");
			return 20;

		}
		public static void main(String[] args) 
		{
			System.out.println("Main method od staticdemo5");
			StaticDemo5 s1=new StaticDemo5();
			System.out.println(s1.a);
			s1.funA();
			System.out.println("Done");

	}

}
