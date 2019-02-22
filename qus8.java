import java.util.Scanner;

class AE
{
	void go()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);

		if(first==last)
			System.out.println("First and Last char are SAME");
		else
			System.out.println("First and Last char are NOT SAME  ");


		while(!s.equals("done"))
		{
			go();
		}

		if(s.equals("done"))
		{
			System.err.println("END");
		}
	}

	public static void main(String[] args)
	{

		AE obj = new AE();
		obj.go();

	}
}