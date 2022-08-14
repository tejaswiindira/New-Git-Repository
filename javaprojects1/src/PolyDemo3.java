
public class PolyDemo3 
{

	public static void main(String[] args) 
	{
	PolyDemo3 p3=new PolyDemo3();
	p3.funA();
   	A k=null;
	//	p3.funA(k);
	//p3.funA(new A());
	B i=null;
	//p3.funA(i);
	//p3.funA(new B());
	C m=null;
	//p3.funA(m);
	//p3.funA(new C());
	p3.funA(k);
	p3.funA(i);
	p3.funA(m);
	}
		void funA()
		{
			System.out.println("zero args funA of polydemo3");
		}
		
		void funA(A a1)
		{
			System.out.println("clas A args funA of polydemo3");
			System.out.println(a1);
		}
		void funA(B a1)
		{
			System.out.println("class B args funA of polydemo3");
			System.out.println(a1);
		}
		void funA(C a1)
		{
			System.out.println("class C args funA of polydemo3");
			System.out.println(a1);
		}
		
	

}
