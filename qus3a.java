// 3. WAP to produce ClassNotFoundException.
class A
{
public static void main(String[] args)
		{
		try
		{
		Class.forName("ODBC");
		}
		catch (ClassNotFoundException ex)
		{
		ex.printStackTrace();
		}
		}

		}