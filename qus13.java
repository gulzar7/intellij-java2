class LowAmountException extends Exception
{
	LowAmountException(String s)
	{
		System.out.println(s);
	}
}

class Banks
{
	int bal=1000;
	void withdrawl(int x) throws LowAmountException
	{
		if(x<=bal)
		{
			bal=bal-x;
			System.out.println("bal="+bal);
		}

		else
			throw new LowAmountException("Amount is too low");

	}
}

class Demo1
{
	public static void main(String[] args)
	{
		Banks b = new Banks();
		try
		{
			b.withdrawl(1500);
		}

		catch(Exception e)
		{
		}


	}
}