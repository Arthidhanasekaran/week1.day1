package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =13;
		boolean isPrime = false;
		
		for (int i = 2; i <= num/2; i++) {
			float rem = num%i;
			if (rem == 0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println("The number  " +num +" is a prime number");
		} else {
			System.out.println("The number  " +num +" is not a prime number");
		}
	}

}
