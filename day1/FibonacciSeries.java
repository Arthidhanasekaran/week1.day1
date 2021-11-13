package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("The first number is : =" +firstNum);
		
		for (int i = 1; i <= range; i++) {
			
			System.out.print(firstNum + ",");
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
		}
	}

}
