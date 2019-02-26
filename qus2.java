public class qus2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		//String s1 = "edcba";
		char temp =0;
		char Chars[] = s1.toCharArray();
		for(int i=0; i<Chars.length;i++)
		{
			for (int j=0; j<Chars.length; j++)
			{
				if(Chars[j]>Chars[i])
				{
temp = Chars[i];
Chars[i] = Chars[j];
Chars[j] = temp;
				}

			}
		}
		for(int k=0; k<Chars.length; k++)
		{
			System.out.print(Chars[k]);
		}
	}
}
