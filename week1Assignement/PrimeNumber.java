package week1Assignement;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		Boolean flag = false;

		if (num == 0 || num == 1) {
			System.out.println("Number is prime");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				} else {
					flag = true;

				}
			}

			if (flag) {
				System.out.println("Number is prime");
			} else
				System.out.println("Number is not prime");

		}

	}

}
