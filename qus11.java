public class qus11 {

	int s = 0;
	int t = 1;
	int i = 0;
void c_while() {
	while (i < 5) {
		s = s + i;
		int j = i;

		while (j > 0) {
			t = t + (j - 1);
			j--;
		}
		i++;
		s = s + t;
		System.out.println("T is " + t);
	}
	System.out.println("S is "+s);
}

	public static void main(String[] args) {
		qus11 obj = new qus11();
		obj.c_while();

	}

}
