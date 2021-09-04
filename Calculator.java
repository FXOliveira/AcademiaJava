package sef.modulofelipe;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1,num2;
		int op;
					
		
		System.out.println("Calculator Menu");
		
		System.out.println(); //Pula Linha //
		
		System.out.println("1 - ADD");
		System.out.println("2 - SUBTRACT"); 
		System.out.println("3 - MULTIPLY");
		System.out.println("4 - DIVIDE");
		
		System.out.println();
		
		System.out.print("Choose a number:");
		num1 = input.nextInt();
		
		System.out.print("Choose another number:");
		num2 = input.nextInt();
		
		
		System.out.println();
		
		System.out.print("Choose one option above:");
		op = input.nextInt();
		
		System.out.println();
		
		
		
		System.out.println();
		
		switch (op) {
		
			case 1: {
			
				System.out.print("ADD NUMBERS:");
				System.out.println();
				System.out.print(num1 + " + " + num2 + " = "+(num1 + num2));
				break;
				 
			}
			
			case 2: {
				
				System.out.print("SUBTRACT NUMBERS:");
				System.out.println();
				System.out.print(num1 + " - " + num2 + " = "+(num1 - num2));
				break;
				
			}
			
			case 3: {
				
				System.out.print("MULTIPLY NUMBERS:");
				System.out.println();
				System.out.print((num1 * num2 ) + (num1 - num2));
				break;
				
			}
			
			case 4: {
				
				System.out.print("DIVIDE NUMBERS:");
				System.out.println();
				System.out.println(num1 + " / " + num2 + " = "+(num1 / num2));
				System.out.print("Division Rest:"+(num1%num2));
				break;
				
			}
			
			
			default:
				
				System.out.print("There isn´t this option!!");
		}
		
	}

}
