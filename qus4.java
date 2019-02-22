class AB
{

	private static AB obj=new AB();//Early, instance will be created at load time
	private AB(){}

	public static AB getA(){
		return obj;
	}

	public void doSomething(){
		System.out.println("hello, this is me");
	}
	public static void main(String[] args)
	{
		AB obj = new AB();
		obj.doSomething();
		obj.getA();


	}
}