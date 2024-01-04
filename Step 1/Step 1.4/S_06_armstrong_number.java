public class S_06_armstrong_number {

	public static boolean armstrongNumber(int n) {
		int power = (int) Math.log10(n) + 1;
		int sum = 0;
		int number = n;
		while (n > 0) {
			int lastDigit = n % 10;
			sum += (int) Math.pow(lastDigit, power);
			n /= 10;
		}
		return sum == number;
	}

	public static void main(String args[]) {
		int n = 153;

		System.out.println(armstrongNumber(n));
	}
}
