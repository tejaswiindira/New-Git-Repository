
public class Odemo10 
{
 A getA(int x)
 {
	 A a1=new A();
	 a1.i=x;
	 a1.j=x+1;
	 return a1;
 }
	public static void main(String[] args)
	{
		Odemo10 d1=new Odemo10();
		A x=d1.getA(4);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		d1.getA(4);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		x=d1.getA(7);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		int i=d1.getA(6).i;
		//int i=d1.getA(6);
		//int i=d1.getA(7).funA();
		System.out.println(d1.getA(8));
		System.out.println(d1.getA(6).i);
	}

}
