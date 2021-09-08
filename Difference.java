package activity2;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2;
		int diff;
		
		System.out.print("number:");
		num1 = input.nextInt();
		System.out.print("another number:");
		num2 = input.nextInt();
		
		diff = num1 - num2;
		
		System.out.println();
		System.out.print(num1 + "-" + num2 + "=" +diff);
		
		input.close();
		
	}
	
}
