package inherDemo;

public class ToStringDemo1 
{
int a=10;
String  s1="RBG TECHNOLOGIES";
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ToStringDemo1 t1=new ToStringDemo1();
		System.out.println(t1);
	}
public String toString()
{
	System.out.println("tostring of stingdeno1");
	return s1+"  "+a;
}
}
