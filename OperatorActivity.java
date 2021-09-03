package sef.module3.activity;

import java.util.Scanner;

/**
 * @author FelipeXavier
 *
 */
public class OperatorActivity {

	public static void main(String[] args) {
		
		int num1,num2;
		int res;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write a Number:");
		num1 = input.nextInt();
		
		System.out.print("Write another Number:");
		num2 = input.nextInt();
		
		res = num1 - num2;      // Difference Between Numbers
		
		System.out.println();
		System.out.println(num1+" - "+num2+" = "+res);
		
	}

}
