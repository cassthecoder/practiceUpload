package com.cassandramatos.week1;

public class WeekOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 32; // 32 bit of storage
		int Age = 34;
		//long extremely large value 64 bit of storage
		//short like integer 16 bit of storage (-32,768 to 32,767)
		//byte is 8 bits (-128 to 127)
		
		//double up to 15/16 decimal places - larger range
		//float up to 6/7 decimal places - precision decimal
		
		boolean isSunny = false;
		
		char example = 'a';
		
		String name = "Cassandra";
		
		int numberOne = 45;
		int numberTwo = 27;
	int sum = numberOne + numberTwo;
//		System.out.println(sum);
//		int difference = numberOne - numberTwo;
//		System.out.println(difference);
		int product = numberOne * numberTwo;
		int quotient = numberOne / numberTwo;
		int remainder = numberOne % 2;
		System.out.println(quotient);
		System.out.println(remainder);
		
		boolean isEven = remainder == 0; //false
		System.out.println(isEven);
		
		boolean isCondition = numberOne != 45;
		
		int counter = 1;
		int newSum = --counter + sum; // 0 + 72
		int newSumAgain = counter-- + sum; // 0 + 72
		//counter = -1
		
		if(sum > 78 && numberOne < 90 && quotient == 67) { // false
			//action here 
		}
		else {
			
		}
		
		boolean isSomething = (sum > 78 && numberOne < 90) || quotient == 67; //true


		
		//Java follows mathematically order of operations PEMDAS
		
//		String numberStringOne = "45";
//		String numberStringTwo = "27";
//		String sumString = numberStringOne + numberStringTwo;
//		System.out.println(sumString);
//		
//		String message = "The sum of these numbers are";
//		System.out.println(message + " " + sum);
		
		
		
	}

}
