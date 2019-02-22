class Timing
{
	void ConvertSectoDay(int n)
	{
		int day = n / (24 * 60 * 60);

		n = n % (24 * 60 * 60);

		int hour = n / (60*60);

		n %= 60*60;
		int minutes = n / 60 ;

		n %= 60;
		int seconds = n;

		System.out.println( day + " " + "days " + hour
				+ " " + "hours " + minutes + " "
				+ "minutes " + seconds + " "
				+ "seconds ");
	}

	// Driver code
	public static void main (String[] args)
	{
		// Given n is in seconds
		Timing obj = new Timing();
		obj.ConvertSectoDay(129600);

	}
}