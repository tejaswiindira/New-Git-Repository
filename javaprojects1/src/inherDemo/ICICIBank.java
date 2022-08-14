package inherDemo;

public class ICICIBank extends RBIBank
{
	ICICIBank()
	{
		System.out.println("cons of ICICI Bank");
	}
    
	public static void main(String[] args) 
	{
		ICICIBank i1=new ICICIBank();
		i1.cibilScore();
	}

}
