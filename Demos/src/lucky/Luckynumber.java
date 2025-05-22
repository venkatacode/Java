package lucky;

public class Luckynumber {
	public static void main(String[] args) {
		// write the logic to implement the solution

		int n = 1623;
		int temp=n;
		int Count = 0;
		double sum = 0;
		double rem = 0;
		while (n > 0) {
			rem = n % 10;
			// rem=Math.round(rem);
			if (Count % 2 == 0) {
				rem = Math.pow(rem, 2);
				sum = sum + rem;
				sum = Math.round(sum);
			}

			Count++;
			n = n / 10;
		}
		if (sum % 9 == 0) {
			System.out.println(temp + "is a lucky number");

		} else {
			System.out.println(temp+"Not a lucky number");
		}

	}
}