package sef.module3.activity;

import java.util.Scanner;

public class LargestBetween3Numbers {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		int num1,num2,num3;
				
		System.out.print("Enter a Number:");
		num1 = enter.nextInt();
		
		System.out.print("Enter another Number:");
		num2 = enter.nextInt();
		
		System.out.print("Enter another Number:");
		num3 = enter.nextInt();
		
		System.out.println();
		
		
		/**
		 * 
		 * Abaixo, o primeiro comando if testa se 
		 * os n�meros inseridos via teclado s�o todos diferentes.
		 * Caso positivo, o if interno ser� executado e testado,
		 * retornando o maior valor entre eles. Caso contr�rio,
		 * o maior n�o ser� testado devido ao fato de que no m�nimo
		 * dois valores ser�o iguais. 
		 
		 */
		
		
		if((num1 != num2) && (num1 != num3) && (num2 != num3)) {
		
			if((num1 > num2) && (num1 > num3)) {
				
				System.out.print("The largest number between three is: "+num1);
				
			}else if((num2 > num1) && (num2 > num3)) {
				
				System.out.print("The largest number between three is: "+num2);
				
			}else {
				
				System.out.print("The largest number between three is: "+num3);
				
			}
			
		}else {
			
			System.out.print("There are either 2 or 3 equal numbers");
			
		}
		
			
		enter.close();
			
	}	
	
	
	
}
	
	

