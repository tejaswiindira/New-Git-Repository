package inherDemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("cons of HDFC Bank");
	}
	public static void main(String[] args)
	{
		HDFCBank h1=new HDFCBank();
		h1.cibilScore();
	}
	void cibilScore()
	{
		System.out.println("cibil score of HDFC Bank");

	}

}
