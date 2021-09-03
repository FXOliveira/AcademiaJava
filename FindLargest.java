/**
 * 
 */
package sef.module3.activity;

import java.util.Scanner;

/**
 * @author FelipeXavier
 *
 */

public class FindLargest {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		int num1,num2;
		int largest;
		
		System.out.print("Enter a Number:");
		num1 = enter.nextInt();
		
		System.out.print("Enter another Number:");
		num2 = enter.nextInt();
		
		System.out.println();
		
		if(num1 > num2) {        //Check the largest number among them
			
			System.out.print("Largest:"+num1);
			
		}else if(num2>num1) {
			
			System.out.print("Largest:"+num2);
			
		}else {
			
			System.out.print("Numbers are Equals!!");
			
			//Both have the same value
			
		}
		
		enter.close();
		
	}
	
}
