
public class Odemo6
{
 int x=4;
 A a1=new A();
 Odemo6 d1=new Odemo6();
	public static void main(String[] args) 
	{
		System.out.println("main method of demo6");
		Odemo6 d1=new Odemo6();
		System.out.println(d1.x);
		System.out.println("Done");		

	}

public class A 
{
  int i;
  int j;
  void funA()
  {
	  System.out.println("funA() of class A");
  }
}

}
