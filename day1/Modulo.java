package week1.day1;

public class Modulo {
public static void main(String[] args) {
	int num = 15;
if (num%3==0 && num%5==0) {
		System.out.println("TRIZZ-FIZZ");
	}else if (num%3==0){
		System.out.println("TRIZZ");
	}else if (num%5==0) {
		System.out.println("FIZZ");
	}else {
		System.out.println("The number " +num +" is neither divided by 3 nor 5");
	}
}
}
