import java.util.Random;
import java.util.Scanner;

class Customer
{

	void Order_payment()
	{

		Scanner sc = new Scanner(System.in);
		String order = sc.next();
		Integer payment = sc.nextInt();

		System.out.println("order is: "+order);
		System.out.println("amount: "+payment);
	}
}

class Cashier extends Customer
{
	float token()
	{
		Random rand = new Random();
		int n = rand.nextInt(10);
		System.out.println("Token number is: "+n);
		return n;
	}
}

class Barista extends Cashier
{
	void ready(float token_no)
	{
		token_no = super.token();
		System.out.println("order of Token number "+token_no+" is ready");

	}

}

class Demo2
{
	public static void main(String[] args) {

		Customer c = new Customer();
		c.Order_payment();
		Barista b = new Barista();
		b.ready(12);
	}

}