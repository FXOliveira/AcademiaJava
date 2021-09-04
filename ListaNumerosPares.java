package sef.modulofelipe;

public class ListaNumerosPares {

	public static void main(String[] args) {
		
		int i = 2;
		int num = 0;
		
		do {
			
			if (num % i == 0) {
				
				System.out.print(num + "  ");
				
			}
			
			num++;
			
		}while(num<=10);
		
	}
	
}
