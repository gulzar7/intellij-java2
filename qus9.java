abstract class metal
{
	abstract void test();
}

abstract class wooden
{
	abstract void test();
}


class wodden_chairs extends wooden
{
	void test()
	{
		System.out.println("did not pass fire test");
		System.out.println("did not pass stress test");
	}
}
class wodden_table extends wooden
{
	void test()
	{
		System.out.println("did not pass fire test");
		System.out.println("did not pass stress test");
	}
} class metal_chairs extends metal
{
	void test()
	{
		System.out.println("passed fire test");
		System.out.println("passed stress test");
	}
}
class metal_table extends metal
{
	void test()
	{
		System.out.println("passed fire test");
		System.out.println("passed stress test");
	}
}
class ex
{
	public static void main(String args[])
	{
		metal c = new metal_chairs();
		metal t = new metal_table();
		System.out.println("this is metal components");
		c.test();
		t.test();
		System.out.println("this is wodden components");
		wooden cc =new wodden_chairs();
		wooden tt =new wodden_table();
		cc.test();
		tt.test();
	}
}