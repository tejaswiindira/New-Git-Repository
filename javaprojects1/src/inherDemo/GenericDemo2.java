package inherDemo;

public class GenericDemo2<G>
{

	public static void main(String[] args) 
	{
		GenericDemo2<String>g1=new GenericDemo2<String>();
		g1.funA("RBG Technologies");
	}
    void funA(G g1)
    {
    	System.out.println(g1);
    }
}
